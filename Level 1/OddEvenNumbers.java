import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Create a Scanner object to read input
     System.out.print("Enter a number: ");  // Get the number from the user
        int number = sc.nextInt();

        // Validate if the input is a positive natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a valid natural number greater than 0.");
            return;  // Exit the program if the input is not valid
        }
        int[] oddNumbers = new int[number / 2 + 1];  // Odd numbers array
        int[] evenNumbers = new int[number / 2 + 1]; // Even numbers array

        // Initialize index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;
      for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // If the number is even, save it to the evenNumbers array
                evenNumbers[evenIndex++] = i;
            } else {
                // If the number is odd, save it to the oddNumbers array
                oddNumbers[oddIndex++] = i;
            }
        }
      System.out.print("Odd numbers: ");// Print the odd numbers array
        for (int i = 0; i < oddIndex; i++) {
      System.out.print(oddNumbers[i] + " ");
        }
      System.out.println(); // New line after printing odd numbers
        System.out.print("Even numbers: "); // Print the even numbers array
        for (int i = 0; i < evenIndex; i++) {
        System.out.print(evenNumbers[i] + " ");
        }
		
        sc.close(); 
        // Close the scanner
    }
}
