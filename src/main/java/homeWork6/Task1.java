package homeWork6;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task1 {

    private static final Logger logger = Logger.getLogger(Task1.class);

    public static void verifyIsIntegerEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        double number;

        do {
            logger.info("Enter your number:");
            number  = scanner.nextDouble();

            if(number % 2 == 0 && number % 1 == 0) {
                logger.info("Your entered number is even");
            }
            else if (number % 2 == 1 && number % 1 == 0) {
                logger.info("Your entered number is odd");
            }
            else {
                try {
                    throw new ArithmeticException("Your entered number is not integer");
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
            }
        } while(number%2 != 0 || number%1 != 0 || number%2 != 1);
        logger.error("Program will close!");
    }

    public static void main(String[] args) {

        logger.info("Program is starting");
        verifyIsIntegerEvenOrOdd();
        logger.info("Program is finishing");
    }

}
