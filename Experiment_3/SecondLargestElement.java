public class SecondLargestElement {
    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 16};
        int l = 0;
        int secondL = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l) {
                secondL = l;
                l = arr[i];
            } else if (arr[i] > secondL && arr[i] != l) {
                secondL = arr[i];
            }
        }
        
        System.out.println("The second largest element is: " + secondL);
     }
}

