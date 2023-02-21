package homeWork16;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import homeWork16.services.QueriesForDepartment;
import homeWork16.services.QueriesForEmployee;
import homeWork16.services.QueriesForProject;
import homeWork16.services.QueriesForWorksOn;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.Scanner;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws SQLException {

        QueriesForDepartment queriesForDepartment = new QueriesForDepartment();
        QueriesForEmployee queriesForEmployee = new QueriesForEmployee();
        QueriesForProject queriesForProject = new QueriesForProject();
        QueriesForWorksOn queriesForWorksOn = new QueriesForWorksOn();

        Scanner sc = new Scanner(System.in);
        logger.info("You can choose one of actions:");
        logger.info("11 - Find all from table department");
        logger.info("12 - Find by id from table department");
        logger.info("13 - Create new department into table department");
        logger.info("14 - Update department into table department");
        logger.info("15 - Delete department from table department");

        logger.info("21 - Find all from table employee");
        logger.info("22 - Find by id from table employee");
        logger.info("23 - Create new employee into table employee");
        logger.info("24 - Update employee into table employee");
        logger.info("25 - Delete employee from table employee");

        logger.info("31 - Find all from table project");
        logger.info("32 - Find by id from table project");
        logger.info("33 - Create new project into table project");
        logger.info("34 - Update project into table project");
        logger.info("35 - Delete project from table project");

        logger.info("41 - Find all from table works_on");
        logger.info("42 - Find by id of employee from table works_on");
        logger.info("43 - Create new worksOn into table works_on");
        logger.info("44 - Update worksOn into table works_on");
        logger.info("45 - Delete worksOn from table works_on\n");

        String enterKey;
        do {
            logger.info("Choose your action:");
            enterKey = sc.next();

            try {
                switch (enterKey) {
                    case "11": queriesForDepartment.selectAllOfDepartment();
                    break;
                    case "12": queriesForDepartment.selectByIdOfDepartment();
                    break;
                    case "13": queriesForDepartment.createDepartment();
                    break;
                    case "14": queriesForDepartment.updateDepartment();
                    break;
                    case "15": queriesForDepartment.deleteDepartment();
                    break;

                    case "21": queriesForEmployee.selectEmployeeByName();
                    break;
                    case "22": queriesForEmployee.selectEmployeesByDepartNumber();
                    break;
                    case "23": queriesForEmployee.selectAllOfEmployee();
                    break;
                    case "24": queriesForEmployee.selectByIdOfEmployee();
                    break;
                    case "25": queriesForEmployee.createEmployee();
                    break;
                    case "26": queriesForEmployee.updateEmployee();
                    break;
                    case "27": queriesForEmployee.deleteEmployee();
                    break;

                    case "31": queriesForProject.selectAllOfProject();
                    break;
                    case "32": queriesForProject.selectByIdOfProject();
                    break;
                    case "33": queriesForProject.createProject();
                    break;
                    case "34": queriesForProject.updateProject();
                    break;
                    case "35": queriesForProject.deleteProject();
                    break;

                    case "41": queriesForWorksOn.selectAllOfWorksOn();
                    break;
                    case "42": queriesForWorksOn.selectByIdProjectOfWorksOn();
                    break;
                    case "43": queriesForWorksOn.createWorksOn();
                    break;
                    case "44": queriesForWorksOn.updateWorksOn();
                    break;
                    case "45": queriesForWorksOn.deleteWorksOn();
                    break;

                    default: logger.warn("You have entered incorrect action, please, try again or enter 'Q' for quitting of program");
                }
            } catch (MysqlDataTruncation ex) {
                logger.error("You have entered too long or incorrect value, which can't add to the special cell in table");
                ex.printStackTrace();
            }
        } while (!enterKey.equalsIgnoreCase("Q"));

        logger.info("Thanks for using our program! Have a great day! :)");
    }
}
