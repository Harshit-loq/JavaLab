import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (N): ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int x = a + b;
            a = b;
            b = x;
        }
    }
}
