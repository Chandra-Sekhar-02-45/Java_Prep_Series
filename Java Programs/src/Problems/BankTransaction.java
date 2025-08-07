package Problems;

import java.util.Scanner;

public class BankTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter withdrawal amount: ");
        int amt = sc.nextInt();

        System.out.println("Enter current account balance: ");
        double balance = sc.nextDouble();

        double charges = 0.50;
        double rem = 0;

        if (amt % 5 == 0 && (amt + charges) <= balance) {
            rem = balance - amt - charges;
            System.out.printf("Transaction successful. Remaining balance: %.2f\n", rem);
        } else {
            System.out.printf("Transaction failed. Balance remains: %.2f\n", balance);
        }
    }
}

