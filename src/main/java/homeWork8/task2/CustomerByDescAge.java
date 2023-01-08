package homeWork8.task2;

import java.util.Comparator;

public class CustomerByDescAge implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getAge().compareTo(c2.getAge()) * (-1);
    }
}
