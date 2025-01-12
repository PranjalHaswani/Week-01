import java.util.*;
public class CheckNumber{
	public static int numbercheck(int number) {
		if(number<0){
			return -1;
		}
		else if(number>0){
			return 1;
		}else {
			return 0;
	}
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); // Create a Scanner object for input
		System.out.println("Enter the number: ");//  Enter the number
		int numberofstudents= sc.nextInt();
		int result = numbercheck(numberofstudents);
		if(result==-1){
			System.out.println("The number is negative");
		}
        else if(result==1){
            System.out.println("The number is positive");
		}
		else{
			System.out.println("The number is zero");
		}
		sc.close();
	}
}
