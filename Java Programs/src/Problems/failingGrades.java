package Problems;// Program to check if a student passes all tests based on average marks being at least 40 after each exam

import java.util.*;                                              // Import utility package for Scanner

class failingGrades
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);                     // Create Scanner object for input

        int T = sc.nextInt();                                    // Read number of test cases

        while (T-- > 0) {                                        // Loop through all test cases
            int n = sc.nextInt();                                // Read number of exams
            int sum = 0;                                          // Initialize sum of marks
            boolean fail = false;                                // Flag to track failing condition

            for (int i = 1; i <= n; i++) {                        // Loop through each exam mark
                int exam = sc.nextInt();                          // Read exam mark
                sum += exam;                                      // Add mark to sum
                float avg = (float) sum / i;                      // Calculate average so far

                if (avg < 40) {                                   // Check if average drops below 40
                    fail = true;                                  // Mark as fail
                }
            }

            if (!fail) {                                          // If never failed, print "Yes"
                System.out.println("Yes");
            } else {                                              // Otherwise, print "No"
                System.out.println("No");
            }
        }
    }
}
