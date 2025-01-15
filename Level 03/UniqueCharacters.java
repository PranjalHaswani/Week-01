import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the text without using the String method length()
    public static int getStringLength(String text) {
        int length = 0;
        // Loop through the string using charAt() and count characters until reaching the end
        while (true) {
            try {
                text.charAt(length);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to find unique characters in the text using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = getStringLength(text);  // Get the length of the text
        char[] result = new char[length];    // Array to store the unique characters
        int resultIndex = 0;  // Index to store unique characters in the result array
        
        // Outer loop to iterate through each character in the text
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            // Inner loop to compare current character with previous ones
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;  // The character is not unique
                    break;
                }
            }

            // If the character is unique, store it in the result array
            if (isUnique) {
                result[resultIndex++] = currentChar;
            }
        }

        // Create a new array with exact size to store unique characters
        char[] uniqueChars = new char[resultIndex];
        System.arraycopy(result, 0, uniqueChars, 0, resultIndex);

        return uniqueChars;
    }

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call the method to find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Display the result
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
