package homeWork16.services;

import homeWork16.DAO.implementation.EmployeeDaoImplement;
import homeWork16.DAO.models.EmployeeEntity;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class QueriesForEmployee {

    private static final Logger logger = Logger.getLogger(QueriesForEmployee.class);
    EmployeeDaoImplement employeeDaoImplement = new EmployeeDaoImplement();

    static Scanner scanner = new Scanner(System.in);

    private static EmployeeEntity createEmployeeEntity() {
        logger.info("Enter empNo of employee:");
        int empNo = scanner.nextInt();
        logger.info("Enter empFname of employee:");
        String empFname = scanner.next();
        logger.info("Enter empLname of employee:");
        String empLname = scanner.next();
        logger.info("Enter deptNo of employee:");
        String deptNo = scanner.next();
        logger.info("Enter domicile of employee:");
        String domicile = scanner.next();
        return new EmployeeEntity(empNo, empFname, empLname, deptNo, domicile);
    }

    public void selectEmployeeByName() throws SQLException {
        logger.info("Enter name of employee");
        String name = scanner.next();
        logger.info("Find employee by name from table employee");
        logger.info(String.format("%-8s %-15s %-15s %-15s %-15s", "emp_no", "emp_fname", "emp_lname", "dept_no", "domicile"));
        List<EmployeeEntity> listEmployees = employeeDaoImplement.findByName(name);
        for (EmployeeEntity employee: listEmployees) {
            logger.info(employee);
        }
    }

    public void selectEmployeesByDepartNumber() throws SQLException {
        logger.info("Enter deptNo of employees");
        String deptNo = scanner.next();
        logger.info("Find employees by departNumber from table employee");
        logger.info(String.format("%-8s %-15s %-15s %-15s %-15s", "emp_no", "emp_fname", "emp_lname", "dept_no", "domicile"));
        List<EmployeeEntity> listEmployees = employeeDaoImplement.findByDeptNumber(deptNo);
        for (EmployeeEntity employee: listEmployees) {
            logger.info(employee);
        }
    }

    public void selectAllOfEmployee() throws SQLException {
        List<EmployeeEntity> listEmployees = employeeDaoImplement.findAll();
        logger.info("Find all from table employee");
        logger.info(String.format("%-8s %-15s %-15s %-15s %-15s", "emp_no", "emp_fname", "emp_lname", "dept_no", "domicile"));
        for (EmployeeEntity employee: listEmployees) {
            logger.info(employee);
        }
    }

    public void selectByIdOfEmployee() throws SQLException {
        logger.info("Enter id (emp_no) of employee");
        int id = scanner.nextInt();
        logger.info("Find by id from table employee");
        logger.info(String.format("%-8s %-15s %-15s %-15s %-15s", "emp_no", "emp_fname", "emp_lname", "dept_no", "domicile"));
        List<EmployeeEntity> listEmployees = employeeDaoImplement.findById(id);
        for (EmployeeEntity employee: listEmployees) {
            logger.info(employee);
        }
    }

    public void createEmployee() throws SQLException {
        EmployeeEntity entity = createEmployeeEntity();
        logger.info("Add new employee to table Employee:");
        logger.info("New employee was created: " + ((employeeDaoImplement.create(entity) == 1) ? "Yes" : "No"));
    }

    public void updateEmployee() throws SQLException {
        EmployeeEntity entity = createEmployeeEntity();
        logger.info("Update employee into table employee:");
        logger.info("Employee was updated: " + ((employeeDaoImplement.update(entity) == 1) ? "Yes" : "No"));
    }

    public void deleteEmployee() throws SQLException {
        logger.info("Enter empNo of employee:");
        int empNo = scanner.nextInt();
        logger.info("Delete employee from table employee:");
        logger.info("Employee was deleted: " + ((employeeDaoImplement.delete(empNo) == 1) ? "Yes" : "No"));
    }
}
