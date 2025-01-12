import java.util.Scanner;

public class SumOfNaturalNumbers {
	 public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;  
        } else {
            return n + sumUsingRecursion(n - 1);  
		}
	}
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;  // Formula for sum of first n natural numbers
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the number is a valid natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            scanner.close();
            return;  // Exit if input is invalid
        }
        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the correct result.");
        } else {
            System.out.println("There is an error in the calculations.");
        }

        // Close the scanner
        scanner.close();
    }
}