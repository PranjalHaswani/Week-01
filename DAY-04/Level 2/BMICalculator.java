import java.util.Scanner;

public class BMICalculator {
	 public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0]; // weight in kg
            double heightCm = personData[i][1]; // height in cm
            double heightM = heightCm / 100; // convert height from cm to meters

            double bmi = weight / (heightM * heightM);
            personData[i][2] = bmi;
        }
    }

    // Method to determine BMI status for each person
    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];

        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight (kg), height (cm), and BMI (in the 3rd column)
        double[][] personData = new double[10][3];

        // Taking input for weight and height
        for (int i = 0; i < personData.length; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = scanner.nextDouble();
            System.out.println();
        }

        calculateBMI(personData);
        String[] status = determineBMIStatus(personData);

        // Display the results
        System.out.println("\nBMI Calculation Results:");
        System.out.printf("%-10s%-10s%-10s%-20s\n", "Weight (kg)", "Height (cm)", "BMI", "Status");

        for (int i = 0; i < personData.length; i++) {
            System.out.printf("%-10.2f%-10.2f%-10.2f%-20s\n", personData[i][0], personData[i][1], personData[i][2], status[i]);
        }

        scanner.close();
    }
}