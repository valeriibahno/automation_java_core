package homeWork7.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Months {

    JANUARY(31, Seasons.WINTER),
    FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),
    JUNE(30, Seasons.SUMMER),
    JULY(31, Seasons.SUMMER),
    AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30, Seasons.AUTUMN),
    OCTOBER(31, Seasons.AUTUMN),
    NOVEMBER(30, Seasons.AUTUMN),
    DECEMBER(31, Seasons.WINTER);

    private int days;
    private Seasons seasons;

    Months(int days, Seasons seasons) {
        this.days = days;
        this.seasons = seasons;
    }

    public int getDays() {
        return days;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    public static List<Months> getMonthsInSeason(Seasons season) {
        List<Months> listMonths = new ArrayList<>();
        switch (season) {
            case WINTER:
                listMonths = Arrays.asList(Months.DECEMBER, Months.JANUARY, Months.FEBRUARY);
                break;
            case SPRING:
                listMonths = Arrays.asList(Months.MARCH, Months.APRIL, Months.MAY);
                break;
            case SUMMER:
                listMonths = Arrays.asList(Months.JUNE, Months.JULY, Months.AUGUST);
                break;
            case AUTUMN:
                listMonths = Arrays.asList(Months.SEPTEMBER, Months.OCTOBER, Months.NOVEMBER);
                break;
            default:
                System.out.println("You entered fault month");
        }
        return listMonths;
    }

//    public static List<Months> getMonthsWithEqualDays(Months month) {
//
//        List<Months> listMonths = new ArrayList<>();
//        for (int i = 0; i < Months.values().length; i++) {
//            if(month.getDays() == 30) {
//                listMonths = Arrays.asList(Months.APRIL, Months.JUNE, Months.SEPTEMBER, Months.NOVEMBER);
//            } else if (month.getDays() == 31) {
//                listMonths = Arrays.asList(Months.JANUARY, Months.MARCH, Months.MAY, Months.JULY, Months.AUGUST, Months.OCTOBER, Months.DECEMBER);
//            } else if (month.getDays() == 28) {
//                listMonths = Arrays.asList(Months.FEBRUARY);
//            } else {
//                listMonths = null;
//            }
//        }
//        return listMonths;
//    }
}
