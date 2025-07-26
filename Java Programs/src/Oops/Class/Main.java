package Oops.Class;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();  // Creating an object of Car
        car1.brand = "Toyota";
        car1.speed = 120;

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.speed = 150;

        car1.drive();  // Output: Toyota is driving at 120 km/h.
        car2.drive();  // Output: BMW is driving at 150 km/h.
    }
}

