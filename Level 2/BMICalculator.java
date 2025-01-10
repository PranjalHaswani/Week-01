import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for weight (in kg) and height (in cm)
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter height (in cm): ");
        double heightInCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightInMeters = heightInCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightInMeters * heightInMeters);

        // Output the BMI
        System.out.println("BMI: " + bmi);

        // Determine the weight status based on BMI
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }
    }
}
