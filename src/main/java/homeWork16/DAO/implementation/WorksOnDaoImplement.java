package homeWork16.DAO.implementation;

import homeWork16.DAO.interfaces.WorksOnDAO;
import homeWork16.DAO.models.WorksOnEntity;
import homeWork16.config.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WorksOnDaoImplement implements WorksOnDAO {

    private static final String FIND_ALL = "Select * From works_on";
    private static final String FIND_BY_ID_EMP = "Select * From works_on Where project_no=?";
    private static final String CREATE = "Insert works_on (emp_no, project_no, job, enter_date) Values (?, ?, ?, ?)";
    private static final String UPDATE = "Update works_on Set emp_no=?, job=?, enter_date=? Where project_no=?";
    private static final String DELETE = "Delete From works_on Where project_no=?";

    @Override
    public List<WorksOnEntity> findAll() throws SQLException {
        List<WorksOnEntity> worksOnList = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();
        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(FIND_ALL)) {
                while (resultSet.next()) {
                    worksOnList.add(new WorksOnEntity(resultSet.getInt("emp_no"), resultSet.getString("project_no"), resultSet.getString("job"), resultSet.getDate("enter_date")));
                }
            }
        }
        return worksOnList;
    }

    @Override
    public List<WorksOnEntity> findById(String idProject) throws SQLException {
        List<WorksOnEntity> worksOnList = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(FIND_BY_ID_EMP)) {
            ps.setString(1, idProject);
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    worksOnList.add(new WorksOnEntity(resultSet.getInt("emp_no"), resultSet.getString("project_no"), resultSet.getString("job"), resultSet.getDate("enter_date")));
                }
            }
        }
        return worksOnList;
    }

    @Override
    public int create(WorksOnEntity entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(CREATE)) {
            ps.setInt(1, entity.getEmpNo());
            ps.setString(2, entity.getProjectNo());
            ps.setString(3, entity.getJob());
            ps.setDate(4, (Date) entity.getEnterDate());
            return ps.executeUpdate();
        }
    }

    @Override
    public int update(WorksOnEntity entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE)) {
            ps.setInt(1, entity.getEmpNo());
            ps.setString(2, entity.getJob());
            ps.setDate(3, (Date) entity.getEnterDate());
            ps.setString(4, entity.getProjectNo());
            return ps.executeUpdate();
        }
    }

    @Override
    public int delete(String idProject) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(DELETE)) {
            ps.setString(1, idProject);
            return ps.executeUpdate();
        }
    }
}
