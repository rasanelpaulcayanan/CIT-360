/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/14/2020
 * Description: 
 * --------------------------------------------------------------------------
 * This program simulates a money converter application. The Model stores the
 * conversion table from Peso (Php) to Dollars and Yen.
 * ---------------------------------------------------------------------------
 */

package mvc.familiarity.review;

public class MoneyChangerModel {

	private int convertedValue;
	
	//This class gets 2 inputs the peso value and denomination. The peso value
	//is converted to either Dollars or Euro. The denomination value gives the user 
	//an option to press 1 and convert to dollar and 2 to convert to euros
	   public void convertMoney (int pesoValue, int denomination) {
		   
		   int selector = denomination - 1;
		   
		int[] moneyType = {50, 55};
		
		 convertedValue = pesoValue * moneyType[selector];
		   
		      
		    
	   }
	
	    //getter method for convertedValue
	   public int getConvertion() {
		   
		   
		   return convertedValue;  
		   
		   
	   }
	   
}
	   

