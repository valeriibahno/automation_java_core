package homeWork8.task1;

import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static Set<Purchase> getListPurchases() {

        logger.info("Start program");

        String name;
        int quantity;
        Scanner scanner = new Scanner(System.in);
        Set<Purchase> purchases = new HashSet<>();
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
            purchases.add(new Purchase(name, quantity));
            i++;
        } while(!name.equalsIgnoreCase("stop"));
        return purchases;
    }
    public static void main(String[] args) {

        logger.info("Start program");

        Set<Purchase> listPurchases = getListPurchases();
        System.out.println(listPurchases);

//        String name;
//        int quantity;
//        Scanner scanner = new Scanner(System.in);
//        List<Purchase> purchases = new ArrayList<>();
//        int i = 1;
//        do{
//            logger.info("Enter info about purchase " + i + ":");
//            logger.info("Enter quantity of purchase:");
//            quantity = scanner.nextInt();
//            logger.info("Enter name of purchase:");
//            name = scanner.next();
//            if(name.equalsIgnoreCase("stop")) {
//                break;
//            }
//            purchases.add(new Purchase(name, quantity));
//            i++;
//        } while(!name.equalsIgnoreCase("stop"));

//        logger.info("========1 method==============");
//        Methods.getListPurchasesByAlphabetically(listPurchases);
//        logger.info("========2 method==============");
//        Methods.getListPurchasesByEnteredOrder(listPurchases);
//        logger.info("========3 method==============");
//        Methods.getListPurchasesByDescOrderQuantity(listPurchases);
//        logger.info("========4 method==============");
//        Methods.getListPurchasesByHashValueObject(listPurchases);

    }
}
