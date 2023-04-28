package homeWork19.facade;

import org.apache.log4j.Logger;

public class Course {

    private static Logger logger = Logger.getLogger(Course.class);

    void selectCourse(String nameCourse) {
        logger.info("User has selected " + nameCourse + " course.");
    }
}
