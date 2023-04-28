package homeWork19.facade;

import org.apache.log4j.Logger;

public class User {

    private static final Logger logger = Logger.getLogger(User.class);

    void registration(String name) {
        logger.info("User " + name + " has registered on the site.");
    }

    void buyCourse(String name) {
        logger.info("User " + name + " has bought the course.");
    }
}
