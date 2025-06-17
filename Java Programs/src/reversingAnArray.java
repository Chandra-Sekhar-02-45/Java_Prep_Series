// Program to reverse and print the elements of an integer array

import java.io.*;                                           // Import I/O classes
import java.util.*;                                         // Import utility classes like Scanner

public class reversingAnArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                // Create Scanner object for input

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();                               // Read the size of the array

        int[] arr = new int[n];                             // Declare an array of size n

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();                          // Read n elements into the array
        }

        System.out.print("Reversed array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");                 // Print array elements in reverse order
        }
    }
}
