package Recursions;

// Print natural numbers from 1 to N using recursion (Backtracking)

import java.util.Scanner;

public class NaturalNumbersToN {

    // Recursive function to print numbers from 1 to i
    public static void numbers(int i) {
        if (i < 1) {  // base condition
            return;
        }
        numbers(i - 1);   // recursive call
        System.out.print(i + " ");  // print after recursion (backtracking)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: "); // user instruction
        int n = sc.nextInt();

        numbers(n); // call recursive function
    }
}
