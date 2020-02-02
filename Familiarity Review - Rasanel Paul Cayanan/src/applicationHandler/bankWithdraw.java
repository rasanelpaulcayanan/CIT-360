/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/2/2020
 * Description: 
 * --------------------------------------------------------------------------
 * This class replicate withdrawal from a bank. The end user has a default
 * sum of money worth $10,000.00 
 * ---------------------------------------------------------------------------
 */


package applicationHandler;

public class bankWithdraw implements handleBank {

	
	@Override
	public void execute(Double money) {
		double  currentBal = 10000;
		
		//Deducts the end user's input in bankApplication from the end user's total balance
		//Outputs a summary of the end user's transaction
		double afterTransction = currentBal - money;
		System.out.println("\nHere is a summary of your transaction");
		System.out.println("Transaction Type: Withdraw");
	    System.out.printf("Amount: $ %1$.2f",money);	
		System.out.printf("\nCurrent Balance: $ %1$.2f",afterTransction);
		System.out.println("\nThank you for Banking with us. Please come again!");
		
	}
	
}
