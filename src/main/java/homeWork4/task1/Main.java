package homeWork4.task1;

public class Main {

    public static void main(String[] args) {
        Rose rose = new Rose("rose", "red", 100, true);
        Rose rose2 = new Rose("rose", "red", 100, false);
        rose.describeRose();
        rose2.describeRose();
        System.out.println("The price of 1 fresh rose with spikes: " + rose.calculatePrice(true));
        System.out.println("The price of 1 stale rose: " + rose2.calculatePrice(true));

        System.out.println("============");

        Tulip tulip = new Tulip("tulip", "yellow", 80, true);
        Tulip tulip2 = new Tulip("tulip", "white", 80, false);
        tulip.describeTulip();
        tulip2.describeTulip();
        System.out.println("The price of 1 fresh tulip with leaves: " + tulip.calculatePrice(true));
        System.out.println("The price of 1 stale tulip without leaves: " + tulip2.calculatePrice(false));

        System.out.println("============");

        Chamomile chamomile = new Chamomile("chamomile", "white", 60, 17);
        Chamomile chamomile2 = new Chamomile("chamomile", "pink", 40, 10);
        Chamomile chamomile3 = new Chamomile("chamomile", "yellow", 40, 4);
        chamomile.describeChamomile();
        chamomile2.describeChamomile();
        chamomile3.describeChamomile();
        System.out.println("The price of 1 fresh large chamomile: " + + chamomile.calculatePrice(true));
        System.out.println("The price of 1 fresh medium chamomile: " + chamomile2.calculatePrice(true));
        System.out.println("The price of 1 stale small chamomile: " + chamomile3.calculatePrice(false));

        System.out.println("============");

        Peony peony = new Peony("peony", "white", 70, "green");
        Peony peony2 = new Peony("peony", "red", 90, "pale green");
        Peony peony3 = new Peony("peony", "yellow", 50, "yellow-green");
        peony.describePeony();
        peony2.describePeony();
        peony3.describePeony();
        System.out.println("The price of 1 fresh white peony: " + peony.calculatePrice(true));
        System.out.println("The price of 1 fresh red peony: " + peony2.calculatePrice(true));
        System.out.println("The price of 1 stale peony: " + peony3.calculatePrice(false));
    }
}
