import java.util.Scanner;
public class MultiplicationTable{
      public static void main(String[] args){
	     Scanner sc= new Scanner(System.in);//Create an object sc to read input
	  System.out.println("Enter a number to display its multiplication table: "); // Get the number from the user
	     int num= sc.nextInt();
		 int table[]= new int[10];// Define an integer array to store multiplication results
	  // Loop from 1 to 10 to calculate the multiplication table and store results in the array
	  for(int i=1;i<=10;i++){
		 table[i-1]= num*i;
		 }
		 // Display the multiplication table from the array
	  for (int i = 0; i < table.length; i++) {
            System.out.println(num + " * " + (i + 1) + " = " + table[i]);// Display the table
        }
	 sc.close();//Close the scanner
	  }
}