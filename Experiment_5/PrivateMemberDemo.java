// Superclass with a private member 
class SuperClass { 
    private final int privateVar = 10; // Private member with final keyword 
    // Getter method to access private variable 
    public int getPrivateVar() { 
        return privateVar; 
    } 
} 
// Subclass trying to access private member 
class SubClass extends SuperClass { 
    public void display() { 
    // Trying to access privateVar directly (This will cause an error) 
    // System.out.println("Private Variable: " + privateVar); 
    // Uncommenting this will cause a compilation error 
    // Accessing private member using a public method 
    System.out.println("Private Variable (accessed via getter): " + getPrivateVar()); 
    }
}   
// Main class to execute the program 
public class PrivateMemberDemo { 
    public static void main(String[] args) { 
        SubClass obj = new SubClass(); 
        obj.display();
    }
}
