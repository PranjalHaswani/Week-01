import java.util.Scanner;
public class UnitPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter unit price of the item: "); //Display unit price
        double unitPrice = scanner.nextDouble();
    System.out.print("Enter quantity to be bought: ");// Display quantity bought
        int quantity = scanner.nextInt();       
        double totalPrice = unitPrice * quantity;      
    System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);// Display the result
    }
}
