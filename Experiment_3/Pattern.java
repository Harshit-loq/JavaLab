public class Pattern {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("? ");
                }
            } else {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
