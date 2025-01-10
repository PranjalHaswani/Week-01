import java.util.Scanner;
public class Footballteamheight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Create a Scanner object to read input
        double[] heights = new double[11];// Create an array to store the heights of 11 players
        double sum = 0.0;// Variable to store the sum of all heights
        
        for (int i = 0; i < heights.length; i++) // Get the height of each player from the user 
		{
            System.out.print("Enter the height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];  // Add the current height to the sum
        }
        double mean = sum / heights.length; // Calculate the mean height
        System.out.println("The mean height of the football team is: " + mean); // Display the mean height
        sc.close();// Close the scanner
    }
}
