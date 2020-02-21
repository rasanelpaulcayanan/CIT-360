/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/21/2020
 * Description: 
 * --------------------------------------------------------------------------
 * The program utilizes HTTPUrl connection to connect to different web sites.
 * These web sites are my weekly assignments for CIT230.
 * ---------------------------------------------------------------------------
 */
package http.url;

import java.net.*;
import java.io.*;
import java.util.Scanner;


public class httpURLFamiliarityReview {
    public static void main(String args[]) throws IOException { //Throws an exception if the web page has issues.
       
    	//Scanner option used to provide options to different web sites user can connect to.	
    	Scanner input = new Scanner(System.in);
        int option;
        System.out.println("Select the assignment you want to view.");
        System.out.println("Option 1: Lesson 02: Design Principles Document");
        System.out.println("Option 2: Lesson 03: Website Plan");
        System.out.println("Option 3: Lesson 04: Weather Website Outline");
        System.out.println("Option 4: Lesson 05: Weather Website Continued");
        System.out.println("Option 5: Lesson 06: Responsive Images and Font");
        System.out.println("Option 6: Exit");
        System.out.println("\n");

        option = input.nextInt();
        System.out.println("Code Starts Here!\n\n");

        switch (option) {

            case 1:
            	// URL = stores the web site the Java Program is supposed to go to
                URL theWebPage = new URL("https://rasanelpaulyanan.github.io/lesson2/design-principles.html");

                // HttpURLConnection = Communicates to a web site and stores connection
                HttpURLConnection connectURL = (HttpURLConnection) theWebPage.openConnection();
                
                //Reads text from input stream, for this instance it reads the content of the web page selected. 
                BufferedReader getData = new BufferedReader(new InputStreamReader(connectURL.getInputStream()));
                
                //We are going to store the read data in this String object.
                String webData;

                
                while ((webData = getData.readLine()) != null) {//This will continue to run itself while there is data to be read

                    //Prints out each line of data
                    if (webData.isEmpty() != true) {
                        System.out.println(webData);
                    }

                }

                //Closes the connection
                getData.close();

                break;

            //The same codes are used for case 2 to 5, but with different websites.
            case 2:
                URL theWebPage2 = new URL("https://rasanelpaulcayanan.github.io/lesson3/index.html");

                HttpURLConnection connectURL2 = (HttpURLConnection) theWebPage2.openConnection();

                BufferedReader getData2 = new BufferedReader(new InputStreamReader(connectURL2.getInputStream()));

                String webData2;

                while ((webData2 = getData2.readLine()) != null) {


                    if (webData2.isEmpty() != true) {
                        System.out.println(webData2);
                    }




                }


                getData2.close();
                break;

            case 3:
                URL theWebPage3 = new URL("https://rasanelpaulcayanan.github.io/lesson4/preston-4.html");

                HttpURLConnection connectURL3 = (HttpURLConnection) theWebPage3.openConnection();

                BufferedReader getData3 = new BufferedReader(new InputStreamReader(connectURL3.getInputStream()));

                String webData3;

                while ((webData3 = getData3.readLine()) != null) {


                    if (webData3.isEmpty() != true) {
                        System.out.println(webData3);
                    }




                }


                getData3.close();
                break;

            case 4:
                URL theWebPage4 = new URL("https://rasanelpaulcayanan.github.io/lesson5/preston-5.html");

                HttpURLConnection connectURL4 = (HttpURLConnection) theWebPage4.openConnection();

                BufferedReader getData4 = new BufferedReader(new InputStreamReader(connectURL4.getInputStream()));

                String webData4;

                while ((webData4 = getData4.readLine()) != null) {


                    if (webData4.isEmpty() != true) {
                        System.out.println(webData4);
                    }




                }


                getData4.close();
                break;

            case 5:
                URL theWebPage5 = new URL("https://rasanelpaulcayanan.github.io/lesson6/preston-6.html");

                HttpURLConnection connectURL5 = (HttpURLConnection) theWebPage5.openConnection();

                BufferedReader getData5 = new BufferedReader(new InputStreamReader(connectURL5.getInputStream()));

                String webData5;

                while ((webData5 = getData5.readLine()) != null) {


                    if (webData5.isEmpty() != true) {
                        System.out.println(webData5);
                    }

                }


                getData5.close();
                break;


            case 6:
                System.out.println("Your pressed Exit, no code will be showm. Thank you! Goodbye!");
                break;

            default:
                System.out.print("You did not select from the choices above!\n");

        }


    }




}