package homeWork8.task2;

import org.apache.log4j.Logger;

import java.util.*;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static Set<Customer> getSetCustomers() {

        String name;
        int age;
        Scanner scanner = new Scanner(System.in);
        Set<Customer> setCustomers = new HashSet<>();
        int i = 1;
        do{
            logger.info("Enter info about customer " + i + ":");
            logger.info("Enter age of customer:");
            age = scanner.nextInt();
            logger.info("Enter name of customer:");
            name = scanner.next();
            if(name.equalsIgnoreCase("stop")) {
                break;
            }
            setCustomers.add(new Customer(name, age));
            i++;
        } while(!name.equalsIgnoreCase("stop"));

        return setCustomers;
    }

    public static void getLinkedHashSetCustomersByNameAndAge(Set<Customer> setCustomers) {

        LinkedHashSet<Customer> linkedHashSetCustomers = new LinkedHashSet<>(setCustomers);
        List<Customer> sortedList = new ArrayList<>(linkedHashSetCustomers);
        sortedList.sort(new CustomerByNameAndAge());

        logger.info("Customers sorted by name and age: " + sortedList);
    }

    public static void getSetCustomersByDescAge(Set<Customer> setCustomers) {

        TreeSet<Customer> customersSet = new TreeSet<>(new CustomerByDescAge());
        customersSet.addAll(setCustomers);
        logger.info("Customers sorted by desc age: " + customersSet);
    }

    public static void main(String[] args) {

        logger.info("Start program");

        Set<Customer> setCustomers = getSetCustomers();

        logger.info("Print hashSet of customers: " + setCustomers);

        logger.info("========For LinkedHashSet - sorted by name and age ==============");
        getLinkedHashSetCustomersByNameAndAge(setCustomers);

        logger.info("========For TreeSet - sorted by desc age ==============");
        getSetCustomersByDescAge(setCustomers);
    }
}
