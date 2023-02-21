package homeWork11.task3;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serializer {

    private static final Logger logger = Logger.getLogger(Serializer.class);
    public static <T> void serialize(T employees, String fileName){

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/" + fileName))) {
            objectOutputStream.writeObject(employees);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserialize(String fileName) {

        Employee employee;
        List<Employee> listOfEmployees;

        if(fileName.equals("employee.txt")) {
            try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/" + fileName))) {
                employee = (Employee) objectInputStream.readObject();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            logger.info(employee);
        }

        if(fileName.equals("listEmployee.txt")) {
            try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/" + fileName))) {
                listOfEmployees = (ArrayList<Employee>) objectInputStream.readObject();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            logger.info(listOfEmployees);
        }
    }

    public static void main(String[] args) {

        Employee employeeValerii = new Employee("Valerii", 123456, 20000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Valerii", 111, 20000));
        employeeList.add(new Employee("Iryna", 222, 15000));
        employeeList.add(new Employee("Olha", 333, 13000));
        employeeList.add(new Employee("Max", 444, 15000));
        employeeList.add(new Employee("Anna", 555, 11000));

        String fileName = "employee.txt";
        String fileNameForList = "listEmployee.txt";

        logger.info("Serialization employee:");
        serialize(employeeValerii, fileName);
        logger.info("Object '" + employeeValerii.getClass().getSimpleName() + "' was serialized successfully!");

        logger.info("Deserialization employee:");
        logger.info("Result of deserialization object '" + employeeValerii.getClass().getSimpleName() + "': ");
        deserialize(fileName);

        logger.info("Serialization list of employees");
        serialize(employeeList, fileNameForList);
        logger.info("List of employees was serialized successfully!");

        logger.info("Deserialization list of employees");
        logger.info("Result of deserialization list of employees: ");
        deserialize(fileNameForList);
    }
}
