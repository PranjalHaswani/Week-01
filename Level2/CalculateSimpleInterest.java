import java.util.Scanner;
public class CalculateSimpleInterest {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();// Create a double rate
        double time = sc.nextDouble();// Create a double time
        double simpleInterest = (principal * rate * time) / 100;// Calculate the simple interest
    System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);//Display the result
    }
}
