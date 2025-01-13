import java.util.Scanner;

public class EmployeeBonusinZara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int numberofemployees=10;

    // Define arrays for salary, years of service, bonus, and new salary
        double salaries []= new double[numberofemployees];
        double yearsOfService []= new double[numberofemployees];
        double bonus []= new double[numberofemployees];
        double newSalary []= new double[numberofemployees];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

    // Loop to input data for 10 employees
        for (int i = 0; i < 10; i++) {
        
		// Get valid salary
		System.out.println("Enter the salary: ");
		double salary = sc.nextDouble();
		if(salary>=0) {
		salaries[i] = salary;
		}
		else{
			System.err.println("Invalid salary, Please enter a positive value.");
		}
		// Get valid years of service
		System.out.println("Enter years of service:");
		double years = sc.nextDouble();
		if(years>=0){
			yearsOfService[i]= years;
		}
		else {
			System.out.println("Invalid years of service, Please enter a positive value.");
		}
	}
		// Calculate bonus, new salary, snd totals
		for(int i=0; i<numberofemployees; i++){
			if(yearsOfService[i]>5){
				bonus[i]= 0.05 * salaries[i]; //for 5% bonus
			}
			else{
				bonus[i]= 0.02 * salaries[i]; // for 2% bonus
			}
			newSalary[i] = salaries[i] + bonus[i];
			totalBonus += bonus[i];
			totalOldSalary += salaries[i];
			totalNewSalary += newSalary[i];
		}
		
		//Print th result
		System.out.println("\nEmployee Bonus Details :");
            for (int i=0; i<numberofemployees; i++) {
         System.out.println("Employee " +(i+1) + ": Old Salary = "+ salaries[i] + " , Bonus = " + bonus[i] + ", New Salary =" + newSalary[i]);
			}
         System.out.println("\nTotal Bonus Payout: " + totalBonus);	
         System.out.println("\nTotal Old Salary: " + totalOldSalary);	
         System.out.println("\nTotal New Salary: " + totalNewSalary);		
	sc.close();
    }
}