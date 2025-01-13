import java.util.*;
public class PositiveNumber{
	//Function to check even or odd
	public static String checkEvenOdd(int number){
		if(number%2==0){
			return "Even";
		}
		else{
			return "Odd";
		}
	}
      public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);//Create an object sc to read input
	  int num[]= new int[5];
	  //Loop to take 5 numbers
	  for(int i=0; i<5; i++){
	  System.out.println("Enter the number " +(i+1) + ": ");
	  num[i]= sc.nextInt();
	  }
	   for(int i=0; i<num.length; i++){
		   int number=num[1];
		   if(num[i]<0) {
			   System.out.println(number + " is negative");
		   }
		   else if(num[i]==0){
			   System.out.println(number + " is zero");
		   }
		   else if(num[i]>0){
			   System.out.println(number + " is positive and "+ checkEvenOdd(number)+ ".");
		   
		   }
	   }
	   //Compare the first and last elements in array
	  if (num[0] == num[4]) {
            System.out.println("The first and last elements are Equal.");
        } else if (num[0] > num[4]) {
            System.out.println("The first element is Greater than the last element.");
        } else {
            System.out.println("The first element is Less than the last element.");
        }
	   sc.close();//Close the scanner
	  }
}
	  