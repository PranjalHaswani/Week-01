import java.util.Scanner;

public class ReturnCharacters {
    
    // Method to convert a string to a character array without using toCharArray() method
    public static char[] customToCharArray(String str) {
        char[] charArray = new char[str.length()];// Create an array of the same length as the string
        
        // Copy each character from the string into the array
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    
    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false; // If lengths are not equal, arrays are not equal
        }
        
        // Compare each element of both arrays
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; 
            }
        }
        
        return true; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
        
        // Convert the string to character arrays using both methods
        char[] customArray = customToCharArray(inputString);
        char[] builtInArray = inputString.toCharArray();
        
        // Compare both arrays
        boolean areArraysEqual = compareCharArrays(customArray, builtInArray); 
        System.out.println("Custom method array: " + new String(customArray));
        System.out.println("Built-in toCharArray() array: " + new String(builtInArray));
        System.out.println("Are both character arrays equal? " + areArraysEqual);      
        scanner.close();
    }
}
