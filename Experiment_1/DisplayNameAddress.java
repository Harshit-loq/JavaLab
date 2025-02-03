import java.util.Scanner;

public class DisplayNameAddress{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.print("Enter your state: ");
        String state = scanner.nextLine();

        System.out.print("Enter your ZIP code: ");
        String zip = scanner.nextLine();

        System.out.println("\nName: " + name);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("ZIP: " + zip);
    }
}
