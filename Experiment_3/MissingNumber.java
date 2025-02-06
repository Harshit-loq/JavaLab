public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 2, 4};
        int n = arr.length + 1; 

        int TotalSum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int num : arr) {
            arrSum = arrSum + num; 
        }

        int MissNum = TotalSum - arrSum; 
        System.out.println("The missing number is: " + MissNum);
    }
}
