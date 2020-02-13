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
import java.util.InputMismatchException;
import java.util.Scanner;

public class lotteryResults {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	//Try and catch exception
		boolean isValid = false;
        while (!isValid) {
     try {
	

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
	
	
	

