import java.util.Scanner;

public class Friends {
	  public static String findYoungest(String[] names, int[] ages) {
        int youngestAge = ages[0];
        String youngestFriend = names[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }

        return youngestFriend;
    }

    public static String findTallest(String[] names, double[] heights) {
        double tallestHeight = heights[0];
        String tallestFriend = names[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }

        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store the ages and heights of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height of " + names[i] + " (in meters): ");
            heights[i] = scanner.nextDouble();
        }
        String youngestFriend = findYoungest(names, ages);
        String tallestFriend = findTallest(names, heights);

        // Display the results
        System.out.println("\nThe youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
        scanner.close();
    }
}