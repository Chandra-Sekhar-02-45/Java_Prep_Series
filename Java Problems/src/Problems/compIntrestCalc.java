package Problems;

import java.util.Scanner;

public class compIntrestCalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principle, rate, amount;
        int timesCompounded, years;

        System.out.print("Enter the principal amount: ");
        principle = sc.nextDouble();

        System.out.print("Enter the rate of interest (in %): ");
        rate = sc.nextDouble() / 100;

        System.out.print("Enter the number of times interest is compounded per year: ");
        timesCompounded = sc.nextInt();

        System.out.print("Enter the number of years: ");
        years = sc.nextInt();

        amount = principle * Math.pow(1 + (rate / timesCompounded), timesCompounded * years);

        // Format the output to 2 decimal places
        System.out.printf("The amount after %d years is: $%.2f%n", years, amount);

        sc.close();
    }
}
