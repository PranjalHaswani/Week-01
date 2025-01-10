import java.util.Scanner;
public class AreaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter base in inches: ");//Display base
        double baseInches = scanner.nextDouble();
    System.out.print("Enter height in inches: ");// Display height 
        double heightInches = scanner.nextDouble();
        double areaInches = 0.5 * baseInches * heightInches;
        double areaCm = areaInches * 6.4516;
    System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");//Display the result
    }
}
