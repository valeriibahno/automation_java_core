package homeWork4.task1;

public class Rose extends Flower{

    private boolean isSpiked;

    public boolean isSpiked() {
        return isSpiked;
    }

    public void setSpiked(boolean spiked) {
        isSpiked = spiked;
    }

    public Rose(String name, String colour, double price, boolean isSpiked) {
        super(name, colour, price);
        this.isSpiked = isSpiked;
    }

    @Override
    public double calculatePrice(boolean isFresh) {

        if(isFresh && isSpiked) {
            price = price * 1.5;
        }
        else {
            price = price * 0.8;
        }
        return price;
    }

    void describeRose() {
        System.out.println("This flower - " + name + ", colour - " + colour + (isSpiked ? ", with spikes" : ", without spikes"));
    }
}
