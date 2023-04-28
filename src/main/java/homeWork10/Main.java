package homeWork10;

import org.apache.log4j.Logger;

import java.util.*;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        List<DebitAccount> debitAccountList = new ArrayList<>();
        debitAccountList.add(new DebitAccount("777", 70000.1));
        debitAccountList.add(new DebitAccount("888", 80000.2));

        List<CreditAccount> creditAccountList = new ArrayList<>();
        creditAccountList.add(new CreditAccount(999, 90000.3));
        creditAccountList.add(new CreditAccount(666, 60000.4));

        User userValerii = new User("Valerii", 33);
        User user1 = new User("Yrii", 38);
        User user2 = new User("Iryna", 18);
        User user3 = new User("Alex", 21);
        User user4 = new User("Olha", 25);
        List<User> users = new ArrayList<>();
        users.add(userValerii);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        Bank bank = new Bank(userValerii, debitAccountList);

        logger.info("Show all users: ");
        logger.info("List of users: " + bank.showAllUsers(users));

        logger.info("CreditAccounts: ");
        bank.showAllAccounts(creditAccountList);

        logger.info("DebitAccounts: ");
        bank.showAllAccounts(debitAccountList);

        logger.info("Taxes of user: ");
        bank.countTaxUser(userValerii, creditAccountList);
    }
}
