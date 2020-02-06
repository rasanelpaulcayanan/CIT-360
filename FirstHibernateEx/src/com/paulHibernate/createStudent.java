/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/6/2020
 * Description: 
 * --------------------------------------------------------------------------
 * A program that allows the end user to create an object "student". Uses 
 * hibernate to save the object to a database.
 * ---------------------------------------------------------------------------
 */

package com.paulHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class createStudent {
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		//Create session factory
		SessionFactory factory = new Configuration()
		                         .configure("hibernate.cfg.xml")
		                         .addAnnotatedClass(Student.class)
		                         .buildSessionFactory();
		//Create a session
		Session session = factory.getCurrentSession();
		
		try {
			//Prompts the end user to input First Name
			System.out.println("Input Student First Name:");
			String firstName = input.nextLine();
			
			//Prompts the end user to input Last Name
			System.out.println("Input Student Last Name:");
			String lastName = input.nextLine();
			
			//Prompts the end user to input user email
			System.out.println("Input Student Email:");
			String email = input.nextLine();
			
			//Creates Student object
			System.out.println("Creating new student object");
			Student tempStudent = new Student(firstName,lastName,email); 

			//Uses hibernate to save student
			session.beginTransaction();
			session.save(tempStudent);
			session.getTransaction().commit(); 
			System.out.println("Done");
			
		}
		
		finally {
			factory.close();
			
		}
		
		
		 
	}

}
