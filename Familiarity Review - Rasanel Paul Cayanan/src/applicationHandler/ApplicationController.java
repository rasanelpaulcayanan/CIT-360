/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/2/2020
 * Description: 
 * --------------------------------------------------------------------------
 * This class serves as the application controller. It keeps a set of commands
 * in the HashMap hashMapOfCommands. Right now there are three.
 * ---------------------------------------------------------------------------
 */


package applicationHandler;

import java.util.HashMap;

public class ApplicationController {
	public static HashMap<Integer,handleBank> hashMapOfCommands = new HashMap<Integer,handleBank>();
	
	public void ApplicationController(){

    }

	  public static void handleCommand(Integer command, Double num1){
            //These are the 3 commands that the application controller has. 
	        hashMapOfCommands.put(1, new checkBalance());
	        hashMapOfCommands.put(2, new bankWithdraw());
	        hashMapOfCommands.put(3, new depositBank());

	        handleBank handler = hashMapOfCommands.get(command);

	        handler.execute(num1);
	    }

	  
}
