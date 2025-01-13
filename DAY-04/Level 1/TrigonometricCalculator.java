import java.util.Scanner;
public class TrigonometricCalculator {
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate the trigonometric functions using Math class methods
        double sinValue = Math.sin(radians);// Sine of angle
        double cosValue = Math.cos(radians);// Cosine of angle
        double tanValue = Math.tan(radians);// Tangent of angle
        return new double[]{sinValue, cosValue, tanValue};// Return the values 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the angle in degrees: ");// Ask the user to input the angle in degrees
        double angle = sc.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);  // Call the method to calculate trigonometric functions
       System.out.println("For the angle " + angle + " degrees:");// Display the results;
       System.out.println("Sine: " + results[0]);
       System.out.println("Cosine: " + results[1]);
       System.out.println("Tangent: " + results[2]);
        sc.close();// Close the scanner object
    }
}
