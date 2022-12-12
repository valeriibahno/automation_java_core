package homeWork4.task3.second;

import homeWork4.task3.first.Numerable;

public class MyCalculator implements Numerable {

    private final int a;
    private final int b;

    public MyCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void plus() {
        System.out.println("Sum = " + (a + b));
    }

    @Override
    public void minus() {
        System.out.println("Subtraction = " + (a - b));
    }

    @Override
    public void multiply() {
        System.out.println("Multiplication = " + (a * b));
    }
    @Override
    public void divide() {

        if(b == 0) {
            System.out.println("Division by zero is impossible");
        }
        else {
            System.out.println("Division = " + (double) a / b);
        }
    }
}
