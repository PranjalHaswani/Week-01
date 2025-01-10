import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to take input from the user
        System.out.print("Enter a number: ");  // Prompt the user to input a number
        int number = scanner.nextInt();
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0 ? "Yes" : "No"));// Check if the number is divisible by 5
        scanner.close();  // Close the scanner to avoid resource leak
    }
}

