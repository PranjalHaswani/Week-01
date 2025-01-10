import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Create a Scanner object to take input from the user
        System.out.print("Enter the salary: "); // Prompt the user to input the salary of the employee
        double salary = scanner.nextDouble();
        System.out.print("Enter the years of service: "); // Prompt the user to input the years of service of the employee
        int yearsOfService = scanner.nextInt();
        double bonus = 0;// Initialize the bonus amount
        if (yearsOfService > 5) // Check if the employee's years of service is more than 5
		{
            bonus = salary * 0.05;// Calculate the bonus (5% of salary)
        }
        System.out.println("The bonus amount is: " + bonus);  // Print the bonus amount
        scanner.close(); // Close the scanner to avoid resource leak
    }
}
