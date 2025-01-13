import java.util.Scanner;

public class QuadraticEquation {
	 public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculating delta
        double[] roots = new double[0]; // Initialize an empty array for roots

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);  // First root
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);  // Second root
            roots = new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root exists
            double root = -b / (2 * a);  // Single root
            roots = new double[]{root};
        } // If delta < 0, no real roots, return empty array

        return roots;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Ensure that a is not zero, because it would not be a quadratic equation
        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero. This is not a quadratic equation.");
        } else {
            // Find the roots of the quadratic equation
            double[] roots = findRoots(a, b, c);

            if (roots.length == 0) {
                System.out.println("The equation has no real roots.");
            } else if (roots.length == 1) {
                System.out.println("The equation has one real root: " + roots[0]);
            } else {
                System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
            }
        }
        scanner.close();
    }
}