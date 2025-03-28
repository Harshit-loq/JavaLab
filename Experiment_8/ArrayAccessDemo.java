import java.util.Scanner;

class ArrayAccessDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Taking user input for index
            System.out.print("Enter an index to access the array element: ");
            int index = scanner.nextInt();
            
            // Accessing array element
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter an index between 0 and 4.");
        } finally {
            System.out.println("Array access attempted.");
            scanner.close();
        }
    }
}

