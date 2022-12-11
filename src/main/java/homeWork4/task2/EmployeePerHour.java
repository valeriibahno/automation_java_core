package homeWork4.task2;

public class EmployeePerHour implements Salary {

    private int hours;
    private int salary;

    public EmployeePerHour(int hours, int salary) {
        this.hours = hours;
        this.salary = salary;
    }

    @Override
    public void salary() {
        System.out.println("Працівник з погодинною зарплатою має зарплату = " + salary * hours + " грн.");

    }
}
