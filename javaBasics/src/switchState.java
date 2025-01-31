import java.util.Scanner;

public class switchState {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : ");

        switch(sc.nextInt()) {
            case 1:
                System.out.println("Monday");
                break;     //If don't write break statement it continous printing till the condition ends
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
