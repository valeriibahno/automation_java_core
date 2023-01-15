package homeWork9.task2;

import org.apache.log4j.Logger;

import java.util.*;

public class Main {

    private static final Logger logger = Logger.getLogger(homeWork9.task1.Main.class);

    public static void removeAccountForPerson(Map<Person, List<Account>> map, Person person, Account account) {

        for (Map.Entry<Person, List<Account>> item: map.entrySet()) {
            List<Account> lisOfAccounts = item.getValue();
            if(item.getKey().equals(person)) {
                lisOfAccounts.remove(account);
                map.replace(person, lisOfAccounts);
            }
        }
    }

    public static void removePerson(Map<Person, List<Account>> map, Person person) {

        Iterator<Map.Entry<Person, List<Account>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getKey().equals(person))
                iterator.remove();
        }
    }

    public static void main(String[] args) {

        Map<Person, List<Account>> map = new HashMap<>();
        Person p1 = new Person("Valerii", 33);
        Person p2 = new Person("Iryna", 18);
        Person p3 = new Person("Alex", 21);
        Person p4 = new Person("Olha", 25);

        Account a1 = new Account(11111);
        Account a2 = new Account(22222);
        Account a3 = new Account(33333);
        Account a4 = new Account(44444);

        List<Account> listForP1 = new ArrayList<>();
        listForP1.add(a1);
        listForP1.add(a2);
        List<Account> listForP2 = new ArrayList<>();
        listForP2.add(a3);
        listForP2.add(a4);
        List<Account> listForP3 = new ArrayList<>();
        listForP3.add(a1);
        listForP3.add(a3);
        List<Account> listForP4 = new ArrayList<>();
        listForP4.add(a2);
        listForP4.add(a4);

        map.put(p1, listForP1);
        map.put(p2, listForP2);
        map.put(p3, listForP3);
        map.put(p4, listForP4);

        logger.info("Created map: " + map + "\n");

        logger.info("=== Remove account from list into current person ===");
        removeAccountForPerson(map, p1, a2);
        logger.info("Result of removing a2 into p1: " + map + "\n");

        logger.info("=== Remove person from map ===");
        removePerson(map, p4);
        logger.info("Result of removing p4: " + map + "\n");

        logger.info("=== Show all map of persons and their accounts ===");
        logger.info("Final map: " + map);
    }
}
