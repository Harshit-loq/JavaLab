class MathConstants {
    final double PI = 3.14159; // Final variable

    final void displayPI() {
        System.out.println("Value of PI: " + PI);
    }
}

class Circle extends MathConstants {
    void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.displayPI();
        myCircle.calculateArea(7.0);
    }
}
