import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        // Create a object Scanner
        Scanner scanner = new Scanner(System.in);
		
		// enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Handle the case for negative numbers
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number; // Make the number positive for processing
        }
        // Find the count of digits in the number
        int digitCount = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            tempNumber /= 10;
            digitCount++;
        }

        // Store the digits of the number in an array
        int[] digits = new int[digitCount];
        tempNumber = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        // Display the digits in reverse order
        System.out.print("The reversed number is: ");
        if (isNegative) {
            System.out.print("-"); // Add the negative sign for negative numbers
        }
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }

        scanner.close();
    }
}