// Find the XOR sum of pairs in an array.

package BinaryOperations;
import java.util.Scanner;

public class XORSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int T = sc.nextInt();

        while (T-- > 0) {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter array elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = 0;
            for (int i : arr) {
                ans ^= 2 * i;  // XOR of double each element
            }
            System.out.println("XOR Sum: " + ans);
        }
        sc.close();
    }
}
