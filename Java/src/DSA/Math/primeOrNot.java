package DSA.Math;

import java.util.Scanner;

public class primeOrNot {
    public static String prime(int n) {
        if(n == 2) return n + " Prime";
        if(n < 2 || n % 2 == 0) return n + " Not prime";

        for(int i = 3; i * i <= n; i += 2) {
            if(n % i == 0) {
                return n + "Not Prime";
            }
        }
        return n + " is Prime";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            String result = prime(n);

            System.out.println(result);
        }
    }
}
