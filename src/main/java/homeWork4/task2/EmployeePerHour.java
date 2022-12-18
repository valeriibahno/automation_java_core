package homeWork4.task2;

public class EmployeePerHour implements Salary {

    private int hours;
    private int salary;

    public EmployeePerHour(int hours, int salary) {
        this.hours = hours;
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void printSalary() {
        System.out.println("An hourly wage worker has a salary = " + salary * hours + " UAH");

    }
}
