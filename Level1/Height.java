import java.util.Scanner;

public class Height{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your height in cm: ");
        double heightCm = scanner.nextDouble();// Create a double heightCm
        double totalInches = heightCm / 2.54;// Create a double totalInches
        int feet = (int) totalInches / 12;// Create a int feet
        int inches = (int) totalInches % 12;
        
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);// Display the result
    }
}