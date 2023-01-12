package homeWork7.task3;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Laptop {

    private static final Logger logger = Logger.getLogger(Laptop.class);
    private String model;
    private double price;

    public Laptop(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop: [model = '" + model + "', price = '" + price + "']";
    }

    public static String getExpensiveModel(List<Laptop> listLaptops) {

        String expensiveModel = "";
        List<Double> listPrices = new ArrayList<>();
        for (Laptop laptops: listLaptops) {
            listPrices.add(laptops.getPrice());
        }
        double maxPrice = Collections.max(listPrices);
        for (Laptop laptops: listLaptops) {
            if(laptops.getPrice() == maxPrice) {
                expensiveModel = laptops.getModel();
                break;
            }
        }
        return expensiveModel;
    }

    public static void printAllPricesLaptops(List<Laptop> listLaptops) {

        List<Double> pricesMacbooks = new ArrayList<>();
        for (Laptop laptops: listLaptops) {
            if (laptops.getModel().contains("Macbook")) {
                pricesMacbooks.add(laptops.getPrice());
            }
        }
        logger.info("Prices all Macbooks" + pricesMacbooks);
    }

    public static void printLaptopsOnSale(List<Laptop> listLaptops) {

        List<Laptop> listLaptopsOnSale = new ArrayList<>();
        for (Laptop laptops: listLaptops) {
            if (laptops.getPrice() > 2000) {
                listLaptopsOnSale.add(new Laptop(laptops.getModel() + " ON SALE", laptops.getPrice() * 0.9));
            }
        }
        logger.info("All laptops with 'ON SALE’: " + listLaptopsOnSale);
        logger.info("All laptops without 'ON SALE’: " + listLaptops);
    }
}
