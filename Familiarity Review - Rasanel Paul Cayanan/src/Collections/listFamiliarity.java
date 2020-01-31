/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 01/11/2020
 * Description: 
 * --------------------------------------------------------------------------
 * A program to allow set a limit on the numbers and string that they want entered.
 * The program then displays the numbers sorted and the string values entered.
 * ---------------------------------------------------------------------------
 */
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listFamiliarity {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //User enters the "limit" of the numbers they want to input
        System.out.print("Enter a limit (Numbers you want entered): ");
        //This limit is then adde to the variable "limit"
        int limit = input.nextInt();
        //User enters integers, once the limit has been reached, it proceeds to the next step
        System.out.print("Enter Values(Integers): ");
        //Creates two Arraylists, 1 for Integer and 1 for String
        
        List < Integer > values = new ArrayList < Integer > ();
        List < String > values2 = new ArrayList < String > ();

        //For loop is used to enter the number of integers corresponding to the limit entered by the end user
        for (int i = 0; i < limit; i++) {
            int z = input.nextInt();;
            values.add(z);
        }

        //sort is then used to sort the integers from lowest to highest
        Collections.sort(values);

        System.out.print("Enter a limit (String you want entered): ");
        //This limit is then added to the variable "limit"
        int limit2 = input.nextInt();
        
        //The program then prompts the end user to enter a set of string values
        System.out.print("Enter Names: ");
        String z = input.nextLine();

        //This loop is used to enter the number of string values corresponding to the limit entered by the end user
        for (int i = 0; i < limit2; i++) {
             z = input.nextLine();
            values2.add(z);
        }

        //Prints the numbers entered in ascending format using advanced for loop
        System.out.println("You have entered these numbers:");
        for (Integer x: values) {
            System.out.println(x);
        }
        //Prints the string values entered using advanced for loop
        System.out.println("You have entered these names:");
        for (String y: values2) {
            System.out.println(y);
        }
        
    

    }

}