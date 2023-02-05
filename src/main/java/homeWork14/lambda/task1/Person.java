package homeWork14.lambda.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private int age;
    private String name;
    private LocalDate timestamp;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Person: [age = '" + age + "', name = '" + name + "', timestamp = '" + timestamp + "']";
    }

    public static List<Person> setDate(List<Person> list) {
        list.forEach(x -> {
            x.setTimestamp(LocalDate.now());
        });
        return list;
    }

    public static List<Integer> collectListOfLength(List<String> list) {
        List<Integer> listOfIntegers = new ArrayList<>();
        list.forEach(x -> {
            listOfIntegers.add(x.length());
        });
        return listOfIntegers;
    }
}
