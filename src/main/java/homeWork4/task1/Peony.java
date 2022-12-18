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
    public double calculatePrice(boolean isFresh) {

        if(isFresh && colour.equals("red")) {
            price = price * 1.25;
        }
        else if(isFresh && colour.equals("white")) {
            price = price * 1.1;
        }
        else {
            price = price * 0.4;
        }
        return price;
    }

    void describePeony() {
        System.out.println("This flower - " + name + ", colour - " + colour + ", leaf color - " + colourLeaves);
    }
}
