package homeWork8.task1;

import java.util.Comparator;

public class PurchaseByDescQuantity implements Comparator<Purchase> {

    @Override
    public int compare(Purchase p1, Purchase p2) {
        return p1.getQuantity().compareTo(p2.getQuantity()) * (-1);
    }
}
