public class UnitConverterYards {
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
    }
}