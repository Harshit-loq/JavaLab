class Course {
    String courseName;
    String courseCode;
    // Constructor using "this" keyword
    Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }    
    void displayCourse() {
        System.out.println("Course Name: " + courseName + ", Course Code: " + courseCode);
    }
    public static void main(String[] args) {
        Course course = new Course("Java Programming", "CS404");
        course.displayCourse();
    }
}
