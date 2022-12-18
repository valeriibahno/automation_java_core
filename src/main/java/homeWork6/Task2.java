package homeWork6;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task2 {

    private static final Logger logger = Logger.getLogger(Task2.class);

    public static void sumIntegers() {

        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;

        do {
            logger.info("Enter your number1:");
            number1 = scanner.nextInt();
            logger.info("Enter your number2:");
            number2 = scanner.nextInt();
            int result = number1 + number2;

            if(number1%2 == 0 && number2%2 == 0) {
                logger.info("Sum of number1 and number2 = " + result);
            }
            else {
                try {
                    throw new ArithmeticException("Your entered number1 or number2 is incorrect! Try next time.");
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
            }
        } while(number1%2 == 0 && number2%2 == 0);
        logger.error("Program will close!");
    }

    public static void main(String[] args) {

        logger.info("Program is starting");
        sumIntegers();
        logger.info("Program is finishing");
    }
}
