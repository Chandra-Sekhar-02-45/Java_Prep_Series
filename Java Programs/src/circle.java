import java.util.Scanner;

public class circle {

    public static void main(String[] args) {

        // Circumference of a circle = 2 * Math.PI * radius
        // Area of a circle = Math.PI * Math.pow( radius , 2 )
        // Volume of a circle = ( 4 / 3 ) * Math.PI * Math.pow( radius , 3 )

        System.out.println("\nWelcome to the circle!");
        System.out.print("Please enter the radius of the circle : ");

        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow( radius , 2 );
        double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius , 3 );

        System.out.println("The circumference of the circle is " + circumference);
        System.out.println("The area of the circle is " + area);
        System.out.println("The volume of the circle is " + volume);

    }
}
