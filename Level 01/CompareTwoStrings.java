import java.util.Scanner;

public class CompareTwoStrings{

    // Method to compare two strings using charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character of both strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true; // Strings are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Create a Scanner object for user input

        System.out.println("Enter the first string:");
        String str1 = scanner.next();

        System.out.println("Enter the second string:");
        String str2 = scanner.next();

        // Compare strings using charAt() method
        boolean resultUsingCharAt = compareStringsUsingCharAt(str1, str2);

        // Compare strings using the built-in equals() method
        boolean resultUsingEquals = str1.equals(str2);

        // Display the results
        System.out.println("\nResult using charAt() method: " + resultUsingCharAt);
        System.out.println("Result using equals() method: " + resultUsingEquals);
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("\nBoth methods give the same result.");
        } else {
            System.out.println("\nThe methods give different results.");
        }

        // Close the scanner
        scanner.close();
    }
}
