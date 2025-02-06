public class SumOfDivisibles {
    public static void main(String[] args) {
        int a = 10, b = 950;
        int s = 0;

        for (int i = a; i <= b; i++) {
            if (i % 6 == 0 && i % 9 == 0) { 
                s = s + i;
            }
        }
        System.out.println("Sum of numbers divisible by both 6 and 9 between " + a + " and " + b + " is: " + s);
    }
}
