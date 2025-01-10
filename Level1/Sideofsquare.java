import java.util.Scanner;
public class Sideofsquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter perimeter of square: "); //Display perimeter
        double perimeter = scanner.nextDouble();
        double side = perimeter / 4;       
    System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);//Display result
    }
}
