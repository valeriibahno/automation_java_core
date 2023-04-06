package homeWork16.services;

import homeWork16.DAO.implementation.WorksOnDaoImplement;
import homeWork16.DAO.models.WorksOnEntity;
import org.apache.log4j.Logger;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class QueriesForWorksOn {

    private static final Logger logger = Logger.getLogger(QueriesForWorksOn.class);

    WorksOnDaoImplement worksOnDaoImplement = new WorksOnDaoImplement();

    static Scanner scanner = new Scanner(System.in);

    private static WorksOnEntity createWorksOnEntity() {
        logger.info("Enter empNo of works_on:");
        int empNo = scanner.nextInt();
        logger.info("Enter projectNo of works_on:");
        String projectNo = scanner.next();
        logger.info("Enter job of works_on:");
        String job = scanner.next();
        logger.info("Enter enter_date of works_on (in format YYYY-MM-DD):");
        String date = scanner.next();
        Date enterDate = Date.valueOf(date);
        return new WorksOnEntity(empNo, projectNo, job, enterDate);
    }

    public void selectAllOfWorksOn() throws SQLException {
        List<WorksOnEntity> listWorksOn = worksOnDaoImplement.findAll();
        logger.info("Find all from table works_on");
        logger.info(String.format("%-8s %-10s %-10s %s", "emp_no", "project_no", "job", "enter_date"));
        for (WorksOnEntity worksOn: listWorksOn) {
            logger.info(worksOn);
        }
    }

    public void selectByIdProjectOfWorksOn() throws SQLException {
        logger.info("Enter id (project_No) of project");
        String id = scanner.next();
        logger.info("Find by id of project from table works_on");
        logger.info(String.format("%-8s %-10s %-10s %s", "emp_no", "project_no", "job", "enter_date"));
        List<WorksOnEntity> listWorksOn = worksOnDaoImplement.findById(id);
        for (WorksOnEntity worksOn: listWorksOn) {
            logger.info(worksOn);
        }
    }

    public void createWorksOn() throws SQLException {
        WorksOnEntity entity = createWorksOnEntity();
        logger.info("Add new worksOn to table works_on:");
        logger.info("New worksOn was created: " + ((worksOnDaoImplement.create(entity) == 1) ? "Yes" : "No"));
    }

    public void updateWorksOn() throws SQLException {
        WorksOnEntity entity = createWorksOnEntity();
        logger.info("Update row into table work_on:");
        logger.info("Row into table work_on was updated: " + ((worksOnDaoImplement.update(entity) == 1) ? "Yes" : "No"));
    }

    public void deleteWorksOn() throws SQLException {
        logger.info("Enter id (project_no) of employee in table work_on:");
        String projectNo = scanner.next();
        logger.info("Delete row into table work_on:");
        logger.info("Row into table work_on was deleted: " + ((worksOnDaoImplement.delete(projectNo) == 1) ? "Yes" : "No"));
    }
}
