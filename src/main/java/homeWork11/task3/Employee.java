package homeWork11.task3;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private Integer id;
    private transient Integer salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: [name = '" + name + "', id = '" + id + "', salary = '" + salary + "']";
    }
}
