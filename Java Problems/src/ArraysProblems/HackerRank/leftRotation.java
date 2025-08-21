// Program to perform left rotation of an array by d positions

package ArraysProblems.HackerRank;  // Package declaration

import java.util.Scanner;  // Import Scanner for user input

public class leftRotation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();  // Read array size

        System.out.print("Enter the number of positions to rotate left: ");
        int d = sc.nextInt();  // Read rotation count

        int[] arr = new int[n];  // Declare array of size n

        System.out.println("Enter " + n + " elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();  // Read array elements
        }

        d = d % n;  // Handle rotations greater than array size

        // Print elements from d to end (first part after rotation)
        for(int i = d; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        // Print first d elements (second part after rotation)
        for(int i = 0; i < d; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
