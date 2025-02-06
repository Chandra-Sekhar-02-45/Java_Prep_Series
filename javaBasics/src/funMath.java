import java.util.Scanner;

public class funMath {
    public static void main(String[] args) {

        System.out.println("\nWelcome to Fun Math!");
        System.out.println("Choose an option:");
        System.out.println("1. Constants (Pi & Euler's Number)");
        System.out.println("2. Exponential Function");
        System.out.println("3. Absolute Value");
        System.out.println("4. Square Root");
        System.out.println("5. Rounding Function");
        System.out.println("6. Minimum & Maximum");
        System.out.println("7. Ceil & Floor");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nThe Value of Pi: " + Math.PI);
                System.out.println("The Value of Euler's Constant: " + Math.E);
                break;

            case 2:
                System.out.println("Enter the base value: ");
                int base = sc.nextInt();
                System.out.println("Enter the exponent value: ");
                int power = sc.nextInt();
                int exponent = (int) Math.pow(base, power);
                System.out.println(base + " raised to the power of " + power + " is: " + exponent);
                break;

            case 3:
                System.out.println("Enter a number to find its absolute value: ");
                int num = sc.nextInt();
                System.out.println("The absolute value of " + num + " is: " + Math.abs(num));
                break;

            case 4:
                System.out.println("Enter a number to find its square root: ");
                double sqrtNum = sc.nextDouble();
                if (sqrtNum < 0) {
                    System.out.println("Square root of a negative number is not defined in real numbers.");
                } else {
                    System.out.println("The square root of " + sqrtNum + " is: " + Math.sqrt(sqrtNum));
                }
                break;

            case 5:  
                System.out.println("Enter a decimal number to round off: ");
                double roundNum = sc.nextDouble();
                System.out.println("Rounded value: " + Math.round(roundNum));
                break;

            case 6: 
                System.out.println("Enter two numbers to find the minimum and maximum:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println("Minimum value: " + Math.min(num1, num2));
                System.out.println("Maximum value: " + Math.max(num1, num2));
                break;

            case 7:  
                System.out.println("Enter a decimal number to find its ceil and floor values:");
                double decimalNum = sc.nextDouble();
                System.out.println("Ceiling value: " + Math.ceil(decimalNum));
                System.out.println("Floor value: " + Math.floor(decimalNum));
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }

        sc.close();
    }
}
