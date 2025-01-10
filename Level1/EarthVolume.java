public class EarthVolume{
    public static void main(String[] args){
	   double radius = 6378; // Create a double radius and assign value 6378
	   double kmtomiles = 0.621371; // Create a double kmtomiles and assign value 0.621371
	   double VolumeCubicKilometer =(4.0/ 3.0)* Math.PI * Math.pow(radius, 3); // using formula
	   double radiusMile = radius * kmtomiles;
	   double volumeCubicMile = (4.0 / 3.0) * Math.PI * Math.pow(radiusMile, 3);
	System.out.println("The volume of earth in cubic kilometers is " + VolumeCubicKilometer + "and cubic miles is" + volumeCubicMile);// Display the result
	}
}
	