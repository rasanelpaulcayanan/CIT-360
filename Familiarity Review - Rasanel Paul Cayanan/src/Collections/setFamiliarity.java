/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 01/15/2020
 * Description: 
 * --------------------------------------------------------------------------
 * This program shows the ability of Set and hashSet to remove duplicates from
 * a set of elements. This compares the same elements in list and set form. This 
 * also totals the number of elements removed 
 * ---------------------------------------------------------------------------
 */
package Collections;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class setFamiliarity {

 public static void main(String[] args) {
  //Creates an array list of Integers. Duplicates are added on purpose to show the difference between Set and List
  List < Integer > listValues = new ArrayList < Integer > ();

  System.out.println("Here is the list of Integers using List: ");

  //Values are added to the list
  listValues.add(11111);
  listValues.add(11112);
  listValues.add(11113);
  listValues.add(11114);
  listValues.add(11114);
  listValues.add(11115);
  listValues.add(11115);
  listValues.add(11115);
  listValues.add(11116);

  //Displays  the "listValues" arrayList
  for (Integer x: listValues) {
   System.out.println(x);
  }

  //size method is used to get the number of elements
  System.out.println("The the number of String is using List: " + listValues.size());
  System.out.println("");

  //Creates an hashSet of Integers. The same values as the list.
  System.out.println("Here is the list of same Integers using Set (duplicates have been removed)");
  System.out.println("Integers:");
  Set < Integer > values = new HashSet < Integer > ();

  //Values are added to hashSet
  values.add(11111);
  values.add(11112);
  values.add(11113);
  values.add(11114);
  values.add(11114);
  values.add(11115);
  values.add(11115);
  values.add(11115);
  values.add(11116);

  //Displays  the "values" hashSet
  for (Integer x: values) {
   System.out.println(x);
  }
  //size method is used to get the number of elements
  System.out.println("The the number of Integers using Set is:" + values.size());
  //gets the difference on the size of elements between set and list
  System.out.println("Duplicates removed when using Set:" + (listValues.size() - values.size()));



 }
}