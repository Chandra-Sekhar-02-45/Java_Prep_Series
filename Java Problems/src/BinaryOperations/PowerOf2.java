package BinaryOperations;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long power = (1l << n) ;
        System.out.printf("2 Power " + n + " : %d" , power);
    }
}
