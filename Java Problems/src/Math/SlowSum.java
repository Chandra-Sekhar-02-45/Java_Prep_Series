package Math;

import java.util.*;

/**
 * Solves the "Slow Solution" problem from CodeChef by finding the maximum
 * possible sum of squares given a set of constraints.
 * https://www.codechef.com/problems/SLOWSOLN
 */
public class SlowSum {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
            int maxT = sc.nextInt(); // Max number of individual test cases allowed.
            int maxN = sc.nextInt(); // Max value for any single N.
            int sumN = sc.nextInt(); // The total sum that all N's cannot exceed.

            // Use a 'long' for the result to prevent integer overflow, as N^2 can be large.
            long totalIterations = 0;

            // --- Greedy Strategy ---
            // To maximize the sum of squares (ΣN²), we should make the numbers
            // as unequal as possible. This means using the largest possible value (maxN)
            // as many times as we can.

            // Calculate how many full test cases of size maxN can be made from sumN.
            int fullChunks = sumN / maxN;

            // The number of full chunks is limited by both sumN and the max test cases (maxT).
            int chunksToProcess = Math.min(fullChunks, maxT);

            // Pre-calculate the square of maxN.
            long oNSqr = (long)maxN * maxN;

            // Add the sum of squares for all the full-sized test cases.
            totalIterations += chunksToProcess * oNSqr;

            // Calculate the remaining sum of N after accounting for the full chunks.
            int remainingSum = sumN - (chunksToProcess * maxN);

            // If there's a remaining sum AND we have a test case slot available,
            // this remainder forms one last, smaller test case.
            if (remainingSum > 0 && chunksToProcess < maxT) {
                // Add the square of the final remaining part to the total.
                totalIterations += (long) remainingSum * remainingSum;
            }

            // Print the final maximum possible number of iterations.
            System.out.println(totalIterations);

        // Close the scanner to prevent resource leaks.
        sc.close();
    }
}