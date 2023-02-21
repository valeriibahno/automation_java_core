package homeWork14.lambda.task1;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(18, "Iryna"));
        personList.add(new Person(25, "Olha"));
        personList.add(new Person(40, "Yrii"));
        personList.add(new Person(33, "Valerii"));

        logger.info("Started list of persons: " + personList);

        logger.info("Create lambda-function for setting date and print info about persons");
        logger.info("List of persons with timestamps: " + Person.setDate(personList));

        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Eleven", "Thirteen", "Eighteen");
        logger.info("Create lambda-function for creating new list of length strings");
        logger.info("New list of length strings : " + Person.collectListOfLength(listOfStrings));
    }
}
