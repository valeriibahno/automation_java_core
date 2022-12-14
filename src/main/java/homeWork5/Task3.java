package homeWork5;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task3 {

    private static final Logger logger = Logger.getLogger(Task3.class);

    //Ввести n слів з консолі, поки користувач не введе слово ‘Stop’. Знайти найдовше і найкоротше слово та вказати яким воно було введено(порядковий номер).
    //Кожна дія повинна інформативно логуватись!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String maxLengthWord = word;
        while (!word.equalsIgnoreCase("Stop")) {
            logger.info("Enter your word: \n");
            word = scanner.nextLine();
            logger.info("User entered word: " + word);
            if(word.length() > maxLengthWord.length()) {
                maxLengthWord = word;
            }
            logger.info("The longest word for now is: " + maxLengthWord);
            logger.info("The length of the entered word is: " + word.length());
            logger.info("The length of the longest entered word is: " + maxLengthWord.length());
        }
    }
}
