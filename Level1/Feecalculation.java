public class Feecalculation{
    public static void main(String[] args){
	     double fee  = 125000; // Create a double fee and assign value 125000
	     double discountpercent = 10; // Create a double discountpercent and assign value 10
	     double discount = (fee * discountpercent) / 100; // Create a double discount 
	     double finaldiscount= fee - discount; // Create a double finaldiscount 
	System.out.println (" The discount amout is INR " + discount + "and final disconted fee is INR " + finaldiscount); //Display the result
	}
}	