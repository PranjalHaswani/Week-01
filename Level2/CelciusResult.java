import java.util.Scanner;
public class CelciusResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit = sc.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5.0 / 9.0;
    System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");// Display the result
    }
}

