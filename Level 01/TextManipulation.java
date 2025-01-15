import java.util.Scanner;

public class TextManipulation {

    // Method to convert text to lowercase by using ASCII values
    public static String toLowerCaseUsingCharAt(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // If the character is an uppercase letter, convert it to lowercase
            if (currentChar >= 'A' && currentChar <= 'Z') {
                result.append((char)(currentChar + 32)); // ASCII difference between uppercase and lowercase
            } else {
                result.append(currentChar); // Non-alphabetic characters remain unchanged
            }
        }
        
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
               return true; 
    }

    // Method to split the text into words using charAt() (without using split())
    public static String[] splitTextIntoWords(String input) {
        // Use a StringBuilder to accumulate words
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // If the character is a space, it signifies the end of a word
            if (currentChar == ' ') {
                if (word.length() > 0) {
                    result.append(word.toString()).append(" "); // Add the word to the result string
                    word.setLength(0); // Reset word for next accumulation
                }
            } else {
                word.append(currentChar); // Add the character to the current word
            }
        }
        
        // Add the last word if there is any
        if (word.length() > 0) {
            result.append(word.toString());
        }

        return result.toString().trim().split(" "); // Returning the words as an array
    }

    // Method to find and return the length of a string without using the length() method
    public static String getStringLengthWithoutLengthMethod(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++; // Increment length for each character
        }
        return String.valueOf(length); // Return the length as a string
    }

    // Method to return 2D array of words and their corresponding lengths
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2]; // 2D array [word, length]
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Word
            result[i][1] = getStringLengthWithoutLengthMethod(words[i]); // Length of word
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = scanner.nextLine();
 
        String lowercaseText = toLowerCaseUsingCharAt(input);
        
        String standardLowercaseText = input.toLowerCase();
        
        boolean isEqual = compareStrings(lowercaseText, standardLowercaseText);
        System.out.println("Text after conversion to lowercase using charAt(): " + lowercaseText);
        System.out.println("Text after conversion to lowercase using built-in toLowerCase(): " + standardLowercaseText);
        System.out.println("Are both lowercase texts equal? " + isEqual);
      
        String[] words = splitTextIntoWords(input);
        String[][] wordLengths = getWordsWithLength(words);
        
        System.out.println("\nWords and their lengths:");
        System.out.println("Word\tLength");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + Integer.valueOf(wordLength[1]));
        }

        scanner.close();
    }
}
