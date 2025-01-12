import java.util.Scanner;

public class TriangleRun {
	// Method to calculate the perimeter of the triangle
    public static int calculatePerimeter(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }
    public static int calculateRounds(int perimeter) {
        
        double distanceToRun = 5000.0;// 5 km is 5000 meters
        return (int) Math.ceil(distanceToRun / perimeter);// Calculate number of rounds and round up to the nearest integer
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to input the three sides of the triangle
        System.out.print("Enter the length of side 1 (in meters): ");
        int side1 = scanner.nextInt();
        
        System.out.print("Enter the length of side 2 (in meters): ");
        int side2 = scanner.nextInt();
        
        System.out.print("Enter the length of side 3 (in meters): ");
        int side3 = scanner.nextInt();
        int perimeter = calculatePerimeter(side1, side2, side3);
        int rounds = calculateRounds(perimeter);
        System.out.println("The athlete must complete " + rounds + " rounds to cover 5 km."); // Display the result
        
        scanner.close(); // Close the scanner
    }
}