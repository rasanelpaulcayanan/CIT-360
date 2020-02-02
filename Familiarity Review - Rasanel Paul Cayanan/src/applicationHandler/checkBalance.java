/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/2/2020
 * Description: 
 * --------------------------------------------------------------------------
 * This class replicate a balance check from the bank. This class returns the
 * person's current balance
 * ---------------------------------------------------------------------------
 */


package applicationHandler;

public class checkBalance implements handleBank {

	

	@Override
	public void execute(Double money) {
		double currentBal = 10000;
		System.out.println("\nHere is a summary of your transaction");
		System.out.println("Transaction Type: Check Balance");
		System.out.printf("Amount: $ %1$.2f",currentBal);	
		System.out.println("\nThank you for Banking with us. Please come again!");
		
	}
	
}
