package homeWork8.task2;

import java.util.Comparator;

public class CustomerByNameAndAge implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {

        int result = o1.getName().compareTo(o2.getName());

        if(result == 0) {
            result = o1.getAge().compareTo(o2.getAge());
        }
        return result;
    }
}
