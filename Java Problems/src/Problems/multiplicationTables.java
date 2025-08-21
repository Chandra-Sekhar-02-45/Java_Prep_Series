package Problems;

import java.util.*;

public class multiplicationTables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number to print its multiplication table: ");
        int n = sc.nextInt();  // Read the number

        // Loop from 1 to 10 to print the multiplication table
        for (int i = 1; i <= 10; i++) {
            // Print each line in the format: n * i = result
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
