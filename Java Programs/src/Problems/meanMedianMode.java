package Problems;// Program to calculate Mean, Median, and Mode of an integer array
import java.util.*;                                          // Import utility classes

public class meanMedianMode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                 // Create Scanner object for input

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();                                // Read the size of the array

        int[] arr = new int[n];                              // Declare an array of size n
        int mode = 0, sum = 0, maxCount = 0;                 // Initialize mode, sum, and count for mode
        double mean = 0, median = 0;                         // Initialize mean and median

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();                           // Read array elements
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i];                                   // Add element to total sum
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;                              // Count frequency of current element
                }
            }

            if (count > maxCount) {
                maxCount = count;                            // Update most frequent count
                mode = arr[i];                               // Set mode to most frequent value
            }
        }

        mean = (double) sum / n;                             // Calculate mean

        Arrays.sort(arr);                                    // Sort the array for median calculation
        if (n % 2 == 0) {
            median = (arr[(n / 2) - 1] + arr[n / 2]) * 0.5;  // Median for even size
        } else {
            median = arr[n / 2];                             // Median for odd size
        }

        System.out.printf("Mean: %.2f\n", mean);             // Print mean with 2 decimal places
        System.out.printf("Median: %.2f\n", median);         // Print median with 2 decimal places
        System.out.printf("Mode: %d\n", mode);               // Print mode
    }
}
