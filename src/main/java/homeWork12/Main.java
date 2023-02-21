package homeWork12;

import org.apache.log4j.Logger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

        Class<Person> personClass = Person.class;

        logger.info("Point 1,2 - Print fields in the class that were annotated by custom annotation and their values in annotation");
        Field[] fields = personClass.getDeclaredFields();
        for (Field field: fields) {
            if(field.isAnnotationPresent(myAnnotation.class)) {
                logger.info("Field - " + field.getName() + ", value of annotation - " + field.getDeclaredAnnotation(myAnnotation.class).column());
            }
        }

        logger.info("Point 3 - Invoke method (three method with different parameters and return types)");
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class, int.class, boolean.class);
        Object instance = constructor.newInstance("Alex", 37, 10000, false);

        Method method = personClass.getDeclaredMethod("calculateSalary", int.class);
        method.invoke(instance, 3);

        Method method2 = personClass.getDeclaredMethod("hasChild");
        method2.invoke(instance);

        Method method3 = personClass.getDeclaredMethod("personInTeam", String.class, int.class);
        method3.invoke(instance, "Bravo", 8);

        logger.info("Point 4 - Set new value into field using reflection");
        Person person = new Person("Valerii", 33, 15000, true);
        logger.info("Age of created person = " + person.getAge());
        int ageNew = 25;
        Field fieldAge = personClass.getDeclaredField("age");
        fieldAge.setAccessible(true);
        fieldAge.setInt(person, ageNew);
        logger.info("New value of age of person = " + person.getAge());

        logger.info("Point 5 - Invoke myMethod(String a, int ... args) and myMethod(String … args)");

        int[] paramsInt = {1, 2, 3};
        Method myMethod1 = personClass.getDeclaredMethod("myMethod", String.class, int[].class);
        myMethod1.invoke(person, "test", paramsInt);

        String[] paramsString = new String[]{"one", "two", "three"};
        Method myMethod2 = personClass.getDeclaredMethod("myMethod", String[].class);
        myMethod2.invoke(person, (Object) paramsString);
    }
}
