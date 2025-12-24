package DSA.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ExclusionProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] preP = new int[n];
            preP[0] = arr[0];
            for (int i = 1; i < n; i++) {
                preP[i] = arr[i] * preP[i - 1];
            }

            int[] sufP = new int[n];
            sufP[n - 1] = arr[n - 1];
            for(int i = n - 2; i >= 0; i--){
                sufP[i] = arr[i] * sufP[i + 1];
            }

            int[] exclP = new int[n];
            for(int i = 0; i < n; i++){
                int left = i > 0 ? preP[i - 1] : 1;
                int right = i < n - 1 ? sufP[i + 1] : 1;

                exclP[i] = left * right;
            }

            for(int x : exclP){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
