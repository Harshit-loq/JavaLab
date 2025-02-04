import java.util.Scanner;
public class AreaOfTriangle{
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter the base of triangle: ");
       
       int b = scanner.nextInt();
       System.out.print("Enter the height of triangle: ");
       
       int h = scanner.nextInt();
       int area = b*h;
       System.out.print("The Areaf triangle: "+area/2);
   }
}
