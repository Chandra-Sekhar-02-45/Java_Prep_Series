package Oops.Constructors;

//No parameters
//Java provides it automatically if you don’t define any constructor

class defaultConstructor {
    String name;
    int age;

    // Default Constructor
     defaultConstructor() {
        name = "Unknown";
        age = 0;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

//    public static class Main {
//        public static void main(String[] args) {
//            defaultConstructor s1 = new defaultConstructor();  // Default constructor called
//            s1.display();                // Output: Name: Unknown, Age: 0
//        }
//    }

