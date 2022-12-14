package homeWork5;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task2 {

    private static final Logger logger = Logger.getLogger(Task2.class);

//    б) Роздрукувати останній символ рядка.
    public static void printLastSymbolInText(String enteredText) {

        logger.info("Last symbol in entered text is: " + enteredText.charAt(enteredText.length() - 1));
    }

    //    в) Перевірити, чи закінчується ваша рядок підрядком "!!!".
    public static void verifyEndOfText(String enteredText, String endOfRow) {

        if(enteredText.contains(endOfRow)) {
            logger.info("End of row is true: " + enteredText.endsWith(endOfRow));
        }
        else {
            logger.error("Your entered text doesn't contain endOfRow");
        }
    }

    //    г) Перевірити, чи починається ваша рядок підрядком "I like".
    public static void verifyStartOfText(String enteredText, String startOfRow) {

        if(enteredText.contains(startOfRow)) {
            logger.info("Start of row is true: " + enteredText.startsWith(startOfRow));
        }
        else {
            logger.error("Your entered text doesn't contain startOfRow");
        }
//        System.out.println("Start of row is true: " + enteredText.startsWith(startOfRow));
    }

    //    д) Перевірити, чи містить ваша рядок підрядок "Java".
    public static void verifyContainsSubStringInText(String enteredText, String subString) {

        if(enteredText.contains(subString)) {
            logger.info("Your entered text contains substring '" + subString + "': " + enteredText.contains(subString));
        }
        else {
            logger.error("Your entered text doesn't contain substring");
        }
    }

    //e) Знайти позицію підрядка "Java" в рядку "I like Java !!!".
    public static void findPositionOfSubStringInText(String enteredText, String subString) {

        if(enteredText.contains(subString)) {
            logger.info("Position of substring in your entered text: " + enteredText.indexOf(subString));
        }
        else {
            logger.error("Your entered text doesn't contain substring");
        }
    }

    // ж) Вивести на екран введену стрічку замінивши всі символи "а" на "о".
    public static void replaceSymbolsInText(String enteredText, String from, String to) {

        if(enteredText.contains(from)) {
            logger.info("In your entered text were replaced symbols: " + enteredText.replace(from, to));
        }
        else {
            logger.error("Your entered text doesn't contain symbol for replacing");
        }
    }

    //    з) Перетворіть рядок до верхнього регістру.
    public static void upperCaseForText(String enteredText) {
        logger.info("Upper case for your entered text: " + enteredText.toUpperCase());
    }

    //    і) Перетворіть рядок до нижнього регістру.
    public static void lowerCaseForText(String enteredText) {
        logger.info("Lower case for your entered text: " + enteredText.toLowerCase());
    }

    //    к) Вирізати рядок Java c допомогою методу String.substring() .
    public static void cutSubStringFromText(String enteredText, String startSubstring, String endSubstring) {

        int startInt = enteredText.indexOf(startSubstring);
        int endInt = enteredText.indexOf(endSubstring);
        logger.info("Cut substring from your entered text: " + enteredText.substring(startInt, endInt));
    }


//    а) Користувач вводить стрічку використовуючи Scanner. Наприклад: "I like Java !!!".
//    б) Роздрукувати останній символ рядка.                                                    DONE
//    в) Перевірити, чи закінчується ваша рядок підрядком "!!!".                                DONE
//    г) Перевірити, чи починається ваша рядок підрядком "I like".                              DONE
//    д) Перевірити, чи містить ваша рядок підрядок "Java".                                     DONE
//    e) Знайти позицію підрядка "Java" в рядку "I like Java !!!".                              DONE
//    ж) Вивести на екран введену стрічку замінивши всі символи "а" на "о".                     DONE
//    з) Перетворіть рядок до верхнього регістру.                                               DONE
//    і) Перетворіть рядок до нижнього регістру.                                                DONE
//    к) Вирізати рядок Java c допомогою методу String.substring() .                            DONE

    public static void main(String[] args) {

        logger.debug("Enter your text:" );
        Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();

        printLastSymbolInText(enteredText);
        verifyEndOfText(enteredText, "!!!");
        verifyEndOfText(enteredText, "676");     // for false
        verifyStartOfText(enteredText, "I like");
        verifyContainsSubStringInText(enteredText, "Java");
        findPositionOfSubStringInText(enteredText, "Java");
        replaceSymbolsInText(enteredText, "a", "o");
        upperCaseForText(enteredText);
        lowerCaseForText(enteredText);
        cutSubStringFromText(enteredText, "l", "a");
    }
}
