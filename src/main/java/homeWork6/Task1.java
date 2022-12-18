package homeWork6;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task1 {

    private static final Logger logger = Logger.getLogger(Task1.class);

    public static void verifyIsIntegerEven() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            logger.info("Enter your number:");
            number = scanner.nextInt();

                if(number%2 == 0) {
                logger.info("Your entered number is even");
            }
            else {
                try {
                    throw new ArithmeticException("Your entered number is odd");
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
            }
        } while(number < 50);
        logger.error("Program will close!");
    }

    public static void main(String[] args) {
        logger.info("Program is starting");
        verifyIsIntegerEven();
        logger.info("Program is finishing");
    }

}
