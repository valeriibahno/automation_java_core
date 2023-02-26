package homeWork19.factory;

import org.apache.log4j.Logger;

public class JavaCourse implements Courses {

    private final Logger logger = Logger.getLogger(JavaCourse.class);

    @Override
    public void getInfo() {
        logger.info("Learn important Java coding fundamentals and practice your new skills with real-world projects.");
    }

    @Override
    public void getPrice() {
        logger.info("This course costs $700");
    }

    @Override
    public void getDuration() {
        logger.info("Duration of this course is 3 months");
    }
}
