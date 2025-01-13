import java.util.*;
public class MaxHandshakes{
	public static int handshakes(int numberofstudents ) {
		int combination =(numberofstudents*(numberofstudents-1)/2);
		return combination;
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); // Create a Scanner object for input
		System.out.println("Enter the number of students: ");//  Enter the number of students
		int numberofstudents= sc.nextInt();
        int calculatehandshakes = MaxHandshakes.handshakes(numberofstudents);   // Calculate and display the number of handshakes
        System.out.println("The maximum number of handshakes among " + numberofstudents + " students is: " + calculatehandshakes);
        sc.close(); // Close the scanner to avoid resource leak
    }
}

		
