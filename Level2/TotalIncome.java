import java.util.Scanner;
public class TotalIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();// Create a double salary 
        double bonus = sc.nextDouble();// Create a double bonus
        double totalIncome = salary + bonus;// Create a double totalIncome 
    System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);//Display the result
    }
}
