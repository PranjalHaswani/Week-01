import java.util.Scanner;

public class RocketLaunchCountdownForLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter;

        System.out.print("Enter the countdown start value: ");
        counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println("T-" + i);
        }

        System.out.println("Launch!");
        sc.close();
    }
}
