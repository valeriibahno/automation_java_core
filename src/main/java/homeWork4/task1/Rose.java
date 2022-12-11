package homeWork4.task1;

public class Rose extends Flower{

    private boolean isSpiked;

    public Rose(String name, String colour, int price, boolean isSpiked) {
        super(name, colour, price);
        this.isSpiked = isSpiked;
    }

    @Override
    void calculatePrice(boolean isFresh) {

        if(isFresh && isSpiked) {
            System.out.println("Ціна 1 свіжої рози з шипами = " + price * 1.5);
        }
        else {
            System.out.println("Ціна 1 несвіжої рози = " + price * 0.8);
        }
    }

    void describeRose() {
        System.out.println("Ця квітка - " + name + ", колір - " + colour + (isSpiked ? ", з шипами" : ", без шипів"));
    }
}
