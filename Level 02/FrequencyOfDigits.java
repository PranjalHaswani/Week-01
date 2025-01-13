import java.util.*;
public class FrequencyOfDigits{
     public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);// Create a scanner object
	System.out.println("Enter a number :");
	  int num= sc.nextInt();
	 if(num<0){
      num = Math.abs(num);// Make the number positive if it is negative
	 }
      int arr[] = new int[10];// Find the count of digits in the number and store it in the array
	  
	  while(num>0){
	  int digit= num%10;
	  arr[digit]++;
	  num/=10;
	  }
	System.out.println("Digit frequencies: ");
     for(int i=0; i<10;i++){
      if(arr[i]>0) {
    System.out.println("Digit " + i + ": " + arr[i]);
        }
	 }
	 sc.close();
   }
}
