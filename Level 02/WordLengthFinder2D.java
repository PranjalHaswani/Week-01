import java.util.Scanner;

public class WordLengthFinder2D {

    // Method to split the text into words without using the built-in split() method
    public static String[] splitText(String str) {
        int wordCount = 1;  // Start with 1 word
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;  // Count spaces to determine number of words
            }
        }

        // Create an array to store words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        int start = 0;

        // Extract words based on spaces
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || i == str.length() - 1) {
                // If it's the last character or a space, extract the word
                if (i == str.length() - 1 && str.charAt(i) != ' ') {
                    i++;
                }
                words[wordIndex] = str.substring(start, i);
                wordIndex++;
                start = i + 1;
            }
        }

        return words;
    }

    // Method to find and return the length of a string without using the length() method
    public static int getStringLength(String str) {
        int length = 0;
        try {
            // Count characters until we get an exception (end of string)
            while (true) {
                str.charAt(length);  // Attempt to access each character by index
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When we go beyond the string, we catch the exception to stop counting
        }
        return length;
    }

    // Method to create a 2D array with words and their corresponding lengths
    public static String[][] getWordAndLength(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];  // Store the word
            wordLengthArray[i][1] = String.valueOf(getStringLength(words[i]));  // Store the length as a String
        }

        return wordLengthArray;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResult(String[][] result) {
        System.out.println("Word\t\tLength");
        System.out.println("-----------------------");
        for (int i = 0; i < result.length; i++) {
            // Convert length from String to Integer for proper display formatting
            int length = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t\t" + length);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input string
        System.out.print("Enter a sentence: ");
        String inputString = scanner.nextLine();

        // Call splitText to get words from the input string
        String[] words = splitText(inputString);

        // Call getWordAndLength to create the word and length 2D array
        String[][] wordLengthArray = getWordAndLength(words);

        // Display the result in a tabular format
        displayResult(wordLengthArray);

        scanner.close();
    }
}
