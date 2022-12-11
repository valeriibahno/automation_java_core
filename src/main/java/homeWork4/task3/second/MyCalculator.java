package homeWork4.task3.second;

import homeWork4.task3.first.Numerable;

import java.util.Scanner;

public class MyCalculator implements Numerable {

    private final int a;
    private final int b;

    public MyCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void plus() {
        System.out.println("Сума = " + (a + b));
    }

    @Override
    public void minus() {
        System.out.println("Віднімання = " + (a - b));
    }

    @Override
    public void multiply() {
        System.out.println("Множення = " + (a * b));
    }
    @Override
    public void divide() {

        if(b == 0) {
            System.out.println("Ділення на ноль неможливе");
        }
        else {
            System.out.println("Ділення = " + (double) a / b);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення a:");
        int a = scanner.nextInt();
        System.out.println("Введіть значення b:");
        int b = scanner.nextInt();

        MyCalculator myCalculator = new MyCalculator(a, b);
        myCalculator.plus();
        myCalculator.minus();
        myCalculator.multiply();
        myCalculator.divide();
    }
}
