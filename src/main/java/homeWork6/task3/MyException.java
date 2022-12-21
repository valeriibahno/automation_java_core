package homeWork6.task3;

import org.apache.log4j.Logger;

public class MyException extends Exception {

    private static final Logger logger = Logger.getLogger(MyException.class);
    public MyException() {
        super();
        logger.info("Division by zero is impossible");
    }
}
