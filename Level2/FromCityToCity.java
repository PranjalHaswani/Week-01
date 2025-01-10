import java.util.Scanner;

public class FromCityToCity {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String fromCity = sc.nextLine();
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();
        double distanceFromToVia = sc.nextDouble();// Create a variable distanceFromToVia to indicate the distance between the viaCity to toCity
        double distanceViaToFinalCity = sc.nextDouble();// Create a variable distanceViaToFinalCity to indicate the distance between the viaCity to toCity
        int timeFromToVia = sc.nextInt(); 
        int timeViaToFinalCity = sc.nextInt(); // Create a variable timeViaToFinalCity to indicate the time taken to travel from viaCity to toCity in minutes
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;// Create a variable totalDistance to indicate the total distance between the fromCity to toCity

        int totalTime = timeFromToVia + timeViaToFinalCity; // Create a variable totalTime to indicate the total time taken to travel from fromCity to toCity in minutes

    System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");//   // Print the travel details
	}
}


