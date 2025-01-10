import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of students: "); //Display number of students
        int numberOfStudents = scanner.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
    System.out.println("The maximum number of handshakes is " + handshakes);//Display the result
    }
}
