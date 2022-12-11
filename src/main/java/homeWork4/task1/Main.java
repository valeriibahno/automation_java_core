package homeWork4.task1;

public class Main {

    public static void main(String[] args) {
        Rose rose = new Rose("роза", "червоний", 100, true);
        Rose rose2 = new Rose("роза", "червоний", 100, false);
        rose.describeRose();
        rose2.describeRose();
        rose.calculatePrice(true);
        rose2.calculatePrice(true);

        System.out.println("============");

        Tulip tulip = new Tulip("тюльпан", "жовтий", 80, true);
        Tulip tulip2 = new Tulip("тюльпан", "білий", 80, false);
        tulip.describeTulip();
        tulip2.describeTulip();
        tulip.calculatePrice(true);
        tulip2.calculatePrice(false);

        System.out.println("============");

        Chamomile chamomile = new Chamomile("ромашка", "біла", 60, 17);
        Chamomile chamomile2 = new Chamomile("ромашка", "рожева", 40, 10);
        Chamomile chamomile3 = new Chamomile("ромашка", "жовта", 40, 4);
        chamomile.describeChamomile();
        chamomile2.describeChamomile();
        chamomile3.describeChamomile();
        chamomile.calculatePrice(true);
        chamomile2.calculatePrice(true);
        chamomile3.calculatePrice(false);

        System.out.println("============");

        Peony peony = new Peony("піон", "білий", 70, "зелений");
        Peony peony2 = new Peony("піон", "червоний", 90, "блідно-зелений");
        Peony peony3 = new Peony("піон", "жовтий", 50, "жовто-зелений");
        peony.describePeony();
        peony2.describePeony();
        peony3.describePeony();
        peony.calculatePrice(true);
        peony2.calculatePrice(true);
        peony3.calculatePrice(false);
    }
}
