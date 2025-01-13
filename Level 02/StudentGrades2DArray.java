import java.util.*;
public class StudentGrades2DArray {
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner sc = new Scanner(System.in);

        // Input the number of students
        System.out.println("Enter the number of students:");
        int numOfStudents = sc.nextInt();

        // Create a 2D array to store marks for Physics, Chemistry, and Maths
        int[][] marks = new int[numOfStudents][3]; //
        double[] percentages = new double[numOfStudents];
        char[] grades = new char[numOfStudents];

        // Input marks for each student
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            // Input marks for Physics
            System.out.println("Physics (0-100):");
            while (true) {
                marks[i][0] = sc.nextInt();
                if (marks[i][0] >= 0 && marks[i][0] <= 100) {
                    break;
                } else {
                    System.err.println("Invalid marks. Please enter a value between 0 and 100:");
					System.exit(0);
                }
            }

            // Input marks for Chemistry
            System.out.println("Chemistry (0-100):");
            while (true) {
                marks[i][1] = sc.nextInt();
                if (marks[i][1] >= 0 && marks[i][1] <= 100) {
                    break;
                } else {
                    System.err.println("Invalid marks. Please enter a value between 0 and 100:");
					System.exit(0);
                }
            }

            // Input marks for Maths
            System.out.println("Maths (0-100):");
            while (true) {
                marks[i][2] = sc.nextInt();
                if (marks[i][2] >= 0 && marks[i][2] <= 100) {
                    break;
                } else {
                    System.err.println("Invalid marks. Please enter a value between 0 and 100:");
					System.exit(0);
                }
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < numOfStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 3.0);
              if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if(percentages[i] >=40){
                grades[i] = 'E';
            } else {
			    grades[i] = 'R';
			}
            
        }

        // Display the marks, percentages, and grades of each student
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + String.format("%.2f", percentages[i]) + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }
    }
}