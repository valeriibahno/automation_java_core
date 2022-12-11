package homeWork4.task1;

public abstract class Flower {

    String name;
    String colour;
    int price;

    public Flower(String name, String colour, int price) {
        this.name = name;
        this.colour = colour;
        this.price = price;
    }

    abstract void calculatePrice(boolean isFresh);
}
