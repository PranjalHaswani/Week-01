import java.util.Scanner;

public class StudentVoteChecker {
	 public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];   // Create an array to store the age of 10 students
        StudentVoteChecker checker = new StudentVoteChecker();   // Create an instance of StudentVoteChecker
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();  // Store the age in the array

            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        scanner.close();   // Close the scanner object
    }
}