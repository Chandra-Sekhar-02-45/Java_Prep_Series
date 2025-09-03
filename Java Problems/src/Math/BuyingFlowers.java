// Question: Find the minimum coins needed to buy exactly N flowers
// when 2 flowers cost 4 coins and 3 flowers cost 5 coins.
//
// Constraints:
// 1 <= T <= 10^4
// 2 <= N <= 10^9

package Math;

import java.util.Scanner;

public class BuyingFlowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for number of test cases
        System.out.println("Enter number of test cases: ");
        int T = sc.nextInt();

        while (T-- > 0) {
            // Asking user for number of flowers
            System.out.println("Enter number of flowers (N): ");
            int n = sc.nextInt();

            int minCoins = 0;

            // Decide cost based on remainder when divided by 3
            if (n % 3 == 0) {
                minCoins = (n / 3) * 5;
            } else if (n % 3 == 1) {
                minCoins = ((n / 3) - 1) * 5 + 2 * 4;
            } else {  // n % 3 == 2
                minCoins = (n / 3) * 5 + 4;
            }

            // Printing minimum coins for this test case
            System.out.println("Minimum coins: " + minCoins);
        }

        sc.close();
    }
}

/*
Time Complexity: O(1) per test case
    - Only arithmetic operations are performed.
Space Complexity: O(1)
    - No extra space apart from variables.

Optimization:
    - Already optimal. Pure mathematical calculation.
*/
