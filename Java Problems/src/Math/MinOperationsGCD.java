package Math;

import java.util.Scanner;

public class MinOperationsGCD {
    // Question: Given two integers X and Y, find the minimum number of operations
// required to make gcd(X, Y) > 1. In one operation, you can increment either X or Y by 1.
//
// Constraints:
// 1 <= T <= 10^4
// 1 <= X, Y <= 10^9

        public static void main(String[] args) throws java.lang.Exception {
            Scanner sc = new Scanner(System.in);

                // Asking user for values of x and y
                System.out.println("\nEnter values of X and Y: ");
                int x = sc.nextInt();
                int y = sc.nextInt();

                System.out.print("Min Operations Are : ");
                // Case 1: Already gcd > 1
                if (gcd(x, y) > 1) {
                    System.out.println(0);
                }
                // Case 2: If incrementing either x or y makes gcd > 1
                else if (gcd(x + 1, y) > 1 || gcd(x, y + 1) > 1) {
                    System.out.println(1);
                }
                // Case 3: Otherwise, it will always take 2 operations
                else {
                    System.out.println(2);
                }

            sc.close();
        }

        // Function to compute gcd using Euclidean Algorithm
        static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }

/*
Time Complexity: O(log(min(X, Y))) per gcd call
    - Each test case makes at most 3 gcd calls.
Space Complexity: O(1)
    - No extra space used.

Optimization:
    - Already optimal. Using built-in gcd (like Integer.gcd in Java 18+)
      would be cleaner but same complexity.
*/

