import java.util.Scanner;

public class YoungAndTall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Create a scanner
		
	  int[] age= new int[3]; // Take input for the age
	  int[] height= new int[3]; // Take input for the height
	 String[] names= {"Amar" , "Akbar", "Anthony"};
	 
	  for(int i= 0; i<3; i++) {
		  System.out.println("Enter the age of "+names[i] + ":");
		  age[i] = sc.nextInt();
       System.out.println("Enter the height of "+names[i] + ":");
          height[i] = sc.nextInt();
	  }
		//Variables to youngest and tallest
        int youngestIndex =0;
        int tallestIndex =0;
      
      for (int i=1; i<3; i++) {
       if(age[i] < age[youngestIndex]){
          youngestIndex=i;
	   }
	    if(height[i] < height[tallestIndex]) {
			tallestIndex=i;
		}
	  }
       //Display the result
        System.out.println("The youngest is: " + names[youngestIndex] + " with age " + age[youngestIndex]);
		System.out.println("The tallest is: " + names[tallestIndex] + " with height " + height[tallestIndex]);
		sc.close();
	  }
	 }
		
		  
	   
	  
		
		