import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in the string
    public static char findFirstNonRepeatingCharacter(String text) {
        // Create an array to store the frequency of characters (ASCII values)
        int[] frequency = new int[256]; // 256 ASCII characters

        // Loop through the string to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Loop through the string again to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        // If no non-repeating character exists, return a special character
        return '\0'; // Null character indicating no non-repeating character
    }

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call the method to find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(text);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        // Close the scanner
        scanner.close();
    }
}
