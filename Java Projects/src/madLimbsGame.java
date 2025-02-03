import java.util.Scanner;

public class madLimbsGame{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Halloween Mad Limb Story
        String noun1;
        String noun2;
        String adjective1;
        String adjective2;
        String adjective3;
        String verb1;
        String verb2;

        System.out.print("Enter an adjective ( description about something else ): ");
        adjective1 = sc.nextLine();
        System.out.print("Enter a noun ( name of a place ): ");
        noun1 = sc.nextLine();
        System.out.print("Enter a verb - past tense  ( an action word ): ");
        verb1 = sc.nextLine();
        System.out.print("Enter an adjective ( description about something else ): ");
        adjective2 = sc.nextLine();
        System.out.print("Enter a verb ( an action word ): ");
        verb2 = sc.nextLine();
        System.out.print("Enter a noun ( name of a thing ): ");
        noun2 = sc.nextLine();
        System.out.print("Enter an adjective ( description about something else ): ");
        adjective3 = sc.nextLine();

        //Story Begins
        System.out.println("On a "+ adjective1 +" Halloween night, a group of friends decide to visit the old " + noun1 + ".");
        System.out.println("They " + verb1 +" through the dark forest, feeling very " + adjective2 +".");
        System.out.println("Suddenly, they heard a noise coming from the forest.");
        System.out.println("They decided to " + verb2 +" close to investigate.");
        System.out.println("To their surprise, they found a " + noun2 + " that was a glowing " + adjective3 + " in the moonlight.");
        System.out.println("It was the spookiest Halloween night they had ever experienced!") ;

        sc.close();
    }
}