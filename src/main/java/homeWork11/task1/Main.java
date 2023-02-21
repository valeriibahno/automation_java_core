package homeWork11.task1;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Person p1 = new Person("Valerii", "Bahno", 33);
        Person p2 = new Person("Iryna", "Bila", 18);
        Person p3 = new Person("Alex", "Black", 21);
        Person p4 = new Person("Olha", "White", 25);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        FileInputOutput writeToFile = new FileInputOutput();

        logger.info("Write list of persons to file");
        writeToFile.writeListPersonToFile(persons);

        logger.info("Print list of persons to console");
        String fileName = "listPersons_2.txt";
        System.out.println("List persons - " + writeToFile.getListPersonsFromFile(fileName));
    }
}
