package homeWork4.task1;

public class Peony extends Flower {

    private String colourLeaves;

    public String getColourLeaves() {
        return colourLeaves;
    }

    public void setColourLeaves(String colourLeaves) {
        this.colourLeaves = colourLeaves;
    }

    public Peony(String name, String colour, int price, String colourLeaves) {
        super(name, colour, price);
        this.colourLeaves = colourLeaves;
    }

    @Override
    void calculatePrice(boolean isFresh) {

        if(isFresh && colour.equals("red")) {
            System.out.println("The price of 1 fresh red peony = " + price * 1.25);
        }
        else if(isFresh && colour.equals("white")) {
            System.out.println("The price of 1 fresh white peony = " + price * 1.1);
        }
        else {
            System.out.println("The price of 1 stale peony = " + price * 0.4);
        }
    }

    void describePeony() {
        System.out.println("This flower - " + name + ", colour - " + colour + ", leaf color - " + colourLeaves);
    }
}
