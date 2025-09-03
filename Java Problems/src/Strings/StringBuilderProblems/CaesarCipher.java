// Question: Implement Caesar Cipher encryption, where each letter in the string is shifted
// by k positions in the alphabet (case-sensitive). Non-alphabetic characters remain unchanged.

package Strings.StringBuilderProblems;

import java.util.Scanner;

public class CaesarCipher {

    // Function to perform Caesar Cipher encryption
    public static String caesarCipher(String s, int k) {
        // Normalize shift to be within [0, 25]
        k = ((k % 26) + 26) % 26;
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append((char) ('A' + (ch - 'A' + k) % 26));
            } else if (Character.isLowerCase(ch)) {
                sb.append((char) ('a' + (ch - 'a' + k) % 26));
            } else {
                sb.append(ch);  // keep non-alphabetic chars unchanged
            }
        }
        return sb.toString();
    }

    // Helper function to decrypt Caesar Cipher
    public static String caesarDecipher(String s, int k) {
        return caesarCipher(s, 26 - (k % 26));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for input string
        System.out.println("Enter a string to encrypt: ");
        String s = sc.nextLine();

        // Asking user for shift value k
        System.out.println("Enter the shift value (k): ");
        int k = sc.nextInt();

        // Encrypting the string
        String encrypted = caesarCipher(s, k);

        // Decrypting back (to verify correctness)
        String decrypted = caesarDecipher(encrypted, k);

        // Printing results
        System.out.println("Encrypted string: " + encrypted);
        System.out.println("Decrypted back:   " + decrypted);

        sc.close();
    }
}

/*
Time Complexity: O(n)
    - Each character is processed once.
Space Complexity: O(n)
    - StringBuilder stores the encrypted string.

Optimization:
    - Already optimal for Caesar Cipher.
    - Could avoid extra space by printing directly,
      but StringBuilder is preferred in Java for efficiency.
*/
