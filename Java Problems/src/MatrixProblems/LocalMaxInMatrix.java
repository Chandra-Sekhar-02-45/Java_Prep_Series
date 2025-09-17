package MatrixProblems;

import java.util.Scanner;

public class LocalMaxInMatrix {
    // Question: Given an n x n matrix, construct a new matrix of size (n-2) x (n-2)
// where each element is the maximum value of the corresponding 3x3 submatrix
// from the original matrix.
//
// Constraints:
// 3 <= n <= 500
// -10^9 <= mat[i][j] <= 10^9

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input size of matrix
            System.out.print("Enter the size of the matrix (n): ");
            int n = sc.nextInt();

            int[][] mat = new int[n][n];

            // Input matrix
            System.out.println("Enter the elements of the " + n + " x " + n + " matrix:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }

            // Resultant matrix of size (n-2) x (n-2)
            int[][] r_mat = new int[n - 2][n - 2];

            // Compute max in each 3x3 submatrix
            for (int row = 0; row < n - 2; row++) {
                for (int col = 0; col < n - 2; col++) {
                    int maxi = Integer.MIN_VALUE;
                    for (int i = row; i < row + 3; i++) {
                        for (int j = col; j < col + 3; j++) {
                            maxi = Math.max(maxi, mat[i][j]);
                        }
                    }
                    r_mat[row][col] = maxi;
                }
            }

            // Print the resultant matrix
            System.out.println("\nResultant matrix of maxima in each 3x3 submatrix:");
            for (int i = 0; i < n - 2; i++) {
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(r_mat[i][j] + " ");
                }
                System.out.println();
            }

            sc.close();
        }
    }

/*
Time Complexity: O(n^2 * 9) ≈ O(n^2)
Space Complexity: O(n^2)
*/

