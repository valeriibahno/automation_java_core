package homeWork10;

import org.apache.log4j.Logger;

import java.util.List;

public class Bank implements UserService<Account, User> {

    private User user;
    private List<? extends Account> accounts;

    private static final Logger logger = Logger.getLogger(Bank.class);

    public Bank(User user, List<? extends Account> accounts) {
        this.user = user;
        this.accounts = accounts;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<? extends Account> getAccounts() {
        return accounts;
    }

    public void setAccount(List<? extends Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Bank: [user = '" + user + "', account = '" + accounts + "']";
    }

    @Override
    public void countTaxUser(User user, List<? extends Account> account) {

        double taxes = 0d;
        for (Account a: account) {
            taxes = taxes + (a.getSum() * 0.05);
        }
        logger.info("Taxes of user '" + user.getName() + "': " + taxes);
    }
}
