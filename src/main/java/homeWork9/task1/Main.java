package homeWork9.task1;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Map<Person, Account> map = new HashMap<>();
        Person p1 = new Person("Valerii", 33);
        Person p2 = new Person("Iryna", 18);
        Person p3 = new Person("Alex", 21);
        Person p4 = new Person("Olha", 25);

        Account a1 = new Account(11111);
        Account a2 = new Account(22222);
        Account a3 = new Account(33333);
        Account a4 = new Account(44444);

        map.put(p1, a1);
        map.put(p2, a2);
        map.put(p3, a3);
        map.put(p4, a4);

        logger.info("Created map: " + map);
        logger.info("=== Added account to list/current person ===");
        map.put(p1, new Account(55555));
        logger.info("=== Remove/replace account into current person ===");
        map.replace(p4, null);
        logger.info("=== Remove person ===");
        map.remove(p3);
        logger.info("=== Show all map of persons and their accounts ===");
        logger.info("Final map: " + map);
    }
}
