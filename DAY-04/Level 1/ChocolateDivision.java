import java.util.Scanner;

public class ChocolateDivision {
	   public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check if there are children to divide chocolates among
        if (numberOfChildren == 0) {
            System.out.println("There must be at least one child to divide the chocolates.");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child will get " + result[0] + " chocolates."); // Display the results
            System.out.println("Remaining chocolates: " + result[1]);
        }

        // Close the scanner object
        scanner.close();
    }
}