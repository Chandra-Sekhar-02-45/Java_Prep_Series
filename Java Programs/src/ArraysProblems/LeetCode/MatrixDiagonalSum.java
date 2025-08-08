package ArraysProblems.LeetCode;

/*
 * LeetCode 1572: Matrix Diagonal Sum
 *
 * Problem:
 * Given a square matrix `mat`, return the sum of the matrix diagonals.
 * Only include the primary and secondary diagonals, and avoid double-counting
 * the center element if the matrix has an odd dimension.
 */

import java.util.Scanner;

public class MatrixDiagonalSum {

    // Function to compute the sum of primary and secondary diagonals
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];              // Primary diagonal
            sum += mat[i][n - i - 1];      // Secondary diagonal
        }

        // Subtract the center element if n is odd (to avoid double-counting)
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }

    // Time Complexity O(n) .

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the square matrix
        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        // Input elements of the matrix
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Compute and print the diagonal sum
        int result = diagonalSum(mat);
        System.out.println("\nSum of diagonals = " + result);
    }
}

