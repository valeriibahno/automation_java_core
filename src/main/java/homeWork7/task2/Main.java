package homeWork7.task2;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static boolean verifyIsMonthExists(String month) {

        boolean existsMonth = false;
        for (Months value: Months.values()) {
            if (month.equalsIgnoreCase(value.name())) {
                logger.info("Month '" + value + "' exists");
                existsMonth = true;
                break;
            }
        }
        return existsMonth;
    }

    public static void printMonthsWithSameSeason(String month) {

        Months[] months = Months.values();
        Seasons season = null;
        try {
            for (Months value : months) {
                if (month.equalsIgnoreCase(value.name())) {
                    season = value.getSeasons();
                }
            }
            logger.info("Months in the same season : " + Months.getMonthsInSeason(Seasons.valueOf(season.toString())));
        } catch (NullPointerException exception) {
            logger.error("Incorrect month");
        }
    }

    public static void printMonthsWithEqualsDays(String month) {

        List<Months> listMonths = new ArrayList<>();
        int countDays = 0;
        try {
            countDays = Months.valueOf(month.toUpperCase()).getDays();
        } catch (IllegalArgumentException exception) {
            logger.error("You entered wrong month");
        }

        if(countDays == 30) {
            listMonths = Arrays.asList(Months.APRIL, Months.JUNE, Months.SEPTEMBER, Months.NOVEMBER);
        } else if (countDays == 31) {
            listMonths = Arrays.asList(Months.JANUARY, Months.MARCH, Months.MAY, Months.JULY, Months.AUGUST, Months.OCTOBER, Months.DECEMBER);
        } else if (countDays == 28) {
            listMonths = Arrays.asList(Months.FEBRUARY);
        } else {
            listMonths = null;
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
        logger.info("Your entered month exists - " + verifyIsMonthExists(month));
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
