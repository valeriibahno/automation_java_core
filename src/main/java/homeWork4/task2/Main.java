package homeWork4.task2;

public class Main {

    public static void main(String[] args) {
        EmployeeFixSalary employeeFixSalary = new EmployeeFixSalary(10000);
        employeeFixSalary.printSalary();

        EmployeePerHour employeePerHour = new EmployeePerHour(160, 70);
        employeePerHour.printSalary();
    }
}
