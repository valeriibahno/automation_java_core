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
    public double calculatePrice(boolean isFresh) {

        if(isFresh && hasLeaves) {
            price = price * 1.2;
        }
        else {
            price = price * 0.7;
        }
        return price;
    }

    void describeTulip() {
        System.out.println("This flower - " + name + ", colour - " + colour + (hasLeaves ? ", with leaves" : ", without leaves"));
    }
}
