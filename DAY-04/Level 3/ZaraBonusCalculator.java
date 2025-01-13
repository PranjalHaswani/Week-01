import java.util.Random;

public class ZaraBonusCalculator {
	 public static double[][] generateEmployeeData() {
        Random random = new Random();
        double[][] employeeData = new double[10][4]; // 10 employees, 4 columns (salary, years of service, new salary, bonus)

        for (int i = 0; i < 10; i++) {
            // Random salary between 10000 and 99999
            double salary = 10000 + (99999 - 10000) * random.nextDouble();
            int yearsOfService = 1 + random.nextInt(30);

            // Storing salary and years of service in the 2D array
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }
        return employeeData;
    }
    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateBonusAndSalary(double[][] employeeData) {
        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = 0;
            if (yearsOfService > 5) {
                bonus = salary * 0.05; // 5% bonus for more than 5 years of service
            } else {
                bonus = salary * 0.02; // 2% bonus for less than 5 years of service
            }
            double newSalary = salary + bonus;
            employeeData[i][2] = newSalary;
            employeeData[i][3] = bonus;
        }
        return employeeData;
    }
    public static void calculateAndDisplayTotals(double[][] employeeData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee Salary Details:");
        System.out.printf("%-10s%-20s%-20s%-15s%-15s\n", "Employee", "Old Salary", "Years of Service", "Bonus", "New Salary");

        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = employeeData[i][3];
            double newSalary = employeeData[i][2];
            System.out.printf("%-10d%-20.2f%-20d%-15.2f%-15.2f\n", (i + 1), oldSalary, yearsOfService, bonus, newSalary);
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }
        System.out.println("\nTotal Salary Details:");
        System.out.printf("%-20s%-20.2f\n", "Total Old Salary:", totalOldSalary);
        System.out.printf("%-20s%-20.2f\n", "Total New Salary:", totalNewSalary);
        System.out.printf("%-20s%-20.2f\n", "Total Bonus:", totalBonus);
    }

    public static void main(String[] args) {
        // Generate employee data (salary and years of service)
        double[][] employeeData = generateEmployeeData();

        // Calculate new salary and bonus for each employee
        employeeData = calculateBonusAndSalary(employeeData);

        // Calculate and display total old salary, new salary, and bonus
        calculateAndDisplayTotals(employeeData);
    }
}