import java.util.*;
public class Profitloss{
         public static void main(String[] args){
		    int costprice = 129; // Create a int costprice and assign value 129
		    int sellingprice = 191; // Create a int sellingprice and assign value 191
		    int profit = sellingprice - costprice;
		 double profitpercentage = (profit / costprice)*100;
		 System.out.println("The Cost Price is INR " + costprice + "and the Selling Price is INR " +sellingprice + "\nThe Profit is INR " + profit + " and the Profit Percentage is" + profitpercentage); //Display the result
}
}		 