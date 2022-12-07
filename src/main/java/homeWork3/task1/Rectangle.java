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
        int area = this.length * this.width;
        System.out.println("Площа прямокутника = " + area);
    }

    public void perimeter() {
        int perimeter = (this.length + this.width) * 2;
        System.out.println("Периметр прямокутника = " + perimeter);
    }
}
