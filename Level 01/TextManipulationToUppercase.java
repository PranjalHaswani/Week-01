import java.util.Scanner;

public class TextManipulationToUppercase {

    // Method to convert text to uppercase by using ASCII values
    public static String toUpperCaseUsingCharAt(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // If the character is a lowercase letter, convert it to uppercase
            if (currentChar >= 'a' && currentChar <= 'z') {
                result.append((char)(currentChar - 32)); 
            } else {
                result.append(currentChar); 
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        String uppercaseTextCharAt = toUpperCaseUsingCharAt(input);
    
        String uppercaseTextBuiltIn = input.toUpperCase();
       
        boolean isEqual = compareStrings(uppercaseTextCharAt, uppercaseTextBuiltIn);
      
        System.out.println("Text after conversion to uppercase using charAt(): " + uppercaseTextCharAt);
        System.out.println("Text after conversion to uppercase using built-in toUpperCase(): " + uppercaseTextBuiltIn);
        System.out.println("Are both uppercase texts equal? " + isEqual);
        
        scanner.close();
    }
}
