/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/01/2020
 * Description: 
 * --------------------------------------------------------------------------
 * This program simulates a game using list and tree set. A random set of
 * integers is generated using list called "listValues". The user then types
 * the numbers in ascending order and is saved in another list called "yourAnswer"
 * Tree set is used to arrange this numbers in ascending order. The user then 
 * compares his answers to the correct ones and takes note of his score. Program
 * returns a prompt depending on the user's score. A prompt is diplayed if the wrong
 * input is enterred. 
 * ---------------------------------------------------------------------------
 */

package Collections;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.Scanner;

public class treeFamiliarity {
	 public static void main(String[] args) 
	    { 
		// create instance of Random class 
	        Random rand = new Random(); 
	        Scanner input = new Scanner(System.in);
	        //listValues, yourAnswer and correctAnswer are created
	        List < Integer > listValues = new ArrayList < Integer > ();
	        List < Integer > yourAnswer = new ArrayList < Integer > ();
	        TreeSet<Integer> correctAnswer = new TreeSet<Integer>();
	     
	        //try and catch sequence initiated to return a prompt if the wrong 
	        //input is answered.
	        boolean isValid = false;
	        while (!isValid) {
	            try {
	        //A set of 10 random integers is generated    	
	        System.out.print("Arrange this numbers in ascending order.\n");
	        int limit = 10;
	        for (int i = 0; i < limit; i++) {
	           int z =  rand.nextInt(1000);  
	           listValues.add(z);
	        }
	        
	        //The list of generated values is displayed
	        System.out.println(listValues); 
	        
	        System.out.print("Enter a limit (String you want entered): \n");
	        //This limit is then added to the variable "limit"
	        int answer = input.nextInt();
	        int limit2 = 9;
	        for (int i = 0; i < limit2; i++) {
	           int z =  input.nextInt();
	           yourAnswer.add(z);
	        }
		 
		 
	        
	        for (int i = 0; i < limit; i++) {
	           int z = listValues.get(i);
	           correctAnswer.add(z);
	           
	        }
	        
	        System.out.print("Here is your answer: \n");
	        System.out.println(yourAnswer); 
	        System.out.print("Here is the correct order. How many did you get right? : \n");
	        System.out.println(correctAnswer); 
	        int score =  input.nextInt();
	        if (score >= 7 ) {
	        	System.out.print("Very good!");
	        	
	        }
	        
	        else {
	        	System.out.print("Please try again!");
	        }
	        
	        
	        
	        {
	        	
	        }
	        
	        isValid = true;
	            }
	            catch (InputMismatchException ex) {
	          		input.nextLine();
	                System.out.println("Invalid input..." );
	                System.out.print("You have to type an integer!!\n");
	          	  }

	            }      
	        
	        
	       
	    } 
}
