package homeWork16.DAO.implementation;

import homeWork16.DAO.interfaces.EmployeeDAO;
import homeWork16.DAO.models.EmployeeEntity;
import homeWork16.config.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImplement implements EmployeeDAO {

    private static final String FIND_BY_NAME = "Select * From employee Where emp_fname=?";
    private static final String FIND_BY_DEPT_NUMBER = "Select * From employee Where dept_no=?";
    private static final String FIND_ALL = "Select * From employee";
    private static final String FIND_BY_ID = "Select * From employee Where emp_no=?";
    private static final String CREATE = "Insert employee (emp_no, emp_fname, emp_lname, dept_no, domicile) Values (?, ?, ?, ?, ?)";
    private static final String UPDATE = "Update employee Set emp_fname=?, emp_lname=? Where emp_no=?";
    private static final String DELETE = "Delete From employee Where emp_no=?";

    @Override
    public List<EmployeeEntity> findByName(String name) throws SQLException {
        List<EmployeeEntity> employees = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(FIND_BY_NAME)) {
            ps.setString(1, name);
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    employees.add(new EmployeeEntity(resultSet.getInt("emp_no"), resultSet.getString("emp_fname"), resultSet.getString("emp_lname"), resultSet.getString("dept_no"), resultSet.getString("domicile")));
                }
            }
        }
        return employees;
    }

    @Override
    public List<EmployeeEntity> findByDeptNumber(String deptNumber) throws SQLException {
        List<EmployeeEntity> employees = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(FIND_BY_DEPT_NUMBER)) {
            ps.setString(1, deptNumber);
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    employees.add(new EmployeeEntity(resultSet.getInt("emp_no"), resultSet.getString("emp_fname"), resultSet.getString("emp_lname"), resultSet.getString("dept_no"), resultSet.getString("domicile")));
                }
            }
        }
        return employees;
    }

    @Override
    public List<EmployeeEntity> findAll() throws SQLException {
        List<EmployeeEntity> employees = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();
        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(FIND_ALL)) {
                while (resultSet.next()) {
                    employees.add(new EmployeeEntity(resultSet.getInt("emp_no"), resultSet.getString("emp_fname"), resultSet.getString("emp_lname"), resultSet.getString("dept_no"), resultSet.getString("domicile")));
                }
            }
        }
        return employees;
    }

    @Override
    public List<EmployeeEntity> findById(Integer id) throws SQLException {
        List<EmployeeEntity> employees = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(FIND_BY_ID)) {
            ps.setInt(1, id);
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    employees.add(new EmployeeEntity(resultSet.getInt("emp_no"), resultSet.getString("emp_fname"), resultSet.getString("emp_lname"), resultSet.getString("dept_no"), resultSet.getString("domicile")));
                }
            }
        }
        return employees;
    }

    @Override
    public int create(EmployeeEntity entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(CREATE)) {
            ps.setInt(1, entity.getEmpNo());
            ps.setString(2, entity.getEmpFname());
            ps.setString(3, entity.getEmpLname());
            ps.setString(4, entity.getDeptNo());
            ps.setString(5, entity.getDomicile());
            return ps.executeUpdate();
        }
    }

    @Override
    public int update(EmployeeEntity entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE)) {
            ps.setString(1, entity.getEmpFname());
            ps.setString(2, entity.getEmpLname());
            ps.setInt(3, entity.getEmpNo());
            return ps.executeUpdate();
        }
    }

    @Override
    public int delete(Integer id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(DELETE)) {
            ps.setInt(1, id);
            return ps.executeUpdate();
        }
    }
}
