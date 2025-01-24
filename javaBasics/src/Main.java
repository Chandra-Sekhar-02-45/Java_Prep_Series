import java.util.Scanner;

class userInputs{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter your Roll No:");
        long id = sc.nextLong();

        System.out.println("Hello: "+name);
        System.out.println("Your age is: " +age);
        System.out.println("Your Roll No is: " +id);

    }
}