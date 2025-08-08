package ArraysProblems.LeetCode;

/*
 * LeetCode 1672: Richest Customer Wealth
 *
 * Problem:
 * You are given a 2D array 'accounts' where accounts[i][j] is the amount of money
 * the i-th customer has in the j-th bank.
 * Return the wealth that the richest customer has.
 *
 * Wealth of a customer = sum of money they have in all banks.
 */

import java.util.Scanner;

public class RichestCustomerWealth {
    // Function to compute the maximum wealth
    public static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int[] customer : accounts) {
            int sum = 0;

            for (int bank : customer) {
                sum += bank;
            }

            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter number of customers: ");
        int customers = sc.nextInt();

        System.out.print("Enter number of banks: ");
        int banks = sc.nextInt();

        int[][] accounts = new int[customers][banks];

        System.out.println("Enter the amount of money each customer has in each bank:");
        for (int i = 0; i < customers; i++) {
            for (int j = 0; j < banks; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }

        int richest = maximumWealth(accounts);
        System.out.println("\nThe richest customer has a wealth of: " + richest);
    }
}

