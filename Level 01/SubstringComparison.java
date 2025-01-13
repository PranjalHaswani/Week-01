import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take input from the user

        System.out.println("Enter a string:");
        String inputString = scanner.next();

        System.out.println("Enter the start index:");
        int startIndex = scanner.nextInt();

        System.out.println("Enter the end index:");
        int endIndex = scanner.nextInt();

        // Create substring using charAt()
        String substringFromCharAt = createSubstringUsingCharAt(inputString, startIndex, endIndex);
        System.out.println("Substring using charAt(): " + substringFromCharAt);

        // Create substring using String's built-in substring() method
        String substringFromBuiltIn = inputString.substring(startIndex, endIndex);
        System.out.println("Substring using substring(): " + substringFromBuiltIn);

        // Compare the two substrings
        boolean areEqual = compareStringsUsingCharAt(substringFromCharAt, substringFromBuiltIn);
        if (areEqual) {
            System.out.println("The substrings are the same.");
        } else {
            System.out.println("The substrings are different.");
        }

        // Close the scanner
        scanner.close();
    }
}
