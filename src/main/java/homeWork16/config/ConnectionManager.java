package homeWork16.config;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static final Logger logger = Logger.getLogger(ConnectionManager.class);

    private static final String URL = "jdbc:mysql://localhost:3306/forJDBC";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    private static Connection connection = null;

    private ConnectionManager() {
    }

    public static Connection getConnection() {
        if(connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException ex) {
                logger.info("SQLException: " + ex.getMessage());
                logger.info("SQLState: " + ex.getSQLState());
                logger.info("VendorError: " + ex.getErrorCode());
            }
        }
        return connection;
    }
}
