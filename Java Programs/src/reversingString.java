import java.util.Scanner;

public class reversingString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to reverse: ");
        String word = sc.nextLine();

        String reversed = "";

        // Loop through the string from end to start
        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            reversed += ch;
        }

        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}
