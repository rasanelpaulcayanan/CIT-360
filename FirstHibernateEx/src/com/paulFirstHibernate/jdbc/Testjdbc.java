/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/6/2020
 * Description: 
 * --------------------------------------------------------------------------
 * This program tests the connection of Eclipse to Mysql
 * ---------------------------------------------------------------------------
 */

package com.paulFirstHibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Testjdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String jdcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
   String user = "hbstudent";
   String pass = "hbstudent";
		
   try {
	   System.out.println("Connecting to Database");
	   
	   Connection  myConn = 
			   DriverManager.getConnection(jdcUrl,user,pass);
	   System.out.println("Success!");
	   
   }
   
   catch (Exception exc) {
	   exc.printStackTrace();
	   
   }
		
		
	}
	

}
