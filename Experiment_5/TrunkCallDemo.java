import java.util.Scanner;
//Base class representing a generic TrunkCall
class TrunkCall{
    int duration;
    //Constructor to initialize duration
    public TrunkCall(int duration){
        this.duration = duration;
    }
    //Method to compute charge (to be overridden by subclasses)
    public double computeCharge(){
        return 0; //Default implementation, overridden by subclasses
    }
}
//Subclass representing an Ordinary TrunkCall
class OrdinaryTrunkCall extends TrunkCall{
    public OrdinaryTrunkCall(int duration){
        super(duration);
    }
    // Ordinary call charge: $1.0 per minute
    @Override
    public double computeCharge(){
        return duration * 1.00;
    }
}
//Subclass representing an Urgent TrunkCall
class UrgentTrunkCall extends TrunkCall{
    public UrgentTrunkCall(int duration){
        super(duration);
    }
    // Urgent call charge: $2.0 per minute
    @Override
    public double computeCharge(){
        return duration * 2.00;
    }
}
//Subclass representing an Lightning TrunkCall
class LightningTrunkCall extends TrunkCall{
    public LightningTrunkCall(int duration){
        super(duration);
    }
    // Lightning call charge: $3.0 per minute
    @Override
    public double computeCharge(){
        return duration * 3.00;
    }
}
public class TrunkCallDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter call duraation (in minutes): ");
        int duration = sc.nextInt();
        System.out.println("Select call type: 1. Ordinary 2. Urgent 3. Lightning");
        int choice = sc.nextInt();
        TrunkCall call;
        // Determine call type based on user input
        switch(choice){
            case 1 -> call = new OrdinaryTrunkCall(duration);
            case 2 -> call = new UrgentTrunkCall(duration);
            case 3 -> call = new LightningTrunkCall(duration);
            default -> {
                System.out.println("Invalid choice. Defaulting to Ordinary call.");
                call = new OrdinaryTrunkCall(duration);
            }
        }
        // Display total charge
        System.out.println("Total charge: $" + call.computeCharge());
        sc.close();
    }
}