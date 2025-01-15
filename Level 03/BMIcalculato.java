import java.util.Scanner;

public class BMIcalculator {

    // Method to calculate BMI and return status based on BMI
    public static double calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;
        // Calculate BMI using the formula: BMI = weight / (height * height)
        return weight / (height * height);
    }

    // Method to get the status based on the calculated BMI
    public static String getBMIStatus(double bmi) {
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

    // Method to process and calculate BMI for all 10 team members
    public static String[][] calculateAndStoreBMI(double[][] heightWeight) {
        String[][] results = new String[10][4];  // Array to store the height, weight, BMI, and status
        
        for (int i = 0; i < 10; i++) {
            double weight = heightWeight[i][0];  // weight in kg
            double height = heightWeight[i][1];  // height in cm

            double bmi = calculateBMI(weight, height);  // calculate BMI
            String status = getBMIStatus(bmi);  // get BMI status

            // Store the results in the 2D array (height, weight, BMI, status)
            results[i][0] = String.format("%.2f", height);  // height in cm
            results[i][1] = String.format("%.2f", weight);  // weight in kg
            results[i][2] = String.format("%.2f", bmi);     // BMI value
            results[i][3] = status;  // BMI status
        }
        
        return results;
    }

    // Method to display the BMI details in a tabular format
    public static void displayBMIResults(String[][] results) {
        // Print the header for the table
        System.out.println("Person\tHeight (cm)\tWeight (kg)\tBMI\t\tStatus");
        System.out.println("-------------------------------------------------------------");

        // Display the details for each person
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t\t%s\n", 
                i + 1, results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a 2D array to store the height and weight of 10 persons
        double[][] heightWeight = new double[10][2];

        // Take input for weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            heightWeight[i][0] = scanner.nextDouble();  // weight input

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heightWeight[i][1] = scanner.nextDouble();  // height input
        }

        // Calculate BMI and get status for each person
        String[][] results = calculateAndStoreBMI(heightWeight);

        // Display the results in tabular format
        displayBMIResults(results);

        // Close the scanner
        scanner.close();
    }
}
