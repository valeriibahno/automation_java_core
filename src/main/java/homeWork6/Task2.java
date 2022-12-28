package homeWork6;

import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

    private static final Logger logger = Logger.getLogger(Task2.class);

    public static void sumIntegers() {

        Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;

        try {
            do {
                logger.info("Enter your number1:");
                number1 = scanner.nextDouble();
                logger.info("Enter your number2:");
                number2 = scanner.nextDouble();
                double result = number1 + number2;

                if ((number1 % 2 == 0 && number1 % 1 == 0 || number1 % 2 == 1) || (number2 % 2 == 0 && number2 % 1 == 0 || number2 % 2 == 1)) {
                    logger.info("Sum of number1 and number2 = " + result);
                } else {
                    try {
                        throw new ArithmeticException("Your entered number1 or number2 is incorrect! Try next time.");
                    } catch (ArithmeticException e) {
                        e.printStackTrace();
                    }
                }
            } while (number1 % 2 != 0 || number1 % 1 != 0 || number1 % 2 != 1 || number2 % 2 != 0 || number2 % 1 != 0 || number2 % 2 != 1);
        } catch (InputMismatchException e) {
            logger.error("You entered not double or integer value, that's why program will be closed!");
        }
            logger.error("Program will close!");
    }

    public static void main(String[] args) {

        logger.info("Program is starting");
        sumIntegers();
        logger.info("Program is finishing");
    }
}
