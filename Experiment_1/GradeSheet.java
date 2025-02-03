import java.util.Scanner;
public class GradeSheet{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNo = scanner.nextLine();

        System.out.print("Enter marks for Mathematics: ");
        int mathMarks = scanner.nextInt();

        System.out.print("Enter marks for Physics: ");
        int physicsMarks = scanner.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistryMarks = scanner.nextInt();

        int total = mathMarks + physicsMarks + chemistryMarks;
        double percentage = total / 3.0;

        System.out.println("\n******************************************");
        System.out.println("*               Grade Sheet              *");
        System.out.println("******************************************");
        System.out.println("* Name: " + name + "                         *");
        System.out.println("* Roll No: " + rollNo + "                           *");
        System.out.println("*----------------------------------------*");
        System.out.println("* Subject             Marks              *");
        System.out.println("*----------------------------------------*");
        System.out.println("* Mathematics         " + mathMarks + "                 *");
        System.out.println("* Physics             " + physicsMarks + "                 *");
        System.out.println("* Chemistry           " + chemistryMarks + "                 *");
        System.out.println("*----------------------------------------*");
        System.out.println("* Total               " + total + "                *");
        System.out.printf("* Percentage          %.2f%%             *\n", percentage);
        System.out.println("******************************************");
    }
}
