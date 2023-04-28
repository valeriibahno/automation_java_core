package homeWork19.singleton;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class MainSingleton {

    private static final Logger LOG = Logger.getLogger(MainSingleton.class);

    public static void main(String[] args) {

        LOG.info("Enter name of service");

        Scanner scanner = new Scanner(System.in);
        String service = scanner.nextLine();

        AdminService.getAdminService().getPriceOfService(service);
    }
}
