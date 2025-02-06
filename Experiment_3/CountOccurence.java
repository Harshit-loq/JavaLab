public class CountOccurence {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 2, 6};
        int a = 2;
        int c = 0;

        for (int num : arr) {
            if (num == a) {
                c++;
            }
        }

        System.out.println("The number " + a + " appears in array: "+c);
    }
}
