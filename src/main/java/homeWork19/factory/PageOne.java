package homeWork19.factory;

import org.apache.log4j.Logger;

public class PageOne implements Actions {

    private final Logger logger = Logger.getLogger(PageOne.class);

    @Override
    public void click() {
        logger.info("User has clicked on the PageOne");
    }

    @Override
    public void check() {
        logger.info("User has checked on the PageOne");
    }

    @Override
    public void input() {
        logger.info("User has input on the PageOne");
    }
}
