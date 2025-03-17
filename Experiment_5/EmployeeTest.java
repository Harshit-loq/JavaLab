import java.util.Scanner;
class Employee{
    String name;
    int empid;
    double salary;
    //Default Constructor
    public Employee(){
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }
    //Parameterized Constructor
    public Employee(String name, int empid, double salary){
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }
    //Method to return employee's name
    public String getName(){
        return name;
    }
    //Method to return employee's salary
    public double getSalary(){
        return salary;
    }
    //Methond to increase salary by given percentage
    public void increaseSalary(double percent){
        salary = salary + (salary * percent / 100);
    }
    // Method to display employee details
    public void display(){
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
// Subclass representing a Manager
class Manager extends Employee{
    String department;
    // Parameterized Constructor for manager
    public Manager(String name, int empid, double salary, String department){
        super(name, empid, salary);
        this.department = department;
    }
    //Overriding the display method to include department
    @Override
    public void display(){
        super.display();
        System.out.println("Department: " + department);
    }
}
//Main class to test the Employee and Manager functionalities
public class EmployeeTest{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Taking user input for employee details
        System.out.println("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.println("Enter Employee Id: ");
        int empId = scanner.nextInt();
        System.out.println("Enter Employee Salary: ");
        double empSalary = scanner.nextDouble();
        Employee emp = new Employee(empName, empId, empSalary);
        emp.display();
        System.out.println("Enter the percentage by which you want to increase in salary: ");
        double percent = scanner.nextDouble();
        emp.increaseSalary(percent);
        System.out.println("Updated Salary after incrase: ");
        emp.display();
        scanner.nextLine();//consume newline
        System.out.println("Enter Manager Name: ");
        String mgrName = scanner.nextLine();
        System.out.println("Enter Manager Id: ");
        int mgrId = scanner.nextInt();      
        System.out.println("Enter Manager Salary: ");
        double mgrSalary = scanner.nextDouble();
        System.out.println("Enter Manager Department: ");
        String dept = scanner.nextLine();
        Manager mgr = new Manager(mgrName, mgrId, mgrSalary, dept);
        mgr.display();
        scanner.close();
    }
}