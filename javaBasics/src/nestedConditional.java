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
                System.out.print("Student Discount is 10%");
                System.out.print("\nSenior Discount is 20%");
                Discount = 1 - (studentDiscount + seniorDiscount);
                Cost = ticketPrice * Discount;
               System.out.println("\nTotal cost is $" + Cost);
            }
            else {
                System.out.print("Student Discount is 10%");
                Discount = 1 - studentDiscount;
                Cost = ticketPrice * Discount;
              System.out.println("\nTotal cost is $" + Cost);
            }
        }
        else {
           if(isSenior) {
               System.out.print("Senior Discount is 20%");
               Discount = 1 - seniorDiscount;
               Cost = ticketPrice * Discount;
             System.out.println("\nTotal cost is $" + Cost);
           }
           else {

               Cost = ticketPrice * 1;
             System.out.println("\nTotal cost is $" + Cost);
           }
        }


    }
}
