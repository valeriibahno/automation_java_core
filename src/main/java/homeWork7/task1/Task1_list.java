package homeWork7.task1;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1_list {
    private static final Logger logger = Logger.getLogger(Task1_list.class);

    public static void returnAllEnteredWords(List<String> listAllWords) {
        for (String listAllWord : listAllWords) {
            logger.info("Entered word: " + listAllWord);
        }
    }

    public static void returnWordsStartWithS(List<String> listAllWords) {
        for (String listAllWord : listAllWords) {
            if(listAllWord.startsWith("s")) {
                logger.info("Word, which started from 's': " + listAllWord);
            }
        }
    }

    public static void returnWordsLengthMoreFiveLetters(List<String> listAllWords) {
        for (String listAllWord : listAllWords) {
            if (listAllWord.length() > 4) {
                logger.info("Word, which length more 5 letters: " + listAllWord);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> listWords = new ArrayList<>();
        String word;

        do {
            logger.info("Enter your word:");
            word = scanner.next();
            listWords.add(word);
        } while(!word.equals("break"));

        logger.info("======== 1 method =============");
        returnAllEnteredWords(listWords);
        logger.info("======== 2 method =============");
        returnWordsStartWithS(listWords);
        logger.info("======== 3 method =============");
        returnWordsLengthMoreFiveLetters(listWords);
        logger.info("Program has finished");
    }
}
