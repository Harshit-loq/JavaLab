// Base class representing a generic Player 
class Player {
    String name; 
    int age; 
    String position; 
    // Constructor to initialize Player attributes 
    public Player(String name, int age, String position) { 
        this.name = name;
        this.age = age; 
        this.position = position;
    }
    // Method to simulate playing action 
    public void play() {
        System.out.println(name + " (age" + age + ") is playing in position: " + position); 
    } 
    // Method to simulate training action
    public void train() { 
        System.out.println(name+" (age" + age + ") is training."); 
    } 
}
// Subclass representing a Cricket Player 
class Cricket_Player extends Player { 
    public Cricket_Player(String name, int age, String position) { 
        super(name, age, position); // Calling the superclass constructor 
    }
} 
// Subclass representing a Football Player 
class Football_Player extends Player { 
    public Football_Player (String name, int age, String position) { 
        super(name, age, position); // Calling the superclass constructor 
    } 
}
class Hockey_Player extends Player { 
    public Hockey_Player(String name, int age, String position) { 
        super(name, age, position); // Calling the superclass constructor 
    } 
}
// Main class to execute the program    
public class SportsDemo { 
    public static void main(String[] args) { 
        Cricket_Player cricketPlayer = new Cricket_Player("Virat Kohli", 35, "Batsman"); 
        Football_Player footballPlayer = new Football_Player("Cristiano Ronaldo", 39, "Forward"); 
        Hockey_Player hockeyPlayer = new Hockey_Player("Manpreet Singh", 32, "Midfielder"); 
        cricketPlayer.play(); 
        cricketPlayer.train(); 
        footballPlayer.play(); 
        footballPlayer.train(); 
        hockeyPlayer.play(); 
        hockeyPlayer.train(); 
    }
}