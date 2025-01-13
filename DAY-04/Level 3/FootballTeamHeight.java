import java.util.Random;

public class FootballTeamHeight {
	 public static int[] generateHeights() {
        Random random = new Random();
        int[] heights = new int[11]; // Array to store heights of 11 players

        // Generate random heights between 150 cm and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101); 
        }
        return heights;
    }

    // Method to find the sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return sum / (double) heights.length; // mean = sum / number of elements
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Generate random heights for the players
        int[] heights = generateHeights();

        //  Find the sum, mean, shortest, and tallest heights
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        //  Display the results
        System.out.println("Heights of the football team players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }

        System.out.println("\nResults:");
        System.out.println("Total Height of all players: " + sum + " cm");
        System.out.println("Mean Height of players: " + mean + " cm");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}