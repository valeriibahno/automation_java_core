package homeWork7.task2;

import org.apache.log4j.Logger;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void verifyIsMonthExists(String month) {

        boolean existsMonth = Stream.of(Months.values()).anyMatch(item -> item.name().equals(month.toUpperCase()));
        logger.info("Month: '" + month.toUpperCase() + "' exists: " + existsMonth);
    }

    public static void printMonthsWithSameSeason(String month) {

        Seasons season = null;
        List<Months> listMonths = new ArrayList<>();

        for (Months value : Months.values()) {
            if (month.equalsIgnoreCase(value.name())) {
                season = value.getSeasons();
            }
        }

        for (Months item: Months.values()) {
            if (season == item.getSeasons()) {
                listMonths.add(item);
            }
        }
        logger.info("Months in the same season : " + listMonths);
    }

    public static void printMonthsWithEqualsDays(String month) {

        List<Months> listMonths = new ArrayList<>();
        int countDays = 0;
        try {
            countDays = Months.valueOf(month.toUpperCase()).getDays();
        } catch (IllegalArgumentException exception) {
            logger.error("You entered wrong month");
        }

        for (Months item: Months.values()) {
            if (countDays == item.getDays()) {
                listMonths.add(item);
            }
        }
        logger.info("Months with equals days - " + listMonths);
    }

    public static void printMonthsWithEvenDays() {

        Months[] months = Months.values();
        List<Months> listMonths = new ArrayList<>();
        for (Months month : months) {
            if (month.getDays() % 2 == 0) {
                listMonths.add(month);
            }
        }
        logger.info("Months with even days: " + listMonths);
    }

    public static void printMonthsWithOddDays() {

        Months[] months = Months.values();
        List<Months> listMonths = new ArrayList<>();
        for (Months month : months) {
            if (month.getDays() % 2 != 0) {
                listMonths.add(month);
            }
        }
        logger.info("Months with odd days: " + listMonths);
    }

    public static boolean verifyIsMonthHasEvenDays(String month) {

        boolean IsMonthHasEvenDays = false;
        for (Months value: Months.values()) {
            if (month.equalsIgnoreCase(value.name()) && value.getDays()%2 == 0) {
                IsMonthHasEvenDays = true;
                break;
            }
        }
        return IsMonthHasEvenDays;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter your month:");
        String month = scanner.next();

        logger.info("======== 1 method =============");
        verifyIsMonthExists(month);
        logger.info("======== 2 method =============");
        printMonthsWithSameSeason(month);
        logger.info("======== 3 method =============");
        printMonthsWithEqualsDays(month);
        logger.info("======== 4 method =============");
        printMonthsWithEvenDays();
        logger.info("======== 5 method =============");
        printMonthsWithOddDays();
        logger.info("======== 6 method =============");
        logger.info("Your entered month has even days - " + verifyIsMonthHasEvenDays(month));
    }
}
