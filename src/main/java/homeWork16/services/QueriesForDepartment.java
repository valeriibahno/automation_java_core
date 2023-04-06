package homeWork16.services;

import homeWork16.DAO.implementation.DepartmentDaoImplement;
import homeWork16.DAO.models.DepartmentEntity;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class QueriesForDepartment {

    private static final Logger logger = Logger.getLogger(QueriesForDepartment.class);

    DepartmentDaoImplement departmentDaoImplement = new DepartmentDaoImplement();

    static Scanner scanner = new Scanner(System.in);

    private static DepartmentEntity createDepartmentEntity() {
        logger.info("Enter deptNo of department:");
        String deptNo = scanner.next();
        logger.info("Enter deptName of department:");
        String deptName = scanner.next();
        logger.info("Enter location of department:");
        String location = scanner.next();
        return new DepartmentEntity(deptNo, deptName, location);
    }

    public void selectAllOfDepartment() throws SQLException {
        List<DepartmentEntity> listDepartments = departmentDaoImplement.findAll();
        logger.info("Find all from table department");
        logger.info(String.format("%-10s %-15s %s", "dept_no", "dept_name", "location"));
        for (DepartmentEntity department: listDepartments) {
            logger.info(department);
        }
    }

    public void selectByIdOfDepartment() throws SQLException {
        logger.info("Enter id of department");
        String id = scanner.next();
        logger.info("Find by id from table department");
        logger.info(String.format("%-10s %-15s %s", "dept_no", "dept_name", "location"));
        List<DepartmentEntity> listDepartments = departmentDaoImplement.findById(id);
        for (DepartmentEntity department: listDepartments) {
            logger.info(department);
        }
    }

    public void createDepartment() throws SQLException {
        DepartmentEntity entity = createDepartmentEntity();
        logger.info("Add new department to table department:");
        logger.info("New department was created: " + ((departmentDaoImplement.create(entity) == 1) ? "Yes" : "No"));
    }

    public void updateDepartment() throws SQLException {
        DepartmentEntity entity = createDepartmentEntity();
        logger.info("Update department into table department:");
        logger.info("Department was updated: " + ((departmentDaoImplement.update(entity) == 1) ? "Yes" : "No"));
    }

    public void deleteDepartment() throws SQLException {
        logger.info("Enter deptNo of department:");
        String deptNo = scanner.next();
        logger.info("Delete department from table department:");
        logger.info("Department was deleted: " + ((departmentDaoImplement.delete(deptNo) == 1) ? "Yes" : "No"));
    }
}
