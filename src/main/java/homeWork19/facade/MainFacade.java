package homeWork19.facade;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class MainFacade {

    private static final Logger logger = Logger.getLogger(MainFacade.class);
    public static void main(String[] args) {

        BuyFacade buy = new BuyFacade();

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter username:");
        String username = scanner.next();

        logger.info("Enter name of course:");
        String nameCourse = scanner.next();

        buy.buyCourse(username, nameCourse);
    }
}
