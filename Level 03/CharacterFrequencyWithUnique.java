import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        // Create an array to track which characters have been added as unique
        boolean[] seen = new boolean[256];  // ASCII has 256 possible characters
        int uniqueCount = 0;

        // Count the unique characters
        for (int i = 0; i < text.length(); i++) {
            if (!seen[text.charAt(i)]) {
                seen[text.charAt(i)] = true;
                uniqueCount++;
            }
        }

        // Create an array to store the unique characters
        char[] uniqueChars = new char[uniqueCount];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (seen[text.charAt(i)]) {
                uniqueChars[index++] = text.charAt(i);
                seen[text.charAt(i)] = false; // Mark the character as processed
            }
        }

        return uniqueChars;
    }

    // Method to find the frequency of characters using ASCII values and unique characters
    public static String[][] findCharacterFrequency(String text) {
        // Create an array to store the frequency of each character (using ASCII values)
        int[] frequency = new int[256];

        // Loop through the text to count the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Get unique characters using the uniqueCharacters method
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store the unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters and store them with their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call the method to find character frequencies
        String[][] frequencyResult = findCharacterFrequency(text);

        // Display the results
        System.out.println("Character Frequencies:");
        for (String[] result : frequencyResult) {
            System.out.println(result[0] + ": " + result[1]);
        }

        // Close the scanner
        scanner.close();
    }
}
