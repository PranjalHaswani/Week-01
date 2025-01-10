import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter temperature in Celsius: ");//Display the temperature
        double celsius = scanner.nextDouble();
        double fahrenheitResult = (celsius * 9/5) + 32;
    System.out.println("The" + celsius + " celsius is " + fahrenheitResult + " fahrenheit");//Display the result
    }
}
