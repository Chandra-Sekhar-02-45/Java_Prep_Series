package Oops.Constructors;

public class constructorOverloading {
    String name;
    int age;

    // 1. Default Constructor
    constructorOverloading() {
        name = "Unknown";
        age = 0;
    }

    // 2. Parameterized Constructor
    constructorOverloading(String n, int a) {
        name = n;
        age = a;
    }

    // 3. Constructor with only name
    constructorOverloading(String n) {
        name = n;
        age = 18; // default age
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

