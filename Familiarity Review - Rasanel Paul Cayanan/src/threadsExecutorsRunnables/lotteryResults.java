/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/07/2020
 * Description: 
 * --------------------------------------------------------------------------
 * A program that simulates a lottery software. It uses threads, executors
 * and runnables so the user can either choose a State to display results
 * or all three States.
 * ---------------------------------------------------------------------------
 */
package threadsExecutorsRunnables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class lotteryResults {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	//Try and catch exception
		boolean isValid = false;
        while (!isValid) {
     try {
	
    //test changes
    	//test changes
    //Creates thread objects
    Thread show1 = new Thread( new lotteryClass ("California "));
    Thread show2 = new Thread( new lotteryClass ("Idaho "));	
    Thread show3 = new Thread( new lotteryClass ("Maine "));
    
	
	System.out.print("Which Lottery Results do you want to Display:\n");
	System.out.print("Press 1 for California 5 numbers!\n");
	System.out.print("Press 2 for Idaho 4 numbers!\n");
	System.out.print("Press 3 for Maine 3 numbers!\n");
	System.out.print("Press 4 for All States\n");
	System.out.print("Press 5 to exit\n");
	System.out.print("Press 6 to generate random lottery numbers\n");
	System.out.print("\nWARNING! You can only select from the options above: ");
	
	//Switch utilized to provide options for end user.
    int choice = input.nextInt();
    switch (choice) {
    
    case 1:
    	show1.start();
        break;
    case 2:
    	show2.start();
    	break;
    case 3:
    	show3.start();
    	break;
        
    case 4:
    	show1.start();
    	try {Thread.sleep(5000);} catch (Exception e) {}
    	show2.start();
    	try {Thread.sleep(5000);} catch (Exception e) {}
    	show3.start();
    	break;
        
    case 5:
    	System.out.print("Thank you for trying!\n");
    	break;
    	
    case 6:
    	ExecutorService executor = Executors.newFixedThreadPool(10);
    	
    	for (int i = 0; i < 10 ; i++ ) {
    		
    	Runnable thread = new Runnable() {

			@Override
			public void run() {
				Random randomize = new Random();
				
				int number1 = randomize.nextInt(100); 
				int number2 = randomize.nextInt(100); 
				int number3 = randomize.nextInt(100); 
				int number4 = randomize.nextInt(100); 
				int number5 = randomize.nextInt(100); 
			
			
			System.out.println("Lottery Results" + number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5); 
				
			}  		
    	};	
    		
    	executor.execute(thread); 
    	
    	}
    	
    	try {
    	    System.out.println("Loading Results.. ");
    	    executor.shutdown();
    	    executor.awaitTermination(5, TimeUnit.SECONDS);
    	}
    	catch (InterruptedException e) {
    	    System.err.println("tasks interrupted");
    	}
    	finally {
    	    if (!executor.isTerminated()) {
    	        System.err.println("cancel non-finished tasks");
    	    }
    	    executor.shutdownNow();
    	    System.out.println("You are done with the test Lottery results");
    	}
    	
    	break;
    default:
    	System.out.print("You did not select from the choices above!\n");
    	continue;
    }
    
    {
    	
    }
    	isValid = true;
     } 
    	catch (InputMismatchException ex) {
      		input.nextLine();
            System.out.println("You did not select from the choices above" );
            
      	  }
    	
     }
    }
	
	
	}
	
	
	

