import java.util.Scanner;
 class AthleteRounds {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();// Create a double side1
        double side2 = sc.nextDouble();// Create a double side2
        double side3 = sc.nextDouble();// Create a double side3
        double perimeter = side1 + side2 + side3;// Create a double perimeter
        double rounds = 5000.0 / perimeter;// Create a double rounds
    System.out.println("The total number of rounds the athlete will run is " + rounds);//Display the result
    }
}
