package Strings;

import java.util.Scanner;
//Always Refer Notes For Better Understanding
public class stringMethods {

    public static int countCharacters(String input1){
        return input1.length();
    }

    public static int countWords(String input2) {
        if (input2 == null || input2.isBlank()) return 0;
        // Remove leading/trailing spaces and split by one or more spaces
        return input2.trim().split("\\s+").length;
    }

        public static int charOccurance(String input3 , char ch){
            int numOccourances = 0 ;
            for(int i = 0; i < input3.length(); i++){
                if(input3.charAt(i) == ch ){
                    numOccourances += 1;
                }
            }
            return numOccourances;
        }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// 1.Write a java program to count the number of characters in a string.
        System.out.print("Enter a string: ");
        String userInput1 = sc.nextLine();
        int length = countCharacters(userInput1);
        System.out.println("The length of the given String is : " + length);

// 2.Write a java program to count the number of words in a string.
        System.out.print("Enter a sentence to count its words: ");
        String userInput2 = sc.nextLine();
        int wordCount = countWords(userInput2);
        System.out.println("Number of words: " + wordCount);

// 3. Write a java program to count the total number of occurrences of a given character in a string
        System.out.print("Enter a string: ");
        String userInput3 = sc.nextLine();
        System.out.print("Enter the character to count: ");
        char ch = sc.next().charAt(0);
        int numOccourances =  charOccurance(userInput3 , ch);
        System.out.println("The character '" + ch + "' occurs " + numOccourances + " times.");








    }
}
