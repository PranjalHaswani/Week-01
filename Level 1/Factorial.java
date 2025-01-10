import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to take input from the user
        System.out.print("Enter a positive integer: "); // Prompt the user to input a number
        int number = scanner.nextInt();   // Check if the number is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long factorial = 1;  // Initialize factorial variable to 1
            int i = 1;
            while (i <= number)// Use a while loop to calculate the factorial
			{
                factorial *= i; // Multiply factorial by i
                i++; // Increment i
            }
            System.out.println("The factorial of " + number + " is: " + factorial); // Print the factorial result
        }
        scanner.close();// Close the scanner to avoid resource leak
    }
}
