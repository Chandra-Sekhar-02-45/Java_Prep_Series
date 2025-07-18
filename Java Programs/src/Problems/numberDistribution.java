package Problems;// Program to count the number of positive, negative, and zero elements in an array

import java.util.*;                                           // Import utility classes

public class numberDistribution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                  // Create Scanner object for input

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();                                 // Read the size of the array

        int[] arr = new int[n];                               // Declare an array of size n
        int count0 = 0;                                       // Initialize zero counter
        int countp = 0;                                       // Initialize positive number counter
        int countn = 0;                                       // Initialize negative number counter

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();                            // Read elements into the array
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0 += 1;                                  // Increment zero count
            } else if (arr[i] > 0) {
                countp += 1;                                  // Increment positive count
            } else {
                countn += 1;                                  // Increment negative count
            }
        }

        System.out.println("Zeros: " + count0);               // Print zero count
        System.out.println("Positives: " + countp);           // Print positive count
        System.out.println("Negatives: " + countn);           // Print negative count
    }
}
