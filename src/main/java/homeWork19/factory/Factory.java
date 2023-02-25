package homeWork19.factory;

public class Factory {

    public Actions getTypePage(String typePage) {
        if (typePage == null) {
            return null;
        }
        if (typePage.equalsIgnoreCase("PageOne")) {
            return new PageOne();
        }
        if (typePage.equalsIgnoreCase("PageSecond")) {
            return new PageSecond();
        }
        if (typePage.equalsIgnoreCase("PageThird")) {
            return new PageThird();
        }
        return null;
    }

}
