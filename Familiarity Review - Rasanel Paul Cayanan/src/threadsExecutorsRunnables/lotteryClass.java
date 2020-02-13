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

class lotteryClass implements Runnable{

	String name;
	Random randomize = new Random();
	
	
 public lotteryClass (String x) {
	 name = x;
	 
 }	
		
	
	public  void run() {
		
		
		int number1 = randomize.nextInt(100); 
		int number2 = randomize.nextInt(100); 
		int number3 = randomize.nextInt(100); 
		int number4 = randomize.nextInt(100); 
		int number5 = randomize.nextInt(100); 
	
	System.out.println("Lottery Results for " + name + number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5);
	System.out.println(" "); 
		
	
}
}
