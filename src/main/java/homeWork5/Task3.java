package homeWork5;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task3 {

    private static final Logger logger = Logger.getLogger(Task3.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String maxLengthWord = word;
        String minLengthWord = word;

        int numberOfMaxPosition = 0;
        int numberOfMinPosition = 0;
        while (!word.equalsIgnoreCase("Stop")) {
            logger.info("Enter your word:");
            word = scanner.next();
            logger.info("User entered word: " + word);

            if(word.length() > maxLengthWord.length()) {
                maxLengthWord = word;
                numberOfMaxPosition++;
            }
            if(word.length() < maxLengthWord.length()) {
                minLengthWord = word;
                numberOfMinPosition++;
            }

            logger.info("The length of the longest entered word is: " + maxLengthWord.length());
            logger.info("Position of the longest entered word is: " + numberOfMaxPosition);
            logger.info("The length of the shortest entered word is: " + minLengthWord.length());
            logger.info("Position of the shortest entered word is: " + numberOfMinPosition);
        }
        logger.error("User entered 'stop' and program was stopped");
    }
}
