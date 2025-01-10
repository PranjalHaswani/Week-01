import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter value for a: ");// Display value for a
        int a = scanner.nextInt();
    System.out.print("Enter value for b: ");// Display value for b
        int b = scanner.nextInt();
    System.out.print("Enter value for c: ");// Display value for c
        int c = scanner.nextInt();      
        int result1 = a + b * c;// Create a int result1 
        int result2 = a * b + c;// Create a int result2
        int result3 = c + a / b;// Create a int result3
        int result4 = a % b + c;// Create a int result4
    System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);// Display the result
    }
}
