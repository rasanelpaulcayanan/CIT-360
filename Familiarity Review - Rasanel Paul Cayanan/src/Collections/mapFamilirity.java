/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 01/25/2020
 * Description: 
 * --------------------------------------------------------------------------
 * This program acts like a class record, it stores the Student - Student ID 
 * through Map. The user has the option to enter a student id which looks up
 * the student name and the course id that represents a course name. The end
 * user enters the student's grade for the subject. The program then prints 
 * the students report card
 * ---------------------------------------------------------------------------
 */

package Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapFamilirity {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prints the Students name and their corresponding student id
		System.out.println("Class Record" +"\nStudents:" + "\n    Student ID\t\tStudent Name");
		System.out.println("        12345\t\tRasanel Paul Lutz");
		System.out.println("        12346\t\tMax Levi Connor");
		System.out.println("        12347\t\tAmmon James Capella");
		System.out.println("        12348\t\tMax Levi Harden");
		System.out.println("        12349\t\tLebron James Quizon");
		System.out.println("        12350\t\tKyrie Irving Cayanan");
		System.out.print("\nEnter the student number you want to grade: ");
		//The end user inputs a student id.
		int studentId = input.nextInt();
		
		//The Student ID is used as a key in map. The Student name serves as the value.
		Map <Integer,String> students = new HashMap<>();
		
		students.put(12345,"Rasanel Paul Lutz");
		students.put(12346,"Max Levi Connor");
		students.put(12347,"Ammon James Capella");
		students.put(12348,"Max Levi Harden");
		students.put(12349,"Lebron James Quizon");
		students.put(12350,"Kyrie Irving Cayanan");
		
		//Outputs the Student Name based on the student ID you enter
		System.out.println("\nYou are grading: " + students.get(studentId));
	    
		System.out.println("\nCourses:" + "\n    Course Code\t\tCourse Name");
		System.out.println("        101\t\tEnglish 101");
		System.out.println("        124\t\tIntroduction to Programming");
		System.out.println("        360\t\tObject Oriented Software Development");
		System.out.print("\nEnter the Course Code: ");
		int courseCode = input.nextInt();
		
		Map <Integer,String> course = new HashMap<>();
		
		course.put(101,"English 101");
		course.put(124,"Introduction to Programming");
		course.put(360,"Object Oriented Software Development\n");
		
		System.out.println("\nYou are grading: " + students.get(studentId) + " for the subject: " + course.get(courseCode));
		System.out.println("Enter Grade(1-100): ");
		int grade = input.nextInt();
		 
		System.out.println("Student Report Card: ");
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Name: " + students.get(studentId));
		System.out.println("Course Code: " + courseCode );
		System.out.println("Course Name: " + course.get(courseCode) );
		System.out.println("Grade: " + grade);
		
		
		
		
	}
	
	
}
