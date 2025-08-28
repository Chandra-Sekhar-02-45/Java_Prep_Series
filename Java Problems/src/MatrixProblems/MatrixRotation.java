package MatrixProblems;

// Given a 2D square matrix, rotate it by 90 degrees clockwise.

import java.io.*;
import java.util.*;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- User Instructions ---
        System.out.println("Enter the size of the matrix (N):");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        System.out.println("Enter the " + (n * n) + " elements of the matrix row by row:");
        // 1. Read the matrix from input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // --- In-place Rotation Logic ---

        // Step A: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step B: Reverse each row
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }

        // 3. Print the final rotated matrix
        System.out.println("\nRotated Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); // Good practice to close the scanner
    }
}