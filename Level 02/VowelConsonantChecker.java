import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert to lowercase if it's an uppercase letter using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);  // Convert uppercase to lowercase
        }

        // Check if the character is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string and return the character and its type in a 2D array
    public static String[][] findVowelsAndConsonants(String str) {
        String[][] result = new String[str.length()][2]; // 2D array to store characters and their types

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);   // Store the character
            result[i][1] = checkCharacterType(ch);  // Store the type of character (Vowel/Consonant/Not a Letter)
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResult(String[][] result) {
        System.out.println("Character\tType");
        System.out.println("--------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call findVowelsAndConsonants to get the result in 2D array
        String[][] result = findVowelsAndConsonants(inputString);

        // Display the result in tabular format
        displayResult(result);

        scanner.close();
    }
}
