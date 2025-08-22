package Methods;

public class Bank {
    int currentBalance = 1000; // Instance variable (belongs to the object)

    // 1. STATIC METHOD
    // Static methods belong to the class, not to an object.
    // They can be called directly using the class name or inside main without an object.
    public static void customerGreetings() {
        System.out.println("Welcome to customer greetings! (This is a static method)");
    }

    // 2. NON-STATIC METHOD
    // Deposit money into the account
    public void depositMoney(int amount) {
        currentBalance += amount; // instance variable updated
        System.out.println("Deposited " + amount + " successfully!");
    }

    // Withdraw money from the account
    public void withdrawMoney(int amount) {
        currentBalance -= amount;
        System.out.println("Withdrawn " + amount + " successfully!");
    }

    // Method that RETURNS something (returns current balance)
    public int getCurrentBalance() {
        return currentBalance;
    }

    public static void main(String[] args) {
        System.out.println();

        // -----------------------------
        // Example 1: Calling a static method
        // -----------------------------
        customerGreetings(); // ✅ Works (direct call inside same class)

        Bank.customerGreetings();
        // ✅ Recommended way for static methods → "Accessed by class name"

        // bank.customerGreetings();
        // ⚠️ Allowed, but shows WARNING → "Static method should be accessed in a static way"
        // (because static belongs to the class, not the object)


        // -----------------------------
        // Example 2: Accessing NON-STATIC methods
        // -----------------------------
        Bank bank = new Bank(); // Object created to access non-static members

        // Without creating an object → ERROR ❌
        // depositMoney(500);
        // Java: "non-static method depositMoney() cannot be referenced from a static context"

        // Correct way ✅
        bank.depositMoney(500);
        System.out.println("After deposit, balance is: " + bank.getCurrentBalance());

        bank.withdrawMoney(300);
        System.out.println("After withdrawal, balance is: " + bank.getCurrentBalance());


        // -----------------------------
        // Example 3: RETURN type methods
        // -----------------------------
        int balance = bank.getCurrentBalance(); // store return value
        System.out.println("The method getCurrentBalance() returned: " + balance);


        // -----------------------------
        // Example 4: Multiple objects (each object has its own balance)
        // -----------------------------
        Bank bank2 = new Bank(); // New object created → it has its own balance = 1000
        System.out.println("Bank2 initial balance: " + bank2.getCurrentBalance());

        bank2.depositMoney(300);
        System.out.println("Bank2 balance after deposit: " + bank2.getCurrentBalance());

        // Bank1 is still separate
        System.out.println("Bank1 balance is still: " + bank.getCurrentBalance());
    }
}
