/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/14/2020
 * Description: 
 * --------------------------------------------------------------------------
 * This program simulates a money converter application. The Controller integrates
 * the functionality of the View and Model classes.
 * ---------------------------------------------------------------------------
 */
package mvc.familiarity.review;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoneyChangerController {

	private MoneyChangerView theView;
	private MoneyChangerModel theModel;
	
	public MoneyChangerController(MoneyChangerView theView, MoneyChangerModel theModel) {
		
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addConversionListener(new ConversionListener());
		
	}
	
	 class ConversionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			int pesoValue, denomination = 0;
			
			try {
				
				pesoValue = theView.getpesoValue();
				denomination = theView.getdenomination();
				
				theModel.convertMoney(pesoValue, denomination);
				theView.setConvertion(theModel.getConvertion());
			}
			
			catch(NumberFormatException ex) {
				
				theView.displayErrorMessage("You need to enter two Integerts");
				
			}
		}
		 
		
		 
		 
	 }
}
