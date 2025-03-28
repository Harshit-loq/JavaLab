
abstract class Employee {

    String name;
    String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    abstract double calculateSalary();

    abstract void displayDetails();
}

class Manager extends Employee {

    private final double fixedSalary;

    Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    @Override
    double calculateSalary() {
        return fixedSalary;
    }

    @Override
    void displayDetails() {
        System.out.printf("Name: %s, Role: %s, Salary: %.2f%n", name, role, calculateSalary());
    }
}

class Developer extends Employee {

    private final double hourlyWage;
    private final int hoursWorked;

    Developer(String name, double hourlyWage, int hoursWorked) {
        super(name, "Developer");
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

    @Override
    void displayDetails() {
        System.out.printf("Name: %s, Role: %s, Salary: %.2f%n", name, role, calculateSalary());
    }
}

public class EmployeeTest {

    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 80000);
        manager.displayDetails();

        Employee developer = new Developer("Bob", 50, 160);
        developer.displayDetails();
    }
}
