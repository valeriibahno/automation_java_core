package homeWork19.factory;

import org.apache.log4j.Logger;

public class PageSecond implements Actions {

    private final Logger logger = Logger.getLogger(PageOne.class);

    @Override
    public void click() {
        logger.info("User has clicked on the PageSecond");
    }

    @Override
    public void check() {
        logger.info("User has checked on the PageSecond");
    }

    @Override
    public void input() {
        logger.info("User has input on the PageSecond");
    }
}
