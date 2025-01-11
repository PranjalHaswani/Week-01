import java.util.Scanner;
public class StudentGrades {
    public static double getValidMarks(String subject) {
        Scanner sc = new Scanner(System.in);
        double marks;
        while (true) {
            System.out.print("Enter marks for " + subject + ": ");
            marks = sc.nextDouble();
            if (marks < 0) {
                System.out.println("Marks cannot be negative. Please enter valid marks.");
            } else {
                break;
            }
        }
        return marks;
    }
    
    // Method to calculate grade based on percentage
    public static String calculateGrade(double percentage) {
        if (percentage >= 80) {
            return "A - Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            return "B - Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            return "C - Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            return "D - Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            return "E - Level 1-, too below agency-normalized standards";
        } else {
            return "R - Remedial standards";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: "); // Taking the number of students as input
        int numStudents = sc.nextInt();
        
        // Arrays to store marks, percentages, and grades
        double[] physicsMarks = new double[numStudents];
        double[] chemistryMarks = new double[numStudents];
        double[] mathsMarks = new double[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":"); 
            
            physicsMarks[i] = getValidMarks("Physics");
            chemistryMarks[i] = getValidMarks("Chemistry");
            mathsMarks[i] = getValidMarks("Maths");
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]; // Calculate total marks and percentage
            percentages[i] = (totalMarks / 300) * 100;
            grades[i] = calculateGrade(percentages[i]); // Calculate grade based on percentage
        }
        System.out.println("\nResults:");// Display results
        System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade | Remarks");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d | %.2f | %.2f | %.2f | %.2f%% | %s\n", i + 1, physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }
    }
}
