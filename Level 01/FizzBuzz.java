import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);  // Create a Scanner object to take input
        System.out.print("Enter a positive integer: "); // Take input from the user
        int number = sc.nextInt();

        // Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;  // Exit the program if the number is not valid
        }
        String[] results = new String[number + 1];
        // Create a String array to store results
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";  // For multiples of both 3 and 5
            } else if (i % 3 == 0) {
                results[i] = "Fizz";  // For multiples of 3
            } else if (i % 5 == 0) {
                results[i] = "Buzz";  // For multiples of 5
            } else {
                results[i] = String.valueOf(i);  // For all other numbers
            }
        }
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);    // Print the results in the required format
        }
        sc.close();  // Close the scanner
    }
}