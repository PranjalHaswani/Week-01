import java.util.*;
public class CalculateSimpleInterest {
	public static double interest( double Principal, double Rate, double Time) {
		double SimpleInterest =(Principal*Rate*Time)/100;
		return SimpleInterest;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Principal, Rate, Time: ");
		
		double Principal= sc.nextDouble();
		double Rate= sc.nextDouble();
		double Time= sc.nextDouble();
		double result= CalculateSimpleInterest.interest(Principal,Rate,Time);
		
		//Display the result
		System.out.println("The Simple Interest is" + result + " for Principal "+ Principal+ ", Rate of Interest" +Rate+ " and Time" +Time);
	sc.close();
}
}
		
	