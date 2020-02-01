/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 01/29/2020
 * Description: 
 * --------------------------------------------------------------------------
 * This programs emulates a train station. The train has 6 stops. The end user
 * represents a conductor. He has an option to pick up a passenger on each stop
 * and drops off a passenger if he doesn't pick up one. This utilizes add and()
 * remove() to pick up or drop off passengers. The program also utilizes a try
 * and catch it will return a prompt when the wrong input is enterred.
 * ---------------------------------------------------------------------------
 */
package Collections;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.InputMismatchException;

public class queueFamiliarity {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Creates the linked list passengers
        Queue < String > passengers = new LinkedList < > ();
        passengers.add("Paul");
        passengers.add("Toni");
        passengers.add("Max");
        passengers.add("Ammon");
        passengers.add("Natali");
        
        //Uses for loop for the commands to run 6 times, which simulates the 6 stops the train will take
        int size = passengers.size();
        for (int i = 1; i <= 6; i++) {
            
        	//try and catch are placed to prompt a message when the wrong input is given
            boolean isValid = false;
            while (!isValid) {
                try {
                	//This is the bulk of the program that simulates a train station
                    int psize = passengers.size();
                    System.out.print("We are in Stop Number: " + i);
                    System.out.print("\nNumber of passengers on board: " + psize);
                    System.out.print("\nPassengers on board:" + passengers);
                    System.out.print("\nDo you want to add another passenger: \n");
                    boolean question = input.nextBoolean();
                    
                    //This sets up the prompts that would be end user visible depending if
                    //the end user wants to add another passenger
                    if (question == true) {

                        String customer = input.nextLine();
                        passengers.add("New Passenger\n");
                        System.out.print("Passengers on board:" + passengers);
                        System.out.print("\nNext person to leave: " + passengers.peek());
                        System.out.print("\nAll Aboard!!\n\n");
                        System.out.print("============================\n");
                    } else if (question == false) {

                       
                         //This sets up a situation where there are no more items 
                    	// left in the queue. It returns another prompt
                        if (psize > 0) {
                            System.out.print("We will remove one passenger!\n");
                            passengers.remove();
                            System.out.print("\nAll Aboard!!\n\n");
                            System.out.print("============================\n");
                        } else {

                            System.out.print("You are out of passengers, go to the next stop!\n");
                            System.out.print("============================\n");
                        }
                        isValid = true;

                    }
                } catch (InputMismatchException ex) {
                    //This is the prompt that shows up when the wrong input is enterred
                    input.nextLine();
                    System.out.println("Invalid input...");
                    System.out.print("Enter True or False!");
                }




            }




        }


        System.out.print("You have reached your destination!");





    }


}