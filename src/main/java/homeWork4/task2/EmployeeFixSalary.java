package homeWork4.task2;

public class EmployeeFixSalary implements Salary {
    private int salary;

    public EmployeeFixSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void salary() {
        System.out.println("Працівник з фіксованою місячною зарплатою має зарплату = " + salary + " грн.");
    }
}
