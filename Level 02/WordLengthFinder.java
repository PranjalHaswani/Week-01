import java.util.Scanner;

public class WordLengthFinder {

    // Method to split the text into words using charAt() method without using the split() method
    public static String[] splitText(String str) {
        // Count the number of words by checking spaces
        int wordCount = 1; // Start with one word
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

    // Method to find and return a string's length without using the length() method
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

    // Method to create a 2D array containing words and their corresponding lengths
    public static String[][] getWordAndLength(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // The word
            wordLengthArray[i][1] = String.valueOf(getStringLength(words[i])); // The length of the word
        }

        return wordLengthArray;
    }

    // Method to find the shortest and longest word from the 2D array of word and corresponding length
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int[] result = new int[2]; // Indexes for shortest and longest words
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;

        // Iterate through the word-length array to find the shortest and longest words
        for (int i = 0; i < wordLengthArray.length; i++) {
            int wordLength = Integer.parseInt(wordLengthArray[i][1]);

            if (wordLength < minLength) {
                minLength = wordLength;
                result[0] = i; // Store the index of the shortest word
            }

            if (wordLength > maxLength) {
                maxLength = wordLength;
                result[1] = i; // Store the index of the longest word
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input string
        System.out.print("Enter a sentence: ");
        String inputString = scanner.nextLine();

        // Call the user-defined splitText method to split the text into words
        String[] words = splitText(inputString);

        // Call getWordAndLength to get the word and length 2D array
        String[][] wordLengthArray = getWordAndLength(words);

        // Call findShortestAndLongest to find the shortest and longest word indexes
        int[] shortestAndLongestIndexes = findShortestAndLongest(wordLengthArray);

        // Display the words and their lengths
        System.out.println("\nWords and their lengths:");
        for (String[] wordLength : wordLengthArray) {
            System.out.println(wordLength[0] + " - " + wordLength[1] + " characters");
        }

        // Display the shortest and longest words
        System.out.println("\nShortest word: " + wordLengthArray[shortestAndLongestIndexes[0]][0]);
        System.out.println("Longest word: " + wordLengthArray[shortestAndLongestIndexes[1]][0]);

        scanner.close();
    }
}
