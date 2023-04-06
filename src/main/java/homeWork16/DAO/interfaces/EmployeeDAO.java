package homeWork16.DAO.interfaces;

import homeWork16.DAO.models.EmployeeEntity;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO extends GeneralDAO<EmployeeEntity, Integer> {

    List<EmployeeEntity> findByName(String name) throws SQLException;

    List<EmployeeEntity> findByDeptNumber(String deptNumber) throws SQLException;
}
