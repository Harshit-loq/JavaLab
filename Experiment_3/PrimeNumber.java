public class PrimeNumber{
    public static void main(String[] args) {
        int a = 1;
        int b = 1000;
        for (int i = a; i <= b; i++){
            if (i<=1 || i%2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}