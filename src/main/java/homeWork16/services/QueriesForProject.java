package homeWork16.services;

import homeWork16.DAO.implementation.ProjectDaoImplement;
import homeWork16.DAO.models.ProjectEntity;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class QueriesForProject {

    private static final Logger logger = Logger.getLogger(QueriesForProject.class);
    ProjectDaoImplement projectDaoImplement = new ProjectDaoImplement();

    static Scanner scanner = new Scanner(System.in);

    private static ProjectEntity createProjectEntity() {
        logger.info("Enter projectNo of project:");
        String projectNo = scanner.next();
        logger.info("Enter projectName of project:");
        String projectName = scanner.next();
        logger.info("Enter budget of project:");
        float budget = scanner.nextFloat();
        return new ProjectEntity(projectNo, projectName, budget);
    }

    public void selectAllOfProject() throws SQLException {
        List<ProjectEntity> listProjects = projectDaoImplement.findAll();
        logger.info("Find all from table project");
        logger.info(String.format("%-10s %-15s %s", "projectNo", "projectName", "budget"));
        for (ProjectEntity project: listProjects) {
            logger.info(project);
        }
    }

    public void selectByIdOfProject() throws SQLException {
        logger.info("Enter id (project_no) of project");
        String id = scanner.next();
        logger.info("Find by id from table project");
        logger.info(String.format("%-10s %-15s %s", "projectNo", "projectName", "budget"));
        List<ProjectEntity> listProjects = projectDaoImplement.findById(id);
        for (ProjectEntity project: listProjects) {
            logger.info(project);
        }
    }

    public void createProject() throws SQLException {
        ProjectEntity entity = createProjectEntity();
        logger.info("Add new project to table project:");
        logger.info("New project was created: " + ((projectDaoImplement.create(entity) == 1) ? "Yes" : "No"));
    }

    public void updateProject() throws SQLException {
        ProjectEntity entity = createProjectEntity();
        logger.info("Update project into table project:");
        logger.info("Project was updated: " + ((projectDaoImplement.update(entity) == 1) ? "Yes" : "No"));
    }

    public void deleteProject() throws SQLException {
        logger.info("Enter id (project_no) of project:");
        String projectNo = scanner.next();
        logger.info("Delete project from table project:");
        logger.info("Department was deleted: " + ((projectDaoImplement.delete(projectNo) == 1) ? "Yes" : "No"));
    }
}
