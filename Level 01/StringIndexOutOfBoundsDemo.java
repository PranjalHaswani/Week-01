import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate the StringIndexOutOfBoundsException
    public static void generateException(String text) {
        try {
            // Access an index beyond the length of the string
            char character = text.charAt(text.length()); // This will cause an exception because index is out of bounds
            System.out.println("Character at the given index: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the StringIndexOutOfBoundsException specifically
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
            throw e; // Re-throwing the exception to demonstrate exception handling in main method
        }
    }

    // Method to handle runtime exceptions
    public static void handleRuntimeException(String text) {
        try {
            // Call the method that generates the exception
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the StringIndexOutOfBoundsException specifically
            System.out.println("Handled StringIndexOutOfBoundsException in the main method: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other runtime exception
            System.out.println("Handled a generic exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        System.out.println("\nCalling method to generate the exception...");
        generateException(inputText);

        System.out.println("\nCalling method to handle the exception...");
        handleRuntimeException(inputText);

        scanner.close();
    }
}
