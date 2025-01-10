import java.util.Scanner;

public class RocketLaunchCountdown {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter;

        System.out.print("Enter the countdown start value: ");
        counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println("T-" + counter);
            counter--;
        }

        System.out.println("Launch!");
        sc.close();
    }
}
