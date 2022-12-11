package homeWork4.task1;

public class Peony extends Flower {

    private String colourLeaves;

    public Peony(String name, String colour, int price, String colourLeaves) {
        super(name, colour, price);
        this.colourLeaves = colourLeaves;
    }

    @Override
    void calculatePrice(boolean isFresh) {

        if(isFresh && colour.equals("червоний")) {
            System.out.println("Ціна 1 свіжого червоного піону = " + price * 1.25);
        }
        else if(isFresh && colour.equals("білий")) {
            System.out.println("Ціна 1 свіжого білого піону = " + price * 1.1);
        }
        else {
            System.out.println("Ціна 1 несвіжого піону = " + price * 0.4);
        }
    }

    void describePeony() {
        System.out.println("Ця квітка - " + name + ", колір - " + colour + ", колір листя - " + colourLeaves);
    }
}
