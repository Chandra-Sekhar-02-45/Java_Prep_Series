// LeetCode 1323 - Maximum 69 Number
// Question: Given a positive integer num consisting only of digits 6 and 9,
// return the maximum number you can get by changing at most one digit (6 becomes 9).

package StringBuilderProblems;

import java.util.Scanner;

public class MaxNumber69 {
    public static int maximum69Number(int num) {
        String numberString = String.valueOf(num);

        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) == '6') {
                StringBuilder sb = new StringBuilder(numberString);
                sb.setCharAt(i, '9');
                return Integer.parseInt(sb.toString());
            }
        }
        return num; // if no '6' is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number consisting of only digits 6 and 9:");
        int num = sc.nextInt();

        // Direct static method call (no object creation needed)
        int result = maximum69Number(num);

        System.out.println("Maximum number after flipping at most one '6' to '9' is: " + result);

        sc.close();
    }
}
