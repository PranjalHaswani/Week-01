import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);// Create a Scanner object to read input
        System.out.print("Enter the number of rows: ");  // Take user input for rows and columns
            int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
            int columns = sc.nextInt();
            int[][] matrix = new int[rows][columns];// Create a 2D array (Matrix) of size rows x columns
        System.out.println("Enter the elements of the matrix:"); // Take user input for the matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
        System.out.print("Enter element at position (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] oneDArray = new int[rows * columns];// Create a 1D array to store all the elements of the 2D array
        int index = 0; // Index variable to store position in the 1D array

        // Loop through the 2D array and copy the elements to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneDArray[index++] = matrix[i][j];  // Copy element and increment index
            }
        }
        System.out.println("\nThe original 2D matrix:"); // Print the original 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
        System.out.print(matrix[i][j] + " ");
            }
        System.out.println(); 
        }
        System.out.println("\nThe 1D array with elements from the 2D array:");  // Print the 1D array with elements from the 2D array
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
        sc.close();// Close the scanner
    }
}
