class Student {
    String name;
    int age;
    //constructor
    Student() {
        this.name = "Harshit";
        this.age = 19;
    }
    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student();  // Using default constructor
        Student student2 = new Student("Osho", 22); // Using parameterized constructor
        student1.display();
        student2.display();
    }
}
