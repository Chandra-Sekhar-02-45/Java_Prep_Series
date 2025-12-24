package DSA.Math;

import java.util.Scanner;

public class lcmAndHcf {

    public static int findHcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int hcf = findHcf(a, b);
        int lcm = (a * b) / hcf;

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);

        sc.close();
    }
}
