/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/8/2020
 * Description: 
 * --------------------------------------------------------------------------
 * This program displays and writes JSON files. The JSON files simulate an NBA
 * card that has the NBA players career statistics. There is also an option to
 * write another Player card with the provided information. I wanted to have it
 * done as user input but opted to put in the details instead.
 * ---------------------------------------------------------------------------
 */

package JSON;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.json.JSONObject;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Try catch initiated			
        boolean isValid = false;

        while (!isValid) {
            try {


                System.out.print("Which play card do you want to Display:\n");
                System.out.print("Press 1 for Kobe Bryant\n");
                System.out.print("Press 2 for Lebron James!\n");
                System.out.print("Press 3 for Tracy McGrady!\n");
                System.out.print("Press 4 to create a player card!\n");
                System.out.print("Press 5 for Exit\n");
                System.out.print("\nWARNING! You can only select from the options above: \n");

                //Switch utilized to provide options for end user.
                int choice = input.nextInt();
                switch (choice) {

                    //This reads the JSON file KobeBryant.json and turns it to an object kobe
                    case 1:
                        JSONObject kobe = JSONUtils.getJSONObjectFromFile("/KobeBryant.json");
                        String[] names = JSONObject.getNames(kobe);



                        for (String string: names) {
                            System.out.println(string + ": " + kobe.get(string));

                        }
                        System.out.println("\n");

                        continue;

                        //This reads the JSON file LebronJames.json and turns it to an object lebron
                    case 2:
                        JSONObject lebron = JSONUtils.getJSONObjectFromFile("/LebronJames.json");
                        String[] lnames = JSONObject.getNames(lebron);



                        for (String string: lnames) {
                            System.out.println(string + ": " + lebron.get(string));

                        }
                        System.out.println("\n");
                        continue;

                        //This reads the JSON file TracyMcGrady.json and turns it to an object tracy
                    case 3:
                        JSONObject tracy = JSONUtils.getJSONObjectFromFile("/TracyMcGrady.json");
                        String[] tnames = JSONObject.getNames(tracy);



                        for (String string: tnames) {
                            System.out.println(string + ": " + tracy.get(string));

                        }
                        System.out.println("\n");
                        continue;

                        //This creates an object newPlayer and writes an JSON file myJSON.jsson.
                    case 4:

                        JSONObject newPlayer = new JSONObject();
                        newPlayer.put("Name", "Allen Iverson");
                        newPlayer.put("Team", "Philadelphia 76ers");
                        newPlayer.put("JerseyNumber", "3");
                        newPlayer.put("isMVP", "true");
                        newPlayer.put("Championships", 0);
                        newPlayer.put("CareerScoring", 25.5);
                        newPlayer.put("CareerRebounts", 4.1);
                        newPlayer.put("CareerAssist", 6.5);
                        newPlayer.put("GamesPLayed", 1210);
                        newPlayer.put("Fieldgoalpercent", 42.1);



                        try (FileWriter file = new FileWriter("myJSON.json")) {
                            file.write(newPlayer.toString());
                            file.flush();

                        } catch (IOException e) {
                            e.printStackTrace();

                        }

                        System.out.println(newPlayer);
                        continue;

                        //Exit command        
                    case 5:
                        System.out.println("Thank you for choosing us!" +
                            "");
                        break;



                    default:
                        System.out.print("You did not select from the choices above!\n");
                        continue;
                }

                {

                }
                isValid = true;
            } catch (InputMismatchException ex) {
                input.nextLine();
                System.out.println("You did not select from the choices above");

            }

        }

    }


}