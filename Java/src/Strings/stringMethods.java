package Strings;

public class stringMethods {
    public static void main(String[] args) {

        // Using equals() Method
        String eq1 = "Chandu";
        String eq2 = "CHANDU";
        System.out.println(eq1.equals(eq2));

        // Using equalsIgnoreCase() Method
        System.out.println(eq1.equalsIgnoreCase(eq2));

        // Using Contains() Method
        String con1 = "Chandra Sekhar";
        String con2 = "Sekhar";
        System.out.println(con1.contains(con2));

        // Using startsWith() & endsWith() Methods
        String str1 = "Chandra Sekhar";
        String str2 = "Chandra";
        String str3 = "Sekhar";
        System.out.println(str1.startsWith(str2));
        System.out.println(str1.endsWith(str3));

        // Using length() Method
        String str = "Rathnakaram Venkata Chandra Sekhara Raju";
        System.out.println(str.length());





    }
}
