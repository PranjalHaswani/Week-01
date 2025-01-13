public class UnitConverterStatic {
	  public static double convertYardsToFeet(double yards) {
        return yards * 3; // 1 yard = 3 feet
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet / 3; // 1 foot = 1/3 yard
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701; // 1 meter = 39.3701 inches
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254; // 1 inch = 0.0254 meters
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54; // 1 inch = 2.54 centimeters
    }

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371; // 1 kilometer = 0.621371 miles
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934; // 1 mile = 1.60934 kilometers
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084; // 1 meter = 3.28084 feet
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048; // 1 foot = 0.3048 meters
    }

    public static void main(String[] args) {
        
        // Convert yards to feet
        double yards = 3;
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");

        // Convert feet to yards
        double feet = 0.333333;
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        // Convert meters to inches
        double meters = 1;
        System.out.println(meters + " meter = " + convertMetersToInches(meters) + " inches");

        // Convert inches to meters
        double inches = 39.3701;
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");

        // Convert inches to centimeters
        double inchesForCm = 2.54;
        System.out.println(inchesForCm + " inches = " + convertInchesToCentimeters(inchesForCm) + " centimeters");

        // Convert kilometers to miles
        double km = 5;
        System.out.println(km + " kilometers = " + convertKmToMiles(km) + " miles");

        // Convert miles to kilometers
        double miles = 3.1;
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " kilometers");

        // Convert meters to feet
        double metersForFeet = 2;
        System.out.println(metersForFeet + " meters = " + convertMetersToFeet(metersForFeet) + " feet");

        // Convert feet to meters
        double feetForMeters = 6.56168;
        System.out.println(feetForMeters + " feet = " + convertFeetToMeters(feetForMeters) + " meters");
    }
}