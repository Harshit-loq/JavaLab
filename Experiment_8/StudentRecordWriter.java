import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class StudentRecordWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Taking user input
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter roll number: ");
            int rollNumber = scanner.nextInt();
            
            System.out.print("Enter grade: ");
            String grade = scanner.next();
            
            // Writing to file with append mode
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            writer.close();
            
            System.out.println("Student information saved successfully.");
        } catch (IOException e) {
            System.out.println("Error: Unable to write to file.");
        } finally {
            System.out.println("File operation attempted.");
            scanner.close();
        }
    }
}