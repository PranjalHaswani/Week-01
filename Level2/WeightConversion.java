import java.util.Scanner;
public class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weightInPounds = sc.nextDouble();// Create a double weightInPounds
        double weightInKg = weightInPounds * 2.2;// Create a double weightInKg
    System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKg);//Display the result
    }
}
