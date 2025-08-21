package Problems;// Write a program to interchange the main diagonal and secondary diagonal elements of a square matrix

import java.util.*;                                         // Importing utility package

public class interchangingDiagonals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // Creating Scanner object for user input

        System.out.print("Enter the size of the square matrix (n x n): "); // Prompt for matrix size
        int n = sc.nextInt();                               // Reading size of the matrix

        int[][] arr = new int[n][n];                        // Declaring a 2D array of size n x n

        System.out.println("Enter the matrix elements:");   // Prompting user to enter matrix elements
        for (int i = 0; i < n; i++) {                       // Loop through rows
            for (int j = 0; j < n; j++) {                   // Loop through columns
                arr[i][j] = sc.nextInt();                   // Reading matrix element
            }
        }

        // Swapping main diagonal and secondary diagonal elements
        for (int i = 0; i < n; i++) {
            int temp = arr[i][i];                           // Storing main diagonal element in temp
            arr[i][i] = arr[i][n - i - 1];                  // Assigning secondary diagonal to main
            arr[i][n - i - 1] = temp;                       // Assigning temp to secondary diagonal
        }

        System.out.println("\nMatrix after interchanging diagonals:"); // Output message
        for (int i = 0; i < n; i++) {                       // Loop through rows
            for (int j = 0; j < n; j++) {                   // Loop through columns
                System.out.print(arr[i][j] + " ");          // Printing matrix element
            }
            System.out.println();                           // Newline after each row
        }
    }
}
