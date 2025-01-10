import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter value for a: ");// Display value for a
        double a = scanner.nextDouble();
    System.out.print("Enter value for b: ");// Display value for b
        double b = scanner.nextDouble();
    System.out.print("Enter value for c: ");// Display value for c
        double c = scanner.nextDouble();
        double result1 = a + b * c;// Create a double radius1
        double result2 = a * b + c;// Create a double radius2
        double result3 = c + a / b;// Create a double radius3
        double result4 = a % b + c;// Create a double radius4
    System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);// Display the result
    }
}
