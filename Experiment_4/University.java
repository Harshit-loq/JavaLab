class University {
    static String universityName = "UPES"; // Static variable
    String studentName;  // Non-static variable
    // Constructor to initialize student name
    University(String studentName) {
        this.studentName = studentName;
    }
    static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }
    void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }
    public static void main(String[] args) {

        University.displayUniversityName();

        University student1 = new University("Harshit");
        University student2 = new University("Osho");

        student1.displayStudent();
        student2.displayStudent();
    }
}
