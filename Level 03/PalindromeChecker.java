import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Iterative Method to check palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // If characters don't match
            }
            start++;
            end--;
        }

        return true; // If all characters match
    }

    // Logic 2: Recursive Method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: If start index is greater than or equal to end index, it's a palindrome
        if (start >= end) {
            return true;
        }

        // If characters at start and end don't match, it's not a palindrome
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call with next indices
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Character Array Method to check palindrome
    public static boolean isPalindromeUsingArray(String text) {
        // Convert string to a character array
        char[] originalArray = text.toCharArray();
        
        // Create a reversed array
        char[] reversedArray = new char[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Compare original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false; // If characters don't match
            }
        }

        return true; // If all characters match
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the text
        System.out.print("Enter a text to check for palindrome: ");
        String text = scanner.nextLine();

        // Remove spaces and convert to lowercase for case-insensitive comparison
        text = text.replaceAll("\\s", "").toLowerCase();

        // Check palindrome using all three methods and display the result
        boolean result1 = isPalindromeIterative(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeUsingArray(text);

        // Display the results
        if (result1 && result2 && result3) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }

        scanner.close();
    }
}
