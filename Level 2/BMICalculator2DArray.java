import java.util.*;
public class BMICalculator2DArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of persons
        System.out.println("Enter the number of persons: ");
        int number = sc.nextInt();

        // Arrays to store height, weight, and BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input weight and height for each person
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

           System.out.println("Enter the weight in (kg)" );
            while (true) {
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] >=0) {
                    break;
                } else {
                    System.err.println("weight must be positive.Please enter again");
					System.exit(0);
                }
            }
			
            

            // Input height
               System.out.println("Enter the weight in kg ");
            while (true) {
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] >=0) {
                    break;
                } else {
                    System.err.println("height must be positive.Please enter again");
					System.exit(0);
                }
            } 
           
            

            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1]*personData[i][1]);

            // Determine weight status
            String status;
            if (personData[i][2]<= 18.4) {
                weightStatus[i] = "Underweight";
            } 
			else if (personData[i][2]>=18.5&&personData[i][2]<=24.9) {
                weightStatus[i] = "Normal weight";
            } 
			else if(personData[i][2]>=25.0 && personData[i][2]<=39.9) {
                weightStatus[i] = "Overweight";
            }
			else {
                weightStatus[i] = "Obese";
            }

          
		}

        // Display results
        System.out.println("Height (m)  Weight (kg)  BMI Status");
        for (int i = 0; i < number; i++) {
            System.out.println(" height " + personData[i][0] + " weight " + personData[i][1] + " BMI " + personData[i][2] + "  Status   " + weightStatus[i]);
        }
		
       sc.close();
    }
}
