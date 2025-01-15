import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert both texts to lower case for case-insensitive comparison
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();

        // If the lengths are not equal, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create frequency arrays for both texts
        int[] freq1 = new int[26]; // for 'a' to 'z'
        int[] freq2 = new int[26]; // for 'a' to 'z'

        // Calculate frequency of characters in text1 and text2
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i) - 'a']++; // frequency of characters in text1
            freq2[text2.charAt(i) - 'a']++; // frequency of characters in text2
        }

        // Compare the frequency arrays of both texts
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false; // frequencies do not match, not anagrams
            }
        }

        // If all frequencies match, the texts are anagrams
        return true;
    }

    public static void main(String[] args) {
        // Create a scanner to read user inputs
        Scanner scanner = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        // Close the scanner
        scanner.close();
    }
}
