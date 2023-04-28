package homeWork13;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class Person {

    private @myAnnotation(column = "name person") String name;
    private @myAnnotation(column = "age person") int age;
    private int salary;
    private boolean isMarried;

    private static final Logger logger = Logger.getLogger(Person.class);

    public Person(String name, int age, int salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    @Override
    public String toString() {
        return "Person: [name = '" + name + "', age = '" + age + "', salary = '" + salary + "', isMarried = '" + isMarried + "']";
    }

    public double calculateSalary(int experience) {
        double salaryIndex = 0d;
        if(age > 25 && age <= 30 && experience == 2) {
            salaryIndex = salary * 1.1;
        } else if (age > 30 && age <= 45 && experience == 3) {
            salaryIndex = salary * 1.3;
        } else if (age > 45 && experience > 3) {
            salaryIndex = salary * 1.5;
        }
        logger.info("New salary = " + salaryIndex);
        return salaryIndex;
    }

    public void hasChild() {
        if(isMarried) {
            logger.info("Perhaps, person has child or children");
        } else {
            logger.info("Perhaps, person hasn't child or children");
        }
    }

    public void personInTeam(String teamName, int quantityEmployees) {
        if (teamName.equals("Alfa") && quantityEmployees > 5) {
            logger.info("Person: [name = '" + name + "', salary = '" + salary + "']");
        } else if (teamName.equals("Bravo") && quantityEmployees > 7) {
            logger.info("Person: [name = '" + name + "', salary = '" + salary + "']");
        } else if (teamName.equals("Charlie") && quantityEmployees > 10) {
            logger.info("Person: [name = '" + name + "', salary = '" + salary + "']");
        } else {
            logger.info("Person: [name = '" + name + "', salary = '" + salary + "']");
        }
    }

    public void myMethod(String a, int... args) {

        logger.info("myMethod - " + a + " and array: " + Arrays.toString(args));
    }

    public void myMethod(String... args) {

        logger.info("myMethod - array: " + Arrays.toString(args));
    }
}
