package Oops.Constructors;

public class copyConstructor {
    String name;
    int age;

    // Parameterized Constructor
    copyConstructor(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor

    // ClassName(ClassName obj) {
    // Copy data from obj to the new object
//    }

    copyConstructor(copyConstructor std) {
        name = std.name;
        age = std.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        copyConstructor s4 = new copyConstructor("Alice", 20); // original object
//        copyConstructor s5 = new copyConstructor(s1); // copy object using copy constructor
//
//        s4.display(); // Output: Name: Alice, Age: 20
//        s5.display(); // Output: Name: Alice, Age: 20
//    }
//}
