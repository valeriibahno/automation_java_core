package homeWork19.factory;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class MainFactory {

    private static final Logger logger = Logger.getLogger(MainFactory.class);

    public static void main(String[] args) {

        FactoryCourses factoryCourses = new FactoryCourses();
        Courses javaCourse = factoryCourses.getTypePage("Java");
        Courses typeScriptCourse = factoryCourses.getTypePage("TypeScript");
        Courses pythonCourse = factoryCourses.getTypePage("Python");

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter name of course:");

        String name = scanner.next();

        if(name.equalsIgnoreCase("Java")) {
            logger.info("Full information about course 'Java':");
            javaCourse.getInfo();
            javaCourse.getPrice();
            javaCourse.getDuration();
        } else if (name.equalsIgnoreCase("TypeScript")) {
            logger.info("Full information about course 'TypeScript':");
            typeScriptCourse.getInfo();
            typeScriptCourse.getPrice();
            typeScriptCourse.getDuration();
        } else if (name.equalsIgnoreCase("Python")) {
            logger.info("Full information about course 'Python':");
            pythonCourse.getInfo();
            pythonCourse.getPrice();
            pythonCourse.getDuration();
        } else {
            logger.warn("You have entered non-existing course. Try to choose another course.");
        }
    }
}
