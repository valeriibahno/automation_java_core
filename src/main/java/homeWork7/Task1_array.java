package homeWork7;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task1_array {

    private static final Logger logger = Logger.getLogger(Task1_array.class);

    public static void returnAllEnteredWords(String[] arrayWords) {

        for (String arrayAllWord : arrayWords) {
            logger.info("Entered word: " + arrayAllWord);
        }
    }

    public static void returnWordsStartWithS(String[] arrayWords){
            for (String arrayWord : arrayWords) {
                try {
                if (arrayWord == null) {
                    logger.info("This word is null");
                }
                else if (arrayWord.startsWith("s")) {
                    logger.info("Word, which started from 's': " + arrayWord);
                }
                } catch (NullPointerException e) {
                    logger.error("Array is empty!");
                }
            }
    }

    public static void returnWordsLengthMoreFiveLetters(String[] arrayWords) {
            for (String arrayWord : arrayWords) {
                try {
                if (arrayWord == null) {
                    logger.info("This word is null");
                }
                else if (arrayWord.length() > 5) {
                    logger.info("Word, which length more 5 letters: " + arrayWord);
                }
                } catch (NullPointerException e) {
                    logger.error("Array is empty!");
                }
            }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] arrayWords = new String[5];

        for (int i = 0; i < arrayWords.length; i++) {
            logger.info("Enter your word:");
            arrayWords[i] = scanner.next();
            if (arrayWords[i].equalsIgnoreCase("break")) {
                logger.info("You have entered last word!");
                break;
            }
        }

        logger.info("======== 1 method =============");
        returnAllEnteredWords(arrayWords);
        logger.info("======== 2 method =============");
        returnWordsStartWithS(arrayWords);
        logger.info("======== 3 method =============");
        returnWordsLengthMoreFiveLetters(arrayWords);
        logger.info("Program has finished");
    }
}
