import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters using nested loops
    public static String[] findCharacterFrequency(String text) {
        // Convert the text to a character array
        char[] chars = text.toCharArray();

        // Array to store the frequency of each character (initialized to 0)
        int[] frequency = new int[chars.length];

        // Array to store the unique characters
        char[] uniqueChars = new char[chars.length];

        // Outer loop to iterate through each character
        for (int i = 0; i < chars.length; i++) {
            // Skip if the character is already counted (marked as '0')
            if (chars[i] == '0') {
                continue;
            }

            // Initialize frequency of each unique character to 1
            frequency[i] = 1;

            // Inner loop to check for duplicate characters
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    // Increment frequency and mark duplicate as '0'
                    frequency[i]++;
                    chars[j] = '0'; // Mark this character as processed
                }
            }

            // Store the unique character in the uniqueChars array
            uniqueChars[i] = chars[i];
        }

        // Create a String array to store the characters and their frequencies
        String[] result = new String[chars.length];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = uniqueChars[i] + ": " + frequency[i];
            }
        }

        // Return the result array
        return result;
    }

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call the method to find character frequency
        String[] frequencyResult = findCharacterFrequency(text);

        // Display the results
        System.out.println("Character Frequencies:");
        for (String result : frequencyResult) {
            if (result != null) {
                System.out.println(result);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
