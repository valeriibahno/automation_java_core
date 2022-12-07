package homeWork3.task1;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(20, 10);

        System.out.println("For rectangle without parameters");
        rectangle1.area();
        rectangle1.perimeter();

        System.out.println("For rectangle with parameters");
        rectangle2.area();
        rectangle2.perimeter();
    }
}
