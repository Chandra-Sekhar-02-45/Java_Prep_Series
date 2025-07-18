package Problems;
// Program to find the sum of even and odd elements in an array
import java.util.*;                                         // Import utility classes

public class oddEvenSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                 // Create Scanner object for input

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();                                // Read the size of the array

        int[] arr = new int[n];                              // Declare an array of size n
        int sumeve = 0, sumodd = 0;                          // Initialize sums for even and odd numbers

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();                           // Read array elements
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sumeve += arr[i];                            // Add to even sum if number is even
            } else {
                sumodd += arr[i];                            // Add to odd sum if number is odd
            }
        }

        System.out.println("Sum of Odd Numbers: " + sumodd); // Print sum of odd elements
        System.out.println("Sum of Even Numbers: " + sumeve);// Print sum of even elements
    }
}
