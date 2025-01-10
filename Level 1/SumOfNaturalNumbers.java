import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a natural number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the number is a valid natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {
            // Compute the sum using the formula n * (n + 1) / 2
            int formulaSum = n * (n + 1) / 2;

            // Compute the sum using a while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Display the results and compare
            System.out.println("Sum computed using the formula n*(n+1)/2: " + formulaSum);
            System.out.println("Sum computed using the while loop: " + loopSum);

            // Compare the results
            if (formulaSum == loopSum) {
                System.out.println("Both methods give the same result.");
            } else {
                System.out.println("The results do not match.");
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
