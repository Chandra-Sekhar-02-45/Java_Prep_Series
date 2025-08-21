package Problems;// Program to calculate the absolute difference between the sums of the matrix's primary and secondary diagonals

import java.util.*;                                              // Import utility package for Scanner

public class diagonalDifference {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);                     // Create Scanner object for user input

        System.out.print("Enter the size of the square matrix (n): ");
        int n = sc.nextInt();                                    // Read the size of the matrix

        int[][] arr = new int[n][n];                             // Declare a 2D array of size n x n
        int primDia = 0 , secDia = 0;                            // Initialize diagonal sums
        int diff = 0;                                            // Variable to store absolute difference

        System.out.println("Enter " + (n * n) + " elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();                        // Read each element into the matrix
            }
        }

        for (int i = 0; i < n; i++) {
            primDia += arr[i][i];                                // Add element from primary diagonal
            secDia += arr[i][n - 1 - i];                         // Add element from secondary diagonal
        }

        diff = Math.abs(primDia - secDia);                       // Calculate absolute difference
        System.out.println("Absolute Diagonal Difference: " + diff);  // Print the result
    }
}
