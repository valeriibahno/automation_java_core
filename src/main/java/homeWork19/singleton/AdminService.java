package homeWork19.singleton;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class AdminService {

    private static final Logger LOG = Logger.getLogger(AdminService.class);

    private static AdminService adminService;

    private AdminService() {
    }

    public static AdminService getAdminService() {
        if (adminService == null) {
            adminService = new AdminService();
        }
        return adminService;
    }

    public void getPriceOfService(String nameService) {

        Integer priceOfAdminService = null;
        try {
            priceOfAdminService = Arrays.stream(Services.values()).filter(item -> item.getName().equalsIgnoreCase(nameService))
                    .map(Services::getPrice)
                    .mapToInt(Integer::intValue)
                    .findFirst()
                    .getAsInt();
        } catch (NoSuchElementException e) {
            LOG.error("You have entered incorrect service name, try again");
        }

        if (priceOfAdminService == null) {
            LOG.info("Price of admin service: N/A");
        } else {
            LOG.info("Price of admin service: " + priceOfAdminService + " ₴");
        }
    }
}
