public class CommandLineCalculator{
    public static void main(String args[]) {
        int num1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int num2 = Integer.parseInt(args[2]);

        if (operator.equals("+")) {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println("Result: " + (num1 * num2));
        } else {
            System.out.println("Invalid operator. Use +, -, or *.");
        }
    }

}
