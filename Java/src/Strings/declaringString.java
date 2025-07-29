package Strings;

import java.lang.String;

public class declaringString {
    // It behaves like a literal because of:
    // 1. String is a class but can be used like a data type / Non Premitive Data Type.
    // 2. String literals are stored in the String Pool for memory optimization.

    public static void main(String[] args) {
        System.out.println();

        // Type - 1: String Literal (recommended way)
        String str1 = "Chandra Sekhar"; // Stored in String Pool Memory
        System.out.println(str1);
        String str3 = "Chandra Sekhar";

        // Type - 2: Using the new keyword (creates a new object in Heap Memory)
        String str2 = new String("Chandra Sekhar"); // Allocated outside of String Pool , In Heap Storage.
        System.out.println(str2);
        System.out.println();
        String str4 = "Chandra Sekhar";

        System.out.println(new declaringString());  // Output: Strings.declaringString@hashcode
        // If you try to print the object of this class (declaringString), it prints className@hashCode
        // because toString() is not overridden in the class
        System.out.println();

        System.out.println(new String("Chandu"));
        // Even though `String` is a class, it behaves differently because it overrides the toString() method.
        // So, printing a String object directly displays its actual content, not the className@hashCode format.
        System.out.println();

        // String Concatenation
        System.out.println(str1 + " Raju"); // Combines both strings
        System.out.println();

        System.out.println(str1 == str2);
        // This will print false because str1 and str2 refer to different memory locations.
        // In Java, the == operator compares memory addresses (references), not the content of the string.
        // Since str1 is a string literal (stored in the String Pool) and str2 is created using new (stored in the heap), they are not the same reference.
        System.out.println();

        System.out.println(str1 == str3);
        // str1 and str3 refer to the same memory location in the String Pool.
        // Although they are different variables, Java optimizes memory by storing identical string literals at one place.
        // By providing the same memory address
        // So, when declared with the same value, both point to the same object in the String Pool.
        System.out.println();

        System.out.println(str2 == str4);
        // Even though both str2 and str4 have the same string content,
        // they are created using the new keyword, which always allocates new memory on the heap.
        // Therefore, they refer to different objects in memory and the result will be false,
        // because == compares memory references, not actual content.
        System.out.println();

        System.out.println(str3.equals(str4));;
        // To avoid these confusions java introduces a method known as (equals) ,
        // so it checks only the value inside the given var.
        System.out.println();


    }
}