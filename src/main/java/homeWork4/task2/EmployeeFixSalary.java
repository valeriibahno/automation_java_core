package homeWork4.task2;

public class EmployeeFixSalary implements Salary {
    private int salary;

    public EmployeeFixSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void printSalary() {
        System.out.println("An employee with a fixed monthly salary has a salary = " + salary + " UAH");
    }
}
