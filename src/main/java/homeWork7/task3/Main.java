package homeWork7.task3;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        logger.info("Start program");

        String model;
        double price;
        Scanner scanner = new Scanner(System.in);
        List<Laptop> listLaptops = new ArrayList<>();
        int i = 1;
        do{
            logger.info("Enter info about laptop " + i + ":");
            logger.info("Enter price of laptop:");
            price = scanner.nextDouble();
            logger.info("Enter model of laptop:");
            model = scanner.next();
            listLaptops.add(new Laptop(model, price));
            i++;
        } while(!model.equalsIgnoreCase("stop"));

        logger.info("========1 method==============");
        logger.info("Expensive model is " + Laptop.getExpensiveModel(listLaptops));
        logger.info("========2 method==============");
        Laptop.printAllPricesLaptops(listLaptops);
        logger.info("========3 method==============");
        Laptop.printLaptopsOnSale(listLaptops);
    }
}
