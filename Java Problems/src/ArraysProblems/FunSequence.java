package ArraysProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class FunSequence {

    /*
     * Question:
     * Given two sorted sequences:
     *   - Sequence S of size n
     *   - Sequence Q of size m
     * Print all elements of S that do not appear in Q, in ascending order.
     *
     * Constraints:
     * 1 <= n, m <= 10^5
     * -10^9 <= S[i], Q[j] <= 10^9
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for sequence S
        System.out.print("Enter the size of sequence S: ");
        int n = sc.nextInt();
        int[] S = new int[n];
        System.out.println("Enter " + n + " sorted integers for sequence S:");
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }

        // Input for sequence Q
        System.out.print("Enter the size of sequence Q: ");
        int m = sc.nextInt();
        int[] Q = new int[m];
        System.out.println("Enter " + m + " sorted integers for sequence Q:");
        for (int i = 0; i < m; i++) {
            Q[i] = sc.nextInt();
        }

        // Two-pointer approach
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < n && j < m) {
            if (S[i] < Q[j]) {
                result.add(S[i]);
                i++;
            } else if (S[i] == Q[j]) {
                i++;
                j++;
            } else { // S[i] > Q[j]
                j++;
            }
        }

        // Add remaining elements of S
        while (i < n) {
            result.add(S[i]);
            i++;
        }

        // Print result
        System.out.println("\nElements in S that are not in Q:");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
