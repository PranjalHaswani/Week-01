import java.util.*;
public class UniversityDiscount{
    public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	System.out.println("Enter the student fee (INR) : ");
		double fee = input.nextDouble();  // Create a double fee 
		System.out.println("Enter the university discount percentage : ");  
		double discountPercent = input.nextDouble();  // Create a double discountPercent 
		double discount =(fee * discountPercent) / 100; 
		double discountedFee = fee - discount;
	System.out.println("The Discount amount is INR" + discount + "and final discount fee is INR" + discountedFee); //Display the result
		}
}	