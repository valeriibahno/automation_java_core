package homeWork4.task1;

public class Chamomile extends Flower {

    private int petals;

    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public Chamomile(String name, String colour, int price, int petals) {
        super(name, colour, price);
        this.petals = petals;
    }

    @Override
    void calculatePrice(boolean isFresh) {

        if(isFresh && petals > 14) {
            System.out.println("The price of 1 fresh large chamomile = " + price * 1.3);
        }
        else if(isFresh && petals > 6) {
            System.out.println("The price of 1 fresh medium chamomile = " + price * 1.2);
        }
        else {
            System.out.println("The price of 1 stale small chamomile = " + price * 0.5);
        }
    }

    void describeChamomile() {
        System.out.println("This flower - " + name + ", colour - " + colour + ", the number of petals - " + petals);
    }
}
