package homeWork1;

import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {

        // If you want to run only one specific task, you have to comment out the other tasks.
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    /** Find a sum of 1 + 2 + 3 +...+ n, where n - number entered from the keyboard by the user. */
    public static void task1() {

        System.out.println("--- Task 1 ---");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum of your numbers = " + sum);
        System.out.println("============================");
    }

    /** Organize continuous input of numbers until the user will enter 0.
     After entering 0, show on the console the count of numbers that have been introduced, their total sum and the arithmetic mean. */
    public static void task2() {

        System.out.println("--- Task 2 ---");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");

        int number;
        int sum = 0;
        int count = -1;

        do {
            number = scanner.nextInt();
            sum += number;
            count++;

        } while(number != 0);

        double average = (double)sum / count;

        System.out.println("Count of your numbers = " + count);
        System.out.println("Sum of your numbers = " + sum);
        System.out.println("Arithmetic mean of your numbers = " + average);
        System.out.println("============================");
    }

    /** There are integers from 35 to 87. Display on console those which give residue 1, 2 or 5 during dividing by 7. */
    public static void task3() {

        System.out.println("--- Task 3 ---");
        System.out.print("Integers, which give residue 1, 2 or 5 during dividing by 7: ");
        for (int i = 35; i <= 87; i++) {
            if(i%7 == 1 || i%7 == 2 || i%7 == 5) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n============================");
    }

    /** The user enters two numbers m and n, the program outputs a number that is closer to 10.
     For example, among the numbers 8.5 and 11.45, the closest to ten is 11.45. */
    public static void task4() {

        System.out.println("--- Task 4 ---");
        Scanner scanner = new Scanner(System.in);

        int ten = 10;

        System.out.println("Enter your number m: ");
        double m = scanner.nextDouble();
        System.out.println("Enter your number n: ");
        double n = scanner.nextDouble();

        double differenceM_ten = Math.abs(m - ten);
        double differenceN_ten = Math.abs(n - ten);

        if(differenceM_ten > differenceN_ten) {
            System.out.println("The closest to ten is " + n);
        }
        else if(differenceN_ten > differenceM_ten) {
            System.out.println("The closest to ten is " + m);
        }
        else {
            System.out.printf("Numbers %f and %f are both the closest to ten", m, n);
        }
        System.out.println("============================");
    }

    /** Create a string variable that will store the day of the week. Using the switch statement, make a schedule for a week.
     Depending on the day of the week, the user's screen displays what is scheduled for that day. */
    public static void task5() {

        System.out.println("--- Task 5 ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any day of the week: ");
        String day = scanner.next();

        System.out.println("My plan for " + day);
        switch (day) {
            case ("Monday"):
                System.out.println("On Monday I will plan to go to a shop.");
                break;
            case ("Tuesday"):
                System.out.println("On Tuesday I will plan to go to a store.");
                break;
            case ("Wednesday"):
                System.out.println("On Wednesday I will plan to go to a market.");
                break;
            case ("Thursday"):
                System.out.println("On Thursday I will plan to go to a gym.");
                break;
            case ("Friday"):
                System.out.println("On Friday I will plan to go to a club.");
                break;
            case ("Saturday"):
                System.out.println("On Friday I will plan to go to a beach.");
                break;
            case ("Sunday"):
                System.out.println("On Sunday I will plan to go shopping.");
                break;
            default:
                System.out.println("You have entered incorrect day, please, try again.");
        }
        System.out.println("============================");
    }

    /** Write a program for finding solutions to a quadratic equation ax^2 + bx + c = 0.
     The user enters a,b,c and receives solutions to the equation or message that there are none. */
    public static void task6() {

        System.out.println("--- Task 6 ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);

        if(discriminant == 0) {
            System.out.println("One root is " + x1);
        }
        else if(discriminant < 0) {
            System.out.println("Quadratic equation doesn't have solutions, because discriminant less zero = " + discriminant);
        }
        else {
            System.out.println("Two roots are :" + x1 + ", " + x2);
        }
        System.out.println("============================");
    }

    /** Write a program for calculating the area of a circle and the length of a circle. The user only enters the radius. */
    public static void task7() {

        System.out.println("--- Task 7 ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius as positive number:");
        double radius = scanner.nextDouble();
        if(radius < 0) {
            System.out.println("The radius can't be less than zero. Enter please only positive numbers!");
        }
        else {
            double areaCircle = Math.PI * Math.pow(radius, 2);
            double lengthCircle = 2 * Math.PI * radius;

            System.out.println("The area of a circle is " + areaCircle);
            System.out.println("The length of a circle is " + lengthCircle);
        }
        System.out.println("============================");
    }

    /** User enters integers. Print 'odd' if user enters odd number, print 'even' if user enters even number, quit the program if user enters 0.
     Users can enter as many numbers as they want. */
    public static void task8() {

        System.out.println("--- Task 8 ---");
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter your number:");
            number = scanner.nextInt();

            if(number == 0) {
                System.out.println("You have quit the program");
            }
            else if(number%2 == 0) {
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }
        } while(number != 0);
        System.out.println("============================");
    }
}

