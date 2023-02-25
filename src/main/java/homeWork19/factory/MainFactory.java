package homeWork19.factory;

public class MainFactory {

    public static void main(String[] args) {

        Factory factory = new Factory();

        Actions click1 = factory.getTypePage("PageOne");
        click1.click();

        Actions check2 = factory.getTypePage("PageSecond");
        check2.check();

        Actions input3 = factory.getTypePage("PageThird");
        input3.input();
    }
}
