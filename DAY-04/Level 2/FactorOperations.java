import java.util.Scanner;

public class FactorOperations {
	 public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
       
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of the squares of the factors
    public static double sumOfSquareOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        // Find and display the product of the factors
        int product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);

        // Find and display the sum of squares of the factors
        double sumOfSquares = sumOfSquareOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        scanner.close();   // Close the scanner
    }
}