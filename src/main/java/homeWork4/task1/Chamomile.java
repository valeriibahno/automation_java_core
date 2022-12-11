package homeWork4.task1;

public class Chamomile extends Flower {

    private int petals;

    public Chamomile(String name, String colour, int price, int petals) {
        super(name, colour, price);
        this.petals = petals;
    }

    @Override
    void calculatePrice(boolean isFresh) {

        if(isFresh && petals > 14) {
            System.out.println("Ціна 1 свіжої великої ромашки = " + price * 1.3);
        }
        else if(isFresh && petals > 6) {
            System.out.println("Ціна 1 свіжої середньої ромашки = " + price * 1.2);
        }
        else {
            System.out.println("Ціна 1 несвіжої маленької ромашки = " + price * 0.5);
        }
    }

    void describeChamomile() {
        System.out.println("Ця квітка - " + name + ", колір - " + colour + ", кількість лепестів - " + petals);
    }
}
