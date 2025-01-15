import java.util.Scanner;

public class SplitTextComparison {

    // Method to find the length of a String without using the built-in length() method
    public static int getStringLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When we go beyond the end of the string, we catch the exception
        }
        return length;
    }

    // Method to split the text into words using the charAt() method without using the split() method
    public static String[] splitText(String str) {
        // Count the number of words
        int wordCount = 1;  // Start with one word
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create an array to store words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        int start = 0;

        // Iterate through the string to extract words
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || i == str.length() - 1) {
                // Extract the word and store it in the words array
                if (i == str.length() - 1 && str.charAt(i) != ' ') {
                    i++;
                }
                words[wordIndex] = str.substring(start, i);
                wordIndex++;
                start = i + 1;  // Update the starting index for the next word
            }
        }

        return words;
    }

    // Method to compare two String arrays and return a boolean
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input string
        System.out.print("Enter a sentence: ");
        String inputString = scanner.nextLine();

        // Call the user-defined splitText method to split the text
        String[] userDefinedWords = splitText(inputString);

        // Call the built-in split() method to split the text
        String[] builtInWords = inputString.split("\\s+");

        // Compare the two arrays
        boolean areArraysEqual = compareStringArrays(userDefinedWords, builtInWords);

        // Display the results
        System.out.println("Words using user-defined method: ");
        for (String word : userDefinedWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using split() method: ");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        // Display comparison result
        System.out.println("\nAre the two arrays equal? " + areArraysEqual);

        scanner.close();
    }
}
