import java.util.Scanner;

public class NumberChecker {
	 public static boolean isPositive(int number) {
        return number > 0;  
    }
    // Method to check whether a number is even or odd
    public static String isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";  
        } else {
            return "Odd";   
        }
    }
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; 
        } else if (number1 == number2) {
            return 0;  
        } else {
            return -1;  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            // Check if the number is positive or negative
            if (isPositive(num)) {
                System.out.println(num + " is Positive and " + isEvenOrOdd(num) + ".");
            } else {
                System.out.println(num + " is Negative.");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("First element is greater than the last element.");
        } else if (comparisonResult == 0) {
            System.out.println("First element is equal to the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
        scanner.close();
    }
}