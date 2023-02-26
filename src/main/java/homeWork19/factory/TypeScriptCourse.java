package homeWork19.factory;

import org.apache.log4j.Logger;

public class TypeScriptCourse implements Courses {

    private final Logger logger = Logger.getLogger(TypeScriptCourse.class);

    @Override
    public void getInfo() {
        logger.info("Learn important TypeScript coding fundamentals and practice your new skills with real-world projects.");
    }

    @Override
    public void getPrice() {
        logger.info("This course costs $800");
    }

    @Override
    public void getDuration() {
        logger.info("Duration of this course is 4 months");
    }
}
