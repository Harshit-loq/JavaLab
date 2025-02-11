class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }
    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
       
        System.out.println("Addition of two integers: " + calc.add(5, 10));
        System.out.println("Addition of two doubles: " + calc.add(2.5, 3.5));
        System.out.println("Addition of three integers: " + calc.add(1, 2, 3));
    }
}
