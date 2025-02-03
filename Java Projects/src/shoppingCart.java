import java.util.Scanner;

public class shoppingCart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$'; // char should not use double quotes

        System.out.print("What item would like to buy?: ");
        item = sc.nextLine();

        System.out.print("What is the price of the item? : ");
        price = sc.nextDouble();

        System.out.print("How many items would you like to buy?: ");
        quantity = sc.nextInt();

        double total = price * quantity;

        System.out.print("");





    }

}
