public class UnitConverter {
	  public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    // Main method to test the UnitConverter class
    public static void main(String[] args) {

        // Test temperature conversions
        double fahrenheit = 98.6;
        double celsius = 37;
        System.out.println(fahrenheit + " Fahrenheit is equal to " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
        System.out.println(celsius + " Celsius is equal to " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");

        // Test weight conversions
        double pounds = 150;
        double kilograms = 68;
        System.out.println(pounds + " pounds is equal to " + convertPoundsToKilograms(pounds) + " kilograms.");
        System.out.println(kilograms + " kilograms is equal to " + convertKilogramsToPounds(kilograms) + " pounds.");

        // Test volume conversions
        double gallons = 5;
        double liters = 20;
        System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");
        System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons.");
    }
}