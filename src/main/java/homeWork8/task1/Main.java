package homeWork8.task1;

import org.apache.log4j.Logger;

import java.util.*;


public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static List<Purchase> getListPurchases() {

        String name;
        int quantity;
        Scanner scanner = new Scanner(System.in);
        List<Purchase> listPurchases = new ArrayList<>();
        int i = 1;
        do{
            logger.info("Enter info about purchase " + i + ":");
            logger.info("Enter quantity of purchase:");
            quantity = scanner.nextInt();
            logger.info("Enter name of purchase:");
            name = scanner.next();
            if(name.equalsIgnoreCase("stop")) {
                break;
            }
            listPurchases.add(new Purchase(name, quantity));
            i++;
        } while(!name.equalsIgnoreCase("stop"));

        return listPurchases;
    }

    public static void getTreeSetPurchasesByAlphabetically(List<Purchase> listPurchases) {

        logger.info("Purchases add into TreeSet");
        TreeSet<Purchase> purchaseTreeSet = new TreeSet<>(listPurchases);
        logger.info("TreeSet sorted by alphabetically: " + purchaseTreeSet);
    }

    public static void getLinkedHashSetPurchasesByEnteredOrder(List<Purchase> listPurchases) {

        logger.info("Purchases add into LinkedHashSet");
        LinkedHashSet<Purchase> purchaseLinkedHashSet = new LinkedHashSet<>(listPurchases);
        logger.info("LinkedHashSet of purchases sorted by entered order: " + purchaseLinkedHashSet);
    }

    public static void getTreeSetPurchasesByDescQuantity(List<Purchase> listPurchases) {

        logger.info("Purchases add into TreeSet");
        TreeSet<Purchase> purchaseTreeSet = new TreeSet<>(new PurchaseByDescQuantity());
        purchaseTreeSet.addAll(listPurchases);
        logger.info("TreeSet of purchases sorted by desc quantity: " + purchaseTreeSet);
    }

    public static void getHashSetPurchasesByHashValue(List<Purchase> listPurchases) {

        logger.info("Purchases add into HashSet");
        HashSet<Purchase> purchaseHashSet = new HashSet<>(listPurchases);
        logger.info("HashSet of purchases sorted by hash value: " + purchaseHashSet);

        for (Purchase item : purchaseHashSet) {
            logger.info("Purchase is - " + item);
            logger.info("HashCode of purchase is - " + item.hashCode());
        }
    }

    public static void main(String[] args) {

        logger.info("Start program");

        List<Purchase> listPurchases = getListPurchases();

        logger.info("========1 method by alphabetically ==============");
        getTreeSetPurchasesByAlphabetically(listPurchases);
        logger.info("========2 method by entered order==============");
        getLinkedHashSetPurchasesByEnteredOrder(listPurchases);
        logger.info("========3 method by desc order quantity==============");
        getTreeSetPurchasesByDescQuantity(listPurchases);
        logger.info("========4 method by hash value object==============");
        getHashSetPurchasesByHashValue(listPurchases);
    }
}
