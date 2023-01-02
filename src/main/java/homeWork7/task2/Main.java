package homeWork7.task2;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    //https://github.com/AlexeyDolgov/JavaCore_Lesson-08/blob/fe5cbf86efd2ce5f60f17b5e2e58cb7ad6b4d2de/JavaCore_Lesson-08/src/ua/lviv/lgs/task8_1/Main.java#L288

    // https://www.baeldung.com/java-search-enum-values
    // https://github.com/KVova/Java_Core_lesson_8/blob/master/home-work-08/src/volodymyr/task1/seasons/Application.java

    private static final Logger logger = Logger.getLogger(Main.class);
//    Months[] months = Months.values();


    //Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб регістр букв був не важливим ).
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

    // Вивести всі місяці з такою ж порою року.
    public static void printMonthsWithSameSeason(String month) {

        Months[] months = Months.values();
        Seasons season = null;
        try {
            for (Months value : months) {
                if (month.equalsIgnoreCase(value.name())) {
                    season = value.getSeasons();
                }
            }
        System.out.println("Months in the same season : " + Months.getMonthsInSeason(Seasons.valueOf(season.toString())));
        } catch (NullPointerException exception) {
            System.out.println("Incorrect month");
        }
    }

    //Вивести всі місяці які мають таку саму кількість днів.
    public static void printMonthsWithEqualsDays(String month) {

//        System.out.println("Months with equals days - " + Months.getMonthsWithEqualDays(Months.valueOf(month.toUpperCase())));

        List<Months> listMonths;
        int countDays = 0;
        try {
            countDays = Months.valueOf(month.toUpperCase()).getDays();
        } catch (IllegalArgumentException exception) {
            System.out.println("You entered wrong month");
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
        System.out.println("Months with equals days - " + listMonths);
    }

    //Вивести на екран всі місяці які мають парну кількість днів.
    public static void printMonthsWithEvenDays() {

    }

    //Вивести на екран всі місяці які мають непарну кількість днів.
    public static void printMonthsWithOddDays() {

    }

    //Вивести на екран чи введений з консолі місяць має парну кількість днів.
    public static void verifyIsMonthHasEvenDays(String month) {

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter your month:");
        String month = scanner.next();

        logger.info("======== 1 method =============");
        System.out.println("Your entered month is " + verifyIsMonthExists(month));
        logger.info("======== 2 method =============");
//        System.out.println("Months in season is " + printMonthsWithSameSeason(month));
        printMonthsWithSameSeason(month);
        logger.info("======== 3 method =============");
        printMonthsWithEqualsDays(month);
//        logger.info("======== 4 method =============");
//        printMonthsWithEvenDays();
//        logger.info("======== 5 method =============");
//        printMonthsWithOddDays();
//        logger.info("======== 6 method =============");
//        verifyIsMonthHasEvenDays(month);




    }
}
