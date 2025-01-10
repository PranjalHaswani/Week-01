import java.util.Scanner;
public class Chocolate{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int numberOfChocolates = sc.nextInt();// Create a int numberOfChocolates
        int numberOfChildren = sc.nextInt();// Create a int numberOfChildren
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;// Create a  int chocolatesPerChild
        int remainingChocolates = numberOfChocolates % numberOfChildren;// Create a  int remainingChocolates 
    System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);// Display the result
    }
}
