package homeWork19.factory;

import org.apache.log4j.Logger;

public class PythonCourse implements Courses {

    private final Logger logger = Logger.getLogger(PythonCourse.class);

    @Override
    public void getInfo() {
        logger.info("Learn important Python coding fundamentals and practice your new skills with real-world projects.");
    }

    @Override
    public void getPrice() {
        logger.info("This course costs $900");
    }

    @Override
    public void getDuration() {
        logger.info("Duration of this course is 5 months");
    }
}
