package Recursions;

import java.util.Scanner;

/**
 * A simple program to calculate the factorial of a number using recursion.
 * Factorial of a number n is defined as:
 * n! = n * (n-1) * (n-2) * ... * 1
 * Special case: 0! = 1
 */
public class Factorial {

    /**
     * Recursive method to calculate factorial.
     *
     * @param i The number whose factorial is to be calculated.
     * @return Factorial of i.
     */
    public int factorial(int i) {
        // Base case: factorial of 0 is 1
        if (i == 0) {
            return 1;
        }

        // Recursive case: n! = n * (n-1)!
        return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number to find its factorial: ");
        int n = input.nextInt();

        // Create an object of Factorial class
        Factorial fact = new Factorial();

        // Call the recursive method and display result
        System.out.println("Factorial of " + n + " is: " + fact.factorial(n));
    }
}
