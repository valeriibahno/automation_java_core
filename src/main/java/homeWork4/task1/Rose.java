package homeWork4.task1;

public class Rose extends Flower{

    private boolean isSpiked;

    public boolean isSpiked() {
        return isSpiked;
    }

    public void setSpiked(boolean spiked) {
        isSpiked = spiked;
    }

    public Rose(String name, String colour, int price, boolean isSpiked) {
        super(name, colour, price);
        this.isSpiked = isSpiked;
    }

    @Override
    void calculatePrice(boolean isFresh) {

        if(isFresh && isSpiked) {
            System.out.println("The price of 1 fresh rose with spikes = " + price * 1.5);
        }
        else {
            System.out.println("The price of 1 stale rose = " + price * 0.8);
        }
    }

    void describeRose() {
        System.out.println("This flower - " + name + ", colour - " + colour + (isSpiked ? ", with spikes" : ", without spikes"));
    }
}
