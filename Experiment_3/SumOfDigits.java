import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int s = 0;

        while (n != 0) {
            s = s + n%10;
            n = n/10;
        }

        System.out.println("The sum of the digits is: " + s);
    }
}
