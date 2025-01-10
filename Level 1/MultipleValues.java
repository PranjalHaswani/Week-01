import java.util.*;
 public class MultipleValues{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);//Create an object sc to read input
	   double arr[]= new double[10];
	   double total=0.0; // Variable to store the total sum, initialized to 0
	   int index=0;   // Variable to keep track of the current index in the array
	   
	 while(true){
	   System.out.println("Enter a number or enter 0 or a negative number to stop: ");// Get the number from the user
	   double num = sc.nextDouble();
	 if(num<=0 || index==10){
	   break;
	  }
	   arr[index]= num;
	   index++;
	  }
	      // Calculate the sum of the entered numbers
        for (int i = 0; i < index; i++) {
            total += arr[i];
        }

        // Display the entered numbers
        System.out.println("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Total sum of numbers: " + total);
        // Display the total sum
		
        sc.close(); // Close the scanner
    }
 }
	   
  