package homeWork6.task3;

import org.apache.log4j.Logger;

public class Methods {

    private static final Logger logger = Logger.getLogger(Methods.class);

    public void plus(int number1, int number2) {

        if(number1 < 0 && number2 < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        logger.info("Sum = " + (number1 + number2));
    }

    public void minus(int number1, int number2) {

        if((number1 == 0 && number2 != 0) | (number1 != 0 && number2 == 0)) {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        logger.info("Subtraction = " + (number1 - number2));
    }

    public void multiply(int number1, int number2) {

        if(number1 == 0 && number2 == 0) {
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        logger.info("Multiplication = " + (number1 * number2));
    }

    public void divide(int number1, int number2) {

        if(number2 == 0) {
            try {
                throw new MyException();
            } catch (MyException e) {
                e.printStackTrace();
            }
            logger.info("Division by zero is impossible");
        }
        else {
            logger.info("Division = " + (double) number1 / number2);
        }
    }
}
