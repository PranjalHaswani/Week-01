import java.util.Scanner;

public class CharacterFrequency2D {

    // Method to find the frequency of characters in the text
    public static String[][] findCharacterFrequency(String text) {
        // Create an array to store the frequency of each character (using ASCII values)
        int[] frequency = new int[256]; // 256 ASCII characters

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Create an array to store unique characters and their frequencies
        String[][] result = new String[256][2];
        int resultIndex = 0;  // Index to track where to store in the result array

        // Loop through the frequency array and store characters with non-zero frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[resultIndex][0] = String.valueOf((char) i);  // Character
                result[resultIndex][1] = String.valueOf(frequency[i]);  // Frequency
                resultIndex++;
            }
        }

        // Create a new 2D array with the correct size (resultIndex)
        String[][] finalResult = new String[resultIndex][2];
        System.arraycopy(result, 0, finalResult, 0, resultIndex);

        return finalResult;
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
