import java.util.*;
public class NaturalNumbers{
	public static int sumofnaturalnumbers(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+= i; // Add current number to sum
		}
		return sum;
	}	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number(n):");// Ask user for an integer input
		int number= sc.nextInt();
		int sum= sumofnaturalnumbers(number);
		 System.out.println("The sum of the first " + number + " natural numbers is: " + sum);//Display the sum
	sc.close();
}
}
		
	