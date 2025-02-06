public class CopyArray {
    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 4, 5};
        int[] NewArr = new int[Arr.length];

        for (int i = 0; i < Arr.length; i++) {
            NewArr[i] = Arr[i];
        }

        System.out.print("Old array: ");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println(" ");
        System.out.print("New array: ");
        for (int i = 0; i < NewArr.length; i++) {
            System.out.print(NewArr[i] + " ");
        }
    }
}
