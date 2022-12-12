package homeWork4.task3.second;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value a:");
        int a = scanner.nextInt();
        System.out.println("Enter the value b:");
        int b = scanner.nextInt();

        MyCalculator myCalculator = new MyCalculator(a, b);
        myCalculator.plus();
        myCalculator.minus();
        myCalculator.multiply();
        myCalculator.divide();
    }
}
