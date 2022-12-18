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
    public double calculatePrice(boolean isFresh) {

        if(isFresh && petals > 14) {
            price = price * 1.3;
        }
        else if(isFresh && petals > 6) {
            price = price * 1.2;
        }
        else {
            price = price * 0.5;
        }
        return price;
    }

    void describeChamomile() {
        System.out.println("This flower - " + name + ", colour - " + colour + ", the number of petals - " + petals);
    }
}
