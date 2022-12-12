package homeWork4.task1;

public class Tulip extends Flower {

    private boolean hasLeaves;

    public boolean isHasLeaves() {
        return hasLeaves;
    }

    public void setHasLeaves(boolean hasLeaves) {
        this.hasLeaves = hasLeaves;
    }

    public Tulip(String name, String colour, int price, boolean hasLeaves) {
        super(name, colour, price);
        this.hasLeaves = hasLeaves;
    }

    @Override
    void calculatePrice(boolean isFresh) {

        if(isFresh && hasLeaves) {
            System.out.println("The price of 1 fresh tulip with leaves = " + price * 1.2);
        }
        else {
            System.out.println("The price of 1 stale tulip without leaves = " + price * 0.7);
        }
    }

    void describeTulip() {
        System.out.println("This flower - " + name + ", colour - " + colour + (hasLeaves ? ", with leaves" : ", without leaves"));
    }
}
