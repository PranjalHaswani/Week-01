import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize scanner and take input from the user
       System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
        final int maxDigits = 10; // Define the max digit size and array to store digits
        int[] digits = new int[maxDigits];
        int index = 0;

        // Store digits in the array, breaking when number is 0 or maxDigits is reached
        while (number != 0 && index < maxDigits) {
            digits[index] = number % 10;  // Extract the last digit
            number = number / 10; // Remove the last digit from the number
            index++;
        }

        // Variables to store the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // Find the largest and second largest digits by looping through the array
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;  // Update second largest before largest
                largest = digits[i];
            }else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output the results
        if (largest != -1 && secondLargest != -1) {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Not enough unique digits to find both largest and second largest.");
        }

        sc.close();
    }
}