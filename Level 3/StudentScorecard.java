import java.util.Random;

public class StudentScorecard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM)
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];
        
        // Generate random scores between 50 and 100 for each subject (2-digit scores)
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(51) + 50;  // Physics score (50-100)
            scores[i][1] = rand.nextInt(51) + 50;  // Chemistry score (50-100)
            scores[i][2] = rand.nextInt(51) + 50;  // Math score (50-100)
        }
        
        return scores;
    }

    // Method to calculate total, average, percentage and grade for each student
    public static double[][] calculateResults(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4];  // Columns: Total, Average, Percentage, Grade
        
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            // Round off to 2 decimal places
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
            
            // Assign grade based on percentage
            if (percentage >= 80) {
                results[i][3] = 'A';  
            } else if (percentage >= 70) {
                results[i][3] = 'B';  
            } else if (percentage >= 60) {
                results[i][3] = 'C';  
            } else if (percentage >= 50) {
                results[i][3] = 'D';  
            } else if (percentage >= 40) {
                results[i][3] = 'E';  
            } else {
                results[i][3] = 'R';  
            }
        }
        
        return results;
    }

    // Method to assign remarks based on grade
    public static String[] assignRemarks(int numStudents, double[][] results) {
        String[] remarks = new String[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][2];  
            // Assign remarks based on percentage
            if (percentage >= 80) {
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60) {
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                remarks[i] = "Remedial standards";
            } else {
                remarks[i] = "Too below agency-normalized standards";
            }
        }
        
        return remarks;
    }

    // Method to display the scorecard of all students in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[] remarks, int numStudents) {
        System.out.println("Student Scorecard");
        System.out.println("---------------------------------------------------------");
        System.out.println("Student No.\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade\tRemarks");
        System.out.println("---------------------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print((i + 1) + "\t\t");  // Student number
            System.out.print(scores[i][0] + "\t\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t\t");
            System.out.print(results[i][0] + "\t");
            System.out.print(results[i][1] + "\t\t");
            System.out.print(results[i][2] + "%\t\t");
            System.out.print((char)results[i][3] + "\t");
            System.out.println(remarks[i]);
        }
    }

    public static void main(String[] args) {
     
        int numStudents = 5;  // For example, 5 students
        
        int[][] scores = generateScores(numStudents);
      
        double[][] results = calculateResults(scores, numStudents);
 
        String[] remarks = assignRemarks(numStudents, results);
        
        displayScorecard(scores, results, remarks, numStudents);
    }
}
