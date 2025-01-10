import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();// Create a int number1
        int number2 = sc.nextInt();// Create a int number2
        int temp = number1;// Create a int temp and assign the value of number1
        number1 = number2;
        number2 = temp;
    System.out.println("The swapped numbers are " + number1 + " and " + number2);//Display the result
    }
}
