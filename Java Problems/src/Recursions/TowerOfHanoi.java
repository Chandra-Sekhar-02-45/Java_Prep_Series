/*
    Question: Tower of Hanoi
    -----------------------------------------------------
    Given N disks stacked on source rod 'A', move them all to
    destination rod 'C' using auxiliary rod 'B'. Print the steps.
    Also print the total number of moves (which is 2^N - 1).

    ⚡ Time Complexity: O(2^N)
       - Each disk generates two recursive calls.
    ⚡ Space Complexity: O(N)
       - Due to recursive call stack depth.
*/

package Recursions;

import java.util.Scanner;

public class TowerOfHanoi {

    // Recursive function to solve Tower of Hanoi
    public static void ToH(int n, char src, char dest, char aux) {
        if (n == 0) return;   // Base case: no disks to move

        // Step 1: Move (n-1) disks from src → aux using dest
        ToH(n - 1, src, aux, dest);

        // Step 2: Move the nth disk from src → dest
        System.out.println("Move " + n + " from " + src + " to " + dest);

        // Step 3: Move (n-1) disks from aux → dest using src
        ToH(n - 1, aux, dest, src);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            // Input: number of disks
            System.out.print("Enter the number of disks : ");
            int n = sc.nextInt();

            char src = 'A';
            char dest = 'C';
            char aux = 'B';

            // Total moves required: (2^N - 1)
            System.out.println((int) Math.pow(2, n) - 1);

            // Print the sequence of moves
            TowerOfHanoi.ToH(n, src, dest, aux);

        sc.close(); // Close scanner
    }
}
