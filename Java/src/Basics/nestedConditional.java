package Basics;

import java.util.Scanner;

public class nestedConditional {
    public static void main(String[] args) {

        Boolean isStudent , isSenior;
        Double ticketPrice , Discount , Cost;
        Double studentDiscount = 0.1;
        Double seniorDiscount = 0.2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ticket price: ");
        ticketPrice = sc.nextDouble();
        System.out.print("Are you a student enter true or false? :");
        isStudent = sc.nextBoolean();
        System.out.print("Are you a senior enter true or false? ");
        isSenior = sc.nextBoolean();

        if(isStudent) {
            if(isSenior) {
                System.out.print("You get both Student Discount - 10% And Senior Discount - 20% ");
                Discount = 1 - (studentDiscount + seniorDiscount);
                Cost = ticketPrice * Discount;
               System.out.println("\nTotal cost is $" + Cost);
            }
            else {
                System.out.print("You get a Student Discount - 10%");
                Discount = 1 - studentDiscount;
                Cost = ticketPrice * Discount;
              System.out.println("\nTotal cost is $" + Cost);
            }
        }
        else {
           if(isSenior) {
               System.out.print("You get a Senior Discount - 20%");
               Discount = 1 - seniorDiscount;
               Cost = ticketPrice * Discount;
             System.out.println("\nTotal cost is $" + Cost);
           }
           else {
               System.out.print("You get a No Discount");
               Cost = ticketPrice * 1;
               System.out.println("\nTotal cost is $" + Cost);
           }
        }


    }
}
