import java.util.Scanner;
public class Displaytheresult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Create a Scanner object to read input
        // Get the number from the user
        System.out.print("Enter a number to display its multiplication table from 6 to 9: ");
        int number = sc.nextInt();
        int[][] multiplicationResult = new int[4][10]; // 4 rows for 6 to 9, 10 columns for 1 to 10
        
        // Loop through numbers 6 to 9 and calculate the multiplication tables
        for (int i = 6; i <= 9; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                multiplicationResult[i - 6][j - 1] = i * j;  // Store the result in the array
                System.out.println(i + " * " + j + " = " + multiplicationResult[i - 6][j - 1]);
            }
            System.out.println(); // Empty line for better readability between tables
        }
        sc.close();// Close the scanner
    }
}
