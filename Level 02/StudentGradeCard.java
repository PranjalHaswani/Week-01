import java.util.Random;

public class StudentGradeCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Mathematics
    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];  // 2D array to store PCM scores for each student

        // Generate random scores for each student in the 3 subjects
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(100);  // Physics score (0-99)
            scores[i][1] = rand.nextInt(100);  // Chemistry score (0-99)
            scores[i][2] = rand.nextInt(100);  // Mathematics score (0-99)
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] result = new double[scores.length][4];  // Store total, average, and percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];  // Calculate total score
            double average = total / 3.0;  // Calculate average
            double percentage = (total / 300.0) * 100;  // Calculate percentage

            // Round values to 2 decimal places
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    // Method to determine the grade based on the percentage
    public static String[][] calculateGrade(double[][] percentages) {
        String[][] grades = new String[percentages.length][2];  // Store grade for each student

        for (int i = 0; i < percentages.length; i++) {
            double percentage = percentages[i][2];

            if (percentage >= 80) {
                grades[i][1] = "A";  // Level 4 (80% and above)
            } else if (percentage >= 70) {
                grades[i][1] = "B";  // Level 3 (70-79%)
            } else if (percentage >= 60) {
                grades[i][1] = "C";  // Level 2 (60-69%)
            } else if (percentage >= 50) {
                grades[i][1] = "D";  // Level 1 (50-59%)
            } else if (percentage >= 40) {
                grades[i][1] = "E";  // Level 1- (40-49%)
            } else {
                grades[i][1] = "R";  // Remedial standards (below 39%)
            }
        }

        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] result, String[][] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" 
                               + result[i][0] + "\t" + result[i][1] + "\t\t" + result[i][2] + "%\t\t" + grades[i][1]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5;  // Number of students (can be changed)
        
        // Generate random scores for the students
        int[][] scores = generateRandomScores(numStudents);
        
        // Calculate total, average, and percentage for each student
        double[][] result = calculateTotalAveragePercentage(scores);
        
        // Determine grade for each student based on percentage
        String[][] grades = calculateGrade(result);
        
        // Display the scorecard
        displayScorecard(scores, result, grades);
    }
}
