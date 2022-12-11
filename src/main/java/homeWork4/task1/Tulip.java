package homeWork4.task1;

public class Tulip extends Flower {

    private boolean hasLeaves;

    public Tulip(String name, String colour, int price, boolean hasLeaves) {
        super(name, colour, price);
        this.hasLeaves = hasLeaves;
    }

    @Override
    void calculatePrice(boolean isFresh) {

        if(isFresh && hasLeaves) {
            System.out.println("Ціна 1 свіжого тюльпана з листям = " + price * 1.2);
        }
        else {
            System.out.println("Ціна 1 несвіжого тюльпана без листя = " + price * 0.7);
        }
    }

    void describeTulip() {
        System.out.println("Ця квітка - " + name + ", колір - " + colour + (hasLeaves ? ", з листям" : ", без листя"));
    }
}
