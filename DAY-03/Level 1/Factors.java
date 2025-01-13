import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);// Create a Scanner object to read input
        System.out.print("Enter a number to find its factors: "); // Take the number as input from the user
        int number = sc.nextInt();
        int maxFactor = 10;// Initialize the max size of the factors array and index variable
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find the factors of the number and store them in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)  // If i is a factor of number
			{
                // Check if the array is full, and resize if necessary
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the size of the array
                    
                    int[] temp = new int[maxFactor];// Create a new array of the increased size
                   
                    System.arraycopy(factors, 0, temp, 0, factors.length); // Copy all elements from the old array to the new one
                    factors = temp; // Assign the new array to factors
                }
                factors[index++] = i;   // Add the factor to the array and increment the index
            }
        }
        System.out.print("Factors of " + number + " are: ");// Display the factors
        for (int i = 0; i < index; i++) {
        System.out.print(factors[i] + " ");
        }
        System.out.println(); // Move to the next line
        sc.close(); // Close the scanner
    }
}
