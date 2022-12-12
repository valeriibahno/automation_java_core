package homeWork3.task1;

public class Rectangle {

    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.length = 10;
        this.width = 5;
    }

    public void area() {
        System.out.println("Area of rectangle = " + length * width);
    }

    public void perimeter() {
        System.out.println("Perimeter of rectangle = " + (length + width) * 2);
    }
}
