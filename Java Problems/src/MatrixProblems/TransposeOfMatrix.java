// Question: Given an N x M matrix, print its transpose. 
// The transpose of a matrix is obtained by swapping its rows with its columns.

package MatrixProblems;

import java.util.Scanner;

public class TransposeOfMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask user for matrix dimensions
        System.out.print("Enter number of rows (N): ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns (M): ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        // Step 2: Read the matrix elements
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Step 3: Print the transpose
        System.out.println("The transpose of the matrix is:");
        for (int i = 0; i < m; i++) { // Original columns → transpose rows ( 0 - m )
            for (int j = 0; j < n; j++) { // Original rows → transpose columns ( 0 - n )
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }
}
