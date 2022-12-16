package homeWork5;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task2 {

    private static final Logger logger = Logger.getLogger(Task2.class);

    public static void printLastSymbolInText(String enteredText) {

        logger.info("Last symbol in entered text is: " + enteredText.charAt(enteredText.length() - 1));
    }

    public static void verifyIsEndsOfSubstringText(String enteredText) {

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter end of string: ");
        String endOfString = scanner.next();

        if(enteredText.contains(endOfString)) {
            logger.info("Verify is end of substring in your entered text: " + enteredText.endsWith(endOfString));
        }
        else {
            logger.error("Your entered text '" + enteredText + "' doesn't contain that end of substring - " + endOfString);
        }
    }

    public static void verifyIsStartOfSubstringText(String enteredText) {

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter start of string: ");
        String startOfString = scanner.next();

        if(enteredText.contains(startOfString)) {
            logger.info("Verify is start of substring in your entered text: " + enteredText.startsWith(startOfString));
        }
        else {
            logger.error("Your entered text '" + enteredText + "' doesn't contain that start of substring - " + startOfString);
        }
    }

    public static void verifyIsContainsSubstringInText(String enteredText) {

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter substring for verifying in the entered text: ");
        String substring = scanner.next();

        if(enteredText.contains(substring)) {
            logger.info("Your entered text contains substring '" + substring + "': " + enteredText.contains(substring));
        }
        else {
            logger.error("Your entered text '" + enteredText + "' doesn't contain substring - " + substring);
        }
    }

    public static void findPositionOfSubstringInText(String enteredText) {

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter substring for finding position in the entered text: ");
        String substring = scanner.next();

        if(enteredText.contains(substring)) {
            logger.info("Position of substring '" + substring + "' in your entered text: " + enteredText.indexOf(substring));
        }
        else {
            logger.error("Your entered text '" + enteredText + "' doesn't contain substring - " + substring);
        }
    }

    public static void replaceSymbolsInText(String enteredText) {

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter symbol, which you want to replace in the entered text: ");
        String fromSymbol = scanner.next();
        logger.info("Enter symbol, to which you want to replace in the entered text: ");
        String toSymbol = scanner.next();

        if(enteredText.contains(fromSymbol)) {
            logger.info("In your entered text '" + enteredText + "' were replaced symbols: " + enteredText.replace(fromSymbol, toSymbol));
        }
        else {
            logger.error("Your entered text '" + enteredText + "' doesn't contain symbol '" + fromSymbol + "' for replacing");
        }
    }

    public static void upperCaseForText(String enteredText) {
        logger.info("Upper case for your entered text: " + enteredText.toUpperCase());
    }

    public static void lowerCaseForText(String enteredText) {
        logger.info("Lower case for your entered text: " + enteredText.toLowerCase());
    }

    public static void cutSubstringFromText(String enteredText) {

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter beginIndex of the entered text: ");
        int startInt = scanner.nextInt();
        logger.info("Enter endIndex of the entered text: ");
        int endInt = scanner.nextInt();

        if(enteredText.length() >= endInt && endInt > startInt) {
            logger.info("From your entered text '" + enteredText + "' was cut substring: " + enteredText.substring(startInt, endInt));
        }
        else {
            logger.error("From your entered text '" + enteredText + "' doesn't cut substring from " + startInt + " to " + endInt + " position");
        }
    }

    public static void main(String[] args) {

        logger.debug("Enter your text:" );
        Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();

        printLastSymbolInText(enteredText);
        verifyIsEndsOfSubstringText(enteredText);
        verifyIsStartOfSubstringText(enteredText);
        verifyIsContainsSubstringInText(enteredText);
        findPositionOfSubstringInText(enteredText);
        replaceSymbolsInText(enteredText);
        upperCaseForText(enteredText);
        lowerCaseForText(enteredText);
        cutSubstringFromText(enteredText);
    }
}
