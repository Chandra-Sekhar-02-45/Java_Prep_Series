import java.util.Random;

public class randomNumb {

    public static void main(String[] args) {
        int die;
        Random rand = new Random();
        die = rand.nextInt(1,6); // range is 1 to 6
        System.out.println(die);

    }
}
