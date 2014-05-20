
import java.util.Scanner; // Imports the scanner class to take input from user

/** StockCalculator calculates and displays profit or loss on purchase and sell of stock after a two week period */
public class StockCalculator {
	
	/** Main begins the program */
	public static void main(String[] args) {
		
		/* Declare variables */
		final double COMMISSION = .02; // Commission fee value
		double purchasedShares; // Amount of shares purchased
		double purchasePrice; // Purchase price of each share
		double sellingPrice; // Selling price of each share
		double profitOrLoss; // Profit or loss from sale of shares
		double commissionAmount; // Holds the value paid towards the broker for commission fees
		Scanner input = new Scanner(System.in); // input object gets data from user
		
		/* Print application header */
		System.out.println("Stock Profit/Loss calculator");
		System.out.println();
		
		/* Get information from user */
		System.out.println("Hello. Please enter the amount of shares purchased");
		purchasedShares = input.nextDouble();
		System.out.println("Okay, now what is the price per share upon purchase?");
		purchasePrice = input.nextDouble();
		System.out.println("How much did the shares sell for two weeks later?");
		sellingPrice = input.nextDouble();
		
		commissionAmount = (COMMISSION * purchasedShares * purchasePrice); // Broker gets 2% of the total spent on shares
		
		/* Display information */
		System.out.println();
		System.out.println("The amount of shares purchased and sold is: " + purchasedShares);
		System.out.println("The purchase price for " + purchasedShares + " shares is: $" + (purchasedShares * purchasePrice));
		System.out.println("The amount of commission paid to the broker upon purchase is: $" + commissionAmount); 
		System.out.println("Total purchase price is $" +  (commissionAmount + purchasedShares * purchasePrice)); // Total = commission + purchasedShares * purchasePrice
		System.out.println();
		System.out.println("The amount the stock sold for two weeks later is: $" + (sellingPrice * purchasedShares)); // price per share * amount of shares is the total
		System.out.println("The amount of commission paid to the broker upon sale is: $" + (COMMISSION * sellingPrice * purchasedShares)); // Broker gets + 2% of the total sold
		System.out.println("Total Selling Price is: $" + (sellingPrice * purchasedShares -  (COMMISSION * sellingPrice * purchasedShares))); // NetProfit - commissionfee = total
		commissionAmount += (COMMISSION * sellingPrice * purchasedShares); // Add to total amount paid to broker in commission fees
		
		/* Display whether user made a profit or loss */
		profitOrLoss = (purchasedShares * sellingPrice) - (commissionAmount + (purchasedShares * purchasePrice)); // 0 means no profit or loss. positive is profit. negative is loss
		System.out.println();
		System.out.println("Profit or loss: $" + profitOrLoss);
		
		/* Display name */
		System.out.println();
		System.out.println("Darryl Most");
	}

}
