import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class StudentRecordReader {
    public static void main(String[] args) {
        try {
            // Reading from file
            FileReader reader = new FileReader("student.txt");
            Scanner fileScanner = new Scanner(reader);
            
            System.out.println("Student Records:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            
            fileScanner.close();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file.");
        } finally {
            System.out.println("File reading operation attempted.");
        }
    }
}


