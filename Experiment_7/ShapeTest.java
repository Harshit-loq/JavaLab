
abstract class Shape {

    abstract void calculateArea();
}

class Rectangle extends Shape {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class ShapeTest {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        rectangle.calculateArea();

        Shape circle = new Circle(4);
        circle.calculateArea();
    }
}
