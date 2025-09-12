package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.*;

public class ArrayList_Add {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("After adding: " + fruits);

        // Adding at index
        fruits.add(0, "Grapes");
        System.out.println("After adding at index 0: " + fruits);

        // Adding all elements of another list
        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Mango");
        moreFruits.add("Pineapple");

        fruits.addAll(moreFruits);
        System.out.println("After addAll: " + fruits);

        List list = Collections.synchronizedList(new ArrayList<>());

        // Adding at specific index
        fruits.addAll(2, moreFruits);
        System.out.println("After addAll at index 2: " + fruits);
    }
}

