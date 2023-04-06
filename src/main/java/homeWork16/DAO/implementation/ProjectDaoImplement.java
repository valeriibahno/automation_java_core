package homeWork16.DAO.implementation;

import homeWork16.DAO.interfaces.ProjectDAO;
import homeWork16.DAO.models.ProjectEntity;
import homeWork16.config.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectDaoImplement implements ProjectDAO {

    private static final String FIND_ALL = "Select * From project";
    private static final String FIND_BY_ID = "Select * From project Where project_no=?";
    private static final String CREATE = "Insert project (project_no, project_name, budget) Values (?, ?, ?)";
    private static final String UPDATE = "Update project Set project_name=?, budget=? Where project_no=?";
    private static final String DELETE = "Delete From project Where project_no=?";

    @Override
    public List<ProjectEntity> findAll() throws SQLException {
        List<ProjectEntity> projects = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();
        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(FIND_ALL)) {
                while (resultSet.next()) {
                    projects.add(new ProjectEntity(resultSet.getString("project_no"), resultSet.getString("project_name"), resultSet.getFloat("budget")));
                }
            }
        }
        return projects;
    }

    @Override
    public List<ProjectEntity> findById(String id) throws SQLException {
        List<ProjectEntity> projects = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(FIND_BY_ID)) {
            ps.setString(1, id);
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    projects.add(new ProjectEntity(resultSet.getString("project_no"), resultSet.getString("project_name"), resultSet.getFloat("budget")));
                }
            }
        }
        return projects;
    }

    @Override
    public int create(ProjectEntity entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(CREATE)) {
            ps.setString(1, entity.getProjectNo());
            ps.setString(2, entity.getProjectName());
            ps.setFloat(3, entity.getBudget());
            return ps.executeUpdate();
        }
    }

    @Override
    public int update(ProjectEntity entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE)) {
            ps.setString(1, entity.getProjectName());
            ps.setFloat(2, entity.getBudget());
            ps.setString(3, entity.getProjectNo());
            return ps.executeUpdate();
        }
    }

    @Override
    public int delete(String id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(DELETE)) {
            ps.setString(1, id);
            return ps.executeUpdate();
        }
    }
}
