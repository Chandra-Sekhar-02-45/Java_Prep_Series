package Problems;
import java.util.*;

public class subMatrixSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for size of matrix
        System.out.print("Enter the size of the square matrix (n): ");
        int n = sc.nextInt();

        // Ask user for the submatrix range (top-left to bottom-right)
        int[] arr = new int[4];
        System.out.println("Enter submatrix boundaries:");
        System.out.print("Enter starting row index (r1): ");
        arr[0] = sc.nextInt();
        System.out.print("Enter starting column index (c1): ");
        arr[1] = sc.nextInt();
        System.out.print("Enter ending row index (r2): ");
        arr[2] = sc.nextInt();
        System.out.print("Enter ending column index (c2): ");
        arr[3] = sc.nextInt();

        // Ask user to input matrix elements
        int[][] barr = new int[n][n];
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                barr[i][j] = sc.nextInt();
            }
        }

        // Calculate the submatrix sum
        int subSum = 0;
        for (int i = arr[0] ; i <= arr[2] ; i++) {
            for (int j = arr[1] ; j <= arr[3] ; j++) {
                subSum += barr[i][j];
            }
        }

        // Print the result
        System.out.println("The sum of the specified submatrix is: " + subSum);
    }
}
