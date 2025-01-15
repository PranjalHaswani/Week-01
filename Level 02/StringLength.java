import java.util.*;
public class StringLength{
	// Method to find the length of a string without using the length() method
	public static int customlen(String str){
		int count= 0; 
   // Using an infinite loop to count characters
   try{
		while(true){
			str.charAt(count);
			count++;
		}
   }
   catch(StringIndexOutOfBoundsException e){
	   return count;
   }
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input= sc.next();
		  // Call the customLength method
        int customLengthResult = customlen(input);
        
        // Call the built-in length() method
        int builtInLengthResult = input.length();
        
        // Display the results
        System.out.println("Length of the string using custom method: " + customLengthResult);
        System.out.println("Length of the string using built-in method: " + builtInLengthResult);
        
        // Close the scanner to avoid resource leak
        sc.close();
	}
}