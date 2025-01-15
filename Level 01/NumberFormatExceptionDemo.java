import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate the NumberFormatException
    public static void generateException(String text) {
        try {
            // Try to parse an integer from the text (this will fail if the text isn't a valid integer)
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
			
            System.out.println("NumberFormatException caught: " + e.getMessage());
            throw e; 
        }
    }

    // Method to handle the runtime exception (NumberFormatException and generic exceptions)
    public static void handleRuntimeException(String text) {
        try {
            // Call the method that generates the exception
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException in the main method: " + e.getMessage());
        } catch (Exception e) {
         
            System.out.println("Handled a generic exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter a string to convert to a number: ");
        String inputText = scanner.nextLine();
     
        System.out.println("\nCalling method to generate the exception...");
        generateException(inputText);

        System.out.println("\nCalling method to handle the exception...");
        handleRuntimeException(inputText);
        
        scanner.close();
    }
}
