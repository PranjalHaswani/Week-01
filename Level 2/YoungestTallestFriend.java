import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter age and height of Amar: ");
        int ageAmar = sc.nextInt();
        int heightAmar = sc.nextInt();
        
        System.out.println("Enter age and height of Akbar: ");
        int ageAkbar = sc.nextInt();
        int heightAkbar = sc.nextInt();
        
        System.out.println("Enter age and height of Anthony: ");
        int ageAnthony = sc.nextInt();
        int heightAnthony = sc.nextInt();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        if (youngestAge == ageAmar) {
            System.out.println("The youngest friend is Amar.");
        } else if (youngestAge == ageAkbar) {
            System.out.println("The youngest friend is Akbar.");
        } else {
            System.out.println("The youngest friend is Anthony.");
        }

        if (tallestHeight == heightAmar) {
            System.out.println("The tallest friend is Amar.");
        } else if (tallestHeight == heightAkbar) {
            System.out.println("The tallest friend is Akbar.");
        } else {
            System.out.println("The tallest friend is Anthony.");
        }
    }
}
