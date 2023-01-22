package homeWork10.task1;

import java.util.List;
import java.util.TreeSet;

public interface UserService <T extends Account, User> {

    default TreeSet<User> showAllUsers(List<User> users) {
        TreeSet<User> sortedUsers = new TreeSet<>(users);
        return sortedUsers;
    }

    default void showAllAccounts(List<? extends Account> accounts) {

        for (Account a: accounts) {
            System.out.println("Info of account: 'account' " + a.getId() + " has sum = " + a.getSum());
        }
    }

    void countTaxUser(User user, List<? extends Account> account);
}
