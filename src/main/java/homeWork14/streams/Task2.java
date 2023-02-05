package homeWork14.streams;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    private static final Logger logger = Logger.getLogger(Task2.class);

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Iryna", 17, "female"));
        personList.add(new Person("Alex", 25, "female"));
        personList.add(new Person("Anna", 23, "female"));
        personList.add(new Person("Yrii", 40, "male"));
        personList.add(new Person("Valerii", 33 , "male"));
        personList.add(new Person("Max", 23 , "male"));
        personList.add(new Person("Volodymyr", 62 , "male"));
        personList.add(new Person("Ludmila", 57 , "female"));
        personList.add(new Person("Alex", 45 , "male"));

        logger.info("Select male conscripts (from 18 to 27 years old): " + personList.stream()
                                                                                .filter(x -> x.getSex().equals("male") && x.getAge() >= 18 && x.getAge() < 27)
                                                                                .collect(Collectors.toList()));

        logger.info("Find the average age among men: " + personList.stream()
                                                                .filter(x -> x.getSex().equals("male"))
                                                                .map(Person::getAge)
                                                                .mapToInt(Integer::intValue)
                                                                .average()
                                                                .getAsDouble());

        logger.info("Find the number of potentially able-bodied people: " + personList.stream()
                .filter(x -> (x.getSex().equals("male") && x.getAge() >= 18 && x.getAge() < 60) || (x.getSex().equals("female") && x.getAge() >= 18 && x.getAge() < 55))
                .count());

        logger.info("Sort a collection of people by name in reverse alphabetical order: " + personList.stream()
                                                                                            .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()) * (-1))
                                                                                            .collect(Collectors.toList()));

        logger.info("Sort a collection of people first by name and then by age: " + personList.stream()
                                                                                        .sorted(Comparator.comparing(Person::getName)
                                                                                                .thenComparing(Person::getAge))
                                                                                        .collect(Collectors.toList()));

        logger.info("Find the oldest person: " + personList.stream()
                                                            .sorted(Comparator.comparing(Person::getAge))
                                                            .skip(personList.size()-1)
                                                            .findFirst()
                                                            .get());

        logger.info("Find the youngest person: " + personList.stream()
                                                                .sorted(Comparator.comparing(Person::getAge))
                                                                .limit(1)
                                                                .findFirst()
                                                                .get());

        logger.info("Find out how many men there are: " + personList.stream()
                                                                        .filter(x -> x.getSex().equals("male"))
                                                                        .count());

        logger.info("Find out how many women there are: " + personList.stream()
                                                                            .filter(x -> x.getSex().equals("female"))
                                                                            .count());

        logger.info("Display all women whose name begins with 'A': " + personList.stream()
                                                                                    .filter(x -> x.getSex().equals("female") && x.getName().startsWith("A"))
                                                                                    .collect(Collectors.toList()));
    }
}
