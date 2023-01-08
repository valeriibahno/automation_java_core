package homeWork8.task1;

public class Purchase implements Comparable<Purchase> {

    private String name;
    private Integer quantity;

    public Purchase(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Purchase: [name = '" + name + "', quantity = '" + quantity + "']";
    }

    @Override
    public int compareTo(Purchase o) {
        return this.name.compareTo(o.getName());
    }
}
