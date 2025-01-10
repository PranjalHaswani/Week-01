import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize factorial variable to 1
            long factorial = 1;

            // Use a for loop to calculate the factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by i
            }

            // Print the factorial result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
