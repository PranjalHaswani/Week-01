import java.util.Scanner;

public class BMICalculator {
    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        // BMI = weight (kg) / height (m)²
        return weight / (height * height);
    }

    // Method to determine weight status based on BMI
    public static String getWeightStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");// Taking the number of persons as input
        int numPersons = sc.nextInt();

        // Arrays to store weight, height, BMI, and weight status for each person
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] weightStatus = new String[numPersons];
        // Input weight and height for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight (in kg): "); // Input weight and height
            weights[i] = sc.nextDouble();

            System.out.print("Enter height (in meters): ");
            heights[i] = sc.nextDouble();
            bmis[i] = calculateBMI(weights[i], heights[i]);// Calculate BMI for the person
            weightStatus[i] = getWeightStatus(bmis[i]);     // Determine the weight status based on the BMI
        }
        System.out.println("\nResults:"); // Display the results
        System.out.println("Person | Weight (kg) | Height (m) | BMI | Weight Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%d | %.2f | %.2f | %.2f | %s\n", 
                i + 1, weights[i], heights[i], bmis[i], weightStatus[i]);
        }
        sc.close();
    }
}
