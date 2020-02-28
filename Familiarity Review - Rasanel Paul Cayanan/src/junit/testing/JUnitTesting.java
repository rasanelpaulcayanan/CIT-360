/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/28/2020
 * Description: 
 * --------------------------------------------------------------------------
 * A program that works with JUnit. This program is linked to 7 different
 * JUnit testcases. JUnitAdditionTest, JunitTestLetterCounter,JunitTestCube
 * ,JUnitNull,JUnitNotNull, JUnitSame, JUnitNoSame. Within it are 3 tests stestAssertThatEqual, 
 * testAssertThatNotEqual, testAssertThatObject.
 * ---------------------------------------------------------------------------
 */

package junit.testing;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

public class JUnitTesting {

	 int totalNumberOfTeachers = 0;
	 int totalNumberOfEnglishTeachers = 0;
	 int totalNumberOfMathTeachers = 0;
	 
	 public String getPropValue(final int key){
	    	Map <Integer,String> students = new HashMap<>();
		
		students.put(12345,"Rasanel Paul Lutz");
		students.put(12346,"Max Levi Connor");
		students.put(12347,"Ammon James Capella");
		students.put(12348,"Max Levi Harden");
		students.put(12349,"Lebron James Quizon");
		students.put(12350,"Kyrie Irving Cayanan");
	        
		
		return students.get(key);
	        
	        
	    }
	 
	public int cube (int x ) {
	
		return x * x * x;
				
	}
	
	
     public int letterCounter(String word) {
    	 
    	 int count = 0;
    	 
    	 for(int i = 0; i < word.length(); i++  ) {
    		 
    		 if(word.charAt(i) == 'e' || word.charAt(i) == 'E') {
    			 
    			 count++;
    			 
    		 }    		 
    		 
    	 }
    	     	 
    	 return count;   	 
     }
     
     public int simpleAddition (int x, int y) {
    	 
    	 return x + y;
     }
     
     @Test
     public void simpleNotEqualsTest() {
    	 
    	 int sample1 = 25;
    	 int sample2 = 35;
    	 
    	 assertNotEquals(sample1,sample2);
    	 
    	 
     }
     
     
     
     @Test
     public void simpleArrayTest() { 
		 
		 
		 Map <Integer,String> students = new HashMap<>();
			
			students.put(12345,"Rasanel Paul Lutz");
			students.put(12346,"Max Levi Connor");
			students.put(12347,"Ammon James Capella");
			students.put(12348,"Max Levi Harden");
			students.put(12349,"Lebron James Quizon");
			students.put(12350,"Kyrie Irving Cayanan");
		        
			String[] studentsArray = { students.get(12345),students.get(12346),students.get(12347)
					,students.get(12348),students.get(12349),students.get(12350), };
			
			String[] expectedOutput = {"Rasanel Paul Lutz","Max Levi Connor","Ammon James Capella","Max Levi Harden","Lebron James Quizon","Kyrie Irving Cayanan"};
			assertArrayEquals(expectedOutput, studentsArray);
			
		    
		  } 
	
     
     @Before
	    public void setData(){
	        this.totalNumberOfTeachers = 100;
	        this.totalNumberOfEnglishTeachers = 60;
	        this.totalNumberOfMathTeachers = 40;
	    }
	     
	    @Test
	    public void testAssertThatEqual() {
	        assertThat(totalNumberOfTeachers,equalTo(totalNumberOfEnglishTeachers + totalNumberOfMathTeachers ));
	    }
	     
	    @Test
	    public void testAssertThatNotEqual() {
	        assertThat(totalNumberOfTeachers,is(100));
	    }
	     
	    @Test
	    public void testAssertThatObject() {
	        assertThat(totalNumberOfMathTeachers,isA(int.class));
	    }
	    
    
     
}
