import java.util.Scanner;
public class Distance{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter distance in feet: ");//Display distance
        double distanceInFeet = scanner.nextDouble();      
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;       
    System.out.println("Your Height in cm is " + distanceInMiles + " while in feet is " + distanceInFeet + "and inches is" + distanceInYards);//Display the result
    }
}
