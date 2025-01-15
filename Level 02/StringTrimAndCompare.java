public class StringTrimAndCompare {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;
        // Loop to find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        // Loop to find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    // Method to create a substring using charAt() with start and end indices
    public static String getSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    // Method to compare two strings using charAt() and return boolean result
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
    public static void main(String[] args) {
        // Input string with leading and trailing spaces
        String inputString = "   Hello, World!   ";

        // Call the trimSpaces method to find the start and end indices of the non-space characters
        int[] trimmedIndices = trimSpaces(inputString);
        int start = trimmedIndices[0];
        int end = trimmedIndices[1];

        // Get the substring using the charAt() method
        String trimmedSubstring = getSubstring(inputString, start, end);

        // Trim using the built-in trim() method for comparison
        String builtInTrimmed = inputString.trim();

        // Compare the results
        boolean areEqual = compareStrings(trimmedSubstring, builtInTrimmed);

        // Display results
        System.out.println("Trimmed substring using charAt(): '" + trimmedSubstring + "'");
        System.out.println("Trimmed string using built-in trim(): '" + builtInTrimmed + "'");
        System.out.println("Are the results equal? " + areEqual);
    }
}
