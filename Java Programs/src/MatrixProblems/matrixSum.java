// Program to calculate the sum of two matrices of size n x m

package MatrixProblems;       // Package declaration
import java.util.*;           // Import Scanner for input

public class matrixSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter number of rows (n): ");
        int n = sc.nextInt();  // Read number of rows

        System.out.print("Enter number of columns (m): ");
        int m = sc.nextInt();  // Read number of columns

        int[][] arr1 = new int[n][m];  // First matrix
        int[][] arr2 = new int[n][m];  // Second matrix

        System.out.println("Enter elements of first matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr1[i][j] = sc.nextInt();  // Read elements of first matrix
            }
        }

        System.out.println("Enter elements of second matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr2[i][j] = sc.nextInt();  // Read elements of second matrix
            }
        }

        int[][] sum = new int[n][m];  // Matrix to store the sum

        // Calculate element-wise sum of matrices
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];  // Sum of corresponding elements
            }
        }

        System.out.println("Sum of the two matrices:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(sum[i][j] + " ");  // Print matrix elements
            }
            System.out.println();  // Move to next row
        }
    }
}
