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
	//is converted to either Dollars or Yen. The denomination value gives the user 
	//an option to press 1 and convert to dollar and 2 to convert to yen
	   public void convertMoney (int pesoValue, int denomination) {
		   
		    switch (denomination) {
		    
		    case 1:
		    	 convertedValue = pesoValue / 50 ;
		        break;
		        
		    case 2:
		    	 convertedValue = pesoValue *2;
		        break;
		   
		    default:
		    	System.out.print("You did not select from the choices above!\n");
		    	
		    	
		    }
		    
	   }
	
	    //getter method for convertedValue
	   public int getConvertion() {
		   
		   
		   return convertedValue;  
		   
		   
	   }
	   
}
	   

