// Base class representing a generic worker
class Worker{
    String name;
    double salaryRate;

    // Constructor to initialize Worker attributes
    public Worker(String name, double salaryRate){
        this.name = name;
        this.salaryRate = salaryRate;
    }

    // Method to compute pay (to be overridden by subclasses)
    public double computePay(int hours){
        return 0; // Default implementation, overridden by subclasses
    }
}
// Subclass representing a Daily Worker
class DailyWorker extends Worker{

    public DailyWorker(String name, double salaryRate){
        super(name, salaryRate);
    }

    // Compute pay based on the number of days worked (assuming 8 hours per day)
    @Override
    public double computePay(int hours){
        int daysWorked = hours / 8; // Converting hours to days
        return daysWorked * salaryRate;
    }
}
// Subclass representing a Salaried Worker
class SalariedWorker extends Worker{

    public SalariedWorker(String name, double salaryRate){
        super(name, salaryRate);
    }

    // Salaried worker gets fixed pay for 40 hours per week, regardless of actual hours worked
    @Override
    public double computePay(int hours){
        return 40*salaryRate;
    }
}
// Main class to test the Worker salary calculations
public class WorkerDemo{
    public static void main(String[] args){
        // Creating instances of DailyWorker and SalariedWorker
        Worker dailyWorker = new DailyWorker("Harshit Singh Rautela", 80);
        Worker salariedWorker = new SalariedWorker("Aman Singh", 60);

        // Computing and displaying weekly pay for both workers
        System.out.println(dailyWorker.name + " 's Weekly pay: $" + dailyWorker.computePay(40));
        System.out.println(salariedWorker.name + " 's Weekly pay: $" + salariedWorker.computePay(40));
    }
} 
