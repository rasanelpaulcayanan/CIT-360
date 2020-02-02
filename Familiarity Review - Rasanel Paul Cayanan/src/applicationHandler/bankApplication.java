/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/2/2020
 * Description: 
 * --------------------------------------------------------------------------
 * This class replicates an ATM software. The end user is prompted to do 4
 * things. Check Balance, Withdraw, Deposit and Exit. It uses an Application
 * Controller pattern to work the functions to withdraw, deposit and check
 * balance
 * ---------------------------------------------------------------------------
 */

package applicationHandler;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class bankApplication {

	
	 public static void main(String[] args){
		 ApplicationController handler = new ApplicationController();
		 Scanner input = new Scanner(System.in);
		 
		 //Sets try and catch methods
	       boolean isValid = false;
	        while (!isValid) {
	            try {
	            //Outputs end user visible message prompting which numbers to press 	
	             System.out.println("Welcome to RMMAN Bank!\n");
	       		 System.out.println("How can I help you today?\n");
	       		 System.out.println("[1] Check Balance");
	       		 System.out.println("[2] Withdraw");
	       		 System.out.println("[3] Deposit");
	       		 System.out.println("Any other number: Exit");
	       	      int transactionType = input.nextInt();  
	         	      
	       	  //If methods set the transaction type that is forwarded to the handler   
	       	 if (transactionType == 1){
	       		   
	       		handler.handleCommand(transactionType,0.00);
	       		  
	       	   }
	       	   
	       	  if (transactionType == 2){
	       	   
	       		System.out.println("Enter the amount you want to withdraw? ");
	       		double withdrawAmount = input.nextInt();
	       		  
		       		handler.handleCommand(transactionType,withdrawAmount);
		       		  
		       	   }
	       	 
	     	  if (transactionType == 3){
	       		   
		       		System.out.println("Enter the amount you want to deposit? ");
		       		double depositAmount = input.nextInt();
		       	  
			       		handler.handleCommand(transactionType,depositAmount);
			       		  
			        }
	     	  
	     	  else {
	     		  
	     		 System.out.println("\nThank you for Banking with us. Please come again!");
	     		  
	     	  }
	     	  
	        
	        		
	          	  {
	   	        	  }
	                isValid = true;
	                
	   	          }
	             //Executes return message for invalid input
	          	  catch (InputMismatchException ex) {
	          		input.nextLine();
	                System.out.println("Invalid input..." );
	                System.out.print("Select from the Options above!\n");
	                
	          	  }

	            }
			
	     
	     	       
	       
	       
	       
	 }
}
