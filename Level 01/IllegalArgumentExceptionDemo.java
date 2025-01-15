import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate the IllegalArgumentException
    public static void generateException(String input) {
        try {
            String result = input.substring(5, 3); // This will generate an exception
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
            throw e; // Re-throwing to show the method's exception handling
        }
    }

    // Method to handle a generic runtime exception
    public static void handleRuntimeException(String input) {
        try {
            generateException(input);  // Call the method that generates the exception
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException in the main method: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Handled general exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
    
        System.out.println("Calling method to generate exception...");
        generateException(userInput);

        System.out.println("Calling method to handle the exception...");
        handleRuntimeException(userInput);
        
        scanner.close();
    }
}
