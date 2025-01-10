import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to take input from the user
        System.out.print("Enter a number: ");    // Prompt the user to input a number
        int number = scanner.nextInt();
        for (int i = 6; i <= 9; i++) // Loop to print the multiplication table for the number from 6 to 9
		{
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        scanner.close();   // Close the scanner to avoid resource leak
    }
}
