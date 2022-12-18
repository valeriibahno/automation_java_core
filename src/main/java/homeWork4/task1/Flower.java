package homeWork4.task1;

public abstract class Flower {

    String name;
    String colour;
    double price;

    public Flower(String name, String colour, double price) {
        this.name = name;
        this.colour = colour;
        this.price = price;
    }

    abstract double calculatePrice(boolean isFresh);
}
