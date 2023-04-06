package homeWork16.DAO.implementation;

import homeWork16.config.ConnectionManager;
import homeWork16.DAO.interfaces.DepartmentDAO;
import homeWork16.DAO.models.DepartmentEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoImplement implements DepartmentDAO {

    private static final String FIND_ALL = "Select * From department";
    private static final String FIND_BY_ID = "Select * From department Where dept_no=?";
    private static final String CREATE = "Insert department (dept_no, dept_name, location) Values (?, ?, ?)";
    private static final String UPDATE = "Update department Set dept_name=?, location=? Where dept_no=?";
    private static final String DELETE = "Delete From department Where dept_no=?";

    @Override
    public List<DepartmentEntity> findAll() throws SQLException {
        List<DepartmentEntity> departments = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();
        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(FIND_ALL)) {
                while (resultSet.next()) {
                    departments.add(new DepartmentEntity(resultSet.getString("dept_no"), resultSet.getString("dept_name"), resultSet.getString("location")));
                }
            }
        }
        return departments;
    }

    @Override
    public List<DepartmentEntity> findById(String id) throws SQLException {
        List<DepartmentEntity> departments = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(FIND_BY_ID)) {
            ps.setString(1, id);
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    departments.add(new DepartmentEntity(resultSet.getString("dept_no"), resultSet.getString("dept_name"), resultSet.getString("location")));
                }
            }
        }
        return departments;
    }

    @Override
    public int create(DepartmentEntity entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(CREATE)) {
            ps.setString(1, entity.getDeptNo());
            ps.setString(2, entity.getDeptName());
            ps.setString(3, entity.getLocation());
            return ps.executeUpdate();
        }
    }

    @Override
    public int update(DepartmentEntity entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE)) {
            ps.setString(1, entity.getDeptName());
            ps.setString(2, entity.getLocation());
            ps.setString(3, entity.getDeptNo());
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
