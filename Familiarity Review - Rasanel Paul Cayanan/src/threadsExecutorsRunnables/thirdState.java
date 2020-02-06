/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/07/2020
 * Description: 
 * --------------------------------------------------------------------------
 * A program that simulates a lottery software. Gets random 5 integers.
 * ---------------------------------------------------------------------------
 */

package threadsExecutorsRunnables;

import java.util.Random;

public class thirdState implements Runnable {
	
	public  void run () {
		Random rand = new Random();
		
		int number1 = rand.nextInt(100); 
		int number2 = rand.nextInt(100); 
		int number3 = rand.nextInt(100); 
		
	System.out.println("Lottery Results for Maine!\n" + number1 + " " + number2 + " " + number3);
	try  { Thread.sleep(5000); } catch (Exception e) {} 
		
	}

}
