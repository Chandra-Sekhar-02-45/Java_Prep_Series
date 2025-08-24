package Recursions;

import java.util.Scanner;

public class Palindrome {

    public boolean isPalindrome(String str, int i, int n) {
        // Base case: If we have checked half the string, it's a palindrome
        if (i >= n / 2) {
            return true;
        }

        // If characters at both ends don't match, it's not a palindrome
        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }

        // Recursive case: move towards the middle
        return isPalindrome(str, i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string to check if it's a palindrome: ");
        String str = sc.nextLine();

        // Create an object of Palindrome class
        Palindrome pal = new Palindrome();
        int n = str.length();

        // Check and print result
        if (pal.isPalindrome(str, 0, n)) {
            System.out.println(str + " is a palindrome ✅");
        } else {
            System.out.println(str + " is NOT a palindrome ❌");
        }
    }
}
