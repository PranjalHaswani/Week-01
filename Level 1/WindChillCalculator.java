import java.util.Scanner;

public class WindChillCalculator {
	
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Using the provided formula to calculate wind chill
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();
        if (windSpeed < 3) {
            System.out.println("Wind chill is only valid for wind speeds of 3 mph or higher.");
        } else {
            double windChill = calculateWindChill(temperature, windSpeed);// Call the method to calculate the wind chill
            System.out.println("The wind chill temperature is: " + windChill + "°F");   
        }
        scanner.close();
    }
}