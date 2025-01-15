import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random 2-digit age for a given number of students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];

        // Generate random ages between 10 and 99 for each student
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;  // 10 to 99
        }

        return ages;
    }

    // Method to check if students can vote (age >= 18)
    public static String[][] canVote(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);  // Store the student's age
            if (age < 0) {
                result[i][1] = "Cannot Vote";  // Invalid age
            } else if (age >= 18) {
                result[i][1] = "Can Vote";  // Valid, can vote
            } else {
                result[i][1] = "Cannot Vote";  // Age below 18
            }
        }

        return result;
    }

    // Method to display the results in tabular format
    public static void displayVoteEligibility(String[][] result) {
        System.out.println("Age\t\tEligibility");
        System.out.println("---------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many students' ages will be entered (assuming 10 students as per the prompt)
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Validate input
        if (numStudents != 10) {
            System.out.println("This program is designed to work with exactly 10 students.");
            return;
        }

        // Generate random ages for the students
        int[] ages = generateAges(numStudents);

        // Get the voting eligibility based on ages
        String[][] eligibility = canVote(ages);

        // Display the results
        displayVoteEligibility(eligibility);

        scanner.close();
    }
}
