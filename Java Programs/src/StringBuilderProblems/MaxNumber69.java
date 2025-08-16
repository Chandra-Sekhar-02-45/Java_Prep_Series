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
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number consisting of only digits 6 and 9:");
        int num = sc.nextInt();

        // Direct static method call, no object needed
        int result = maximum69Number(num);

        System.out.println("Maximum number after flipping at most one '6' to '9' is: " + result);

        sc.close();
    }
}
