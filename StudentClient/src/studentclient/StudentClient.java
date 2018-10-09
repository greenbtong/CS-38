/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclient;

/**
 *
 * @author btong3
 */
public class StudentClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student( "Average", "555-55-5555", 2.0);
        
        Student s2 = new Student( "Above-Average", "999-99-9999", 4.0);

        //Output of Student 1's name, ssn, and gpa
        System.out.println( "Student s1 name is " + s1.getName() + "." );
        System.out.println( "Student s1 SSN is " + s1.getSsn() + "." );
        System.out.println( "Student s1 GPA is " + s1.getGpa() + "." + "\n");
        
        //Output of Student 2's name, ssn, and gpa using toString method
        System.out.println ( "Student s2 name, SSN, and GPA are " + s2.toString() + ".\n");
        
        //Comparing s1 and s2
        if ( s1 == s2 )
            System.out.println( "s1 and s2 are equal \n");
        else 
            System.out.println( "s1 and s2 are not equal \n");
        
        //Using the muator methodson s2 to change the name, ssn, and Gpa to the same values as object s1. use the set methods
        s2.setName("Average");
        s2.setSsn("555-55-5555");
        s2.setGpa(2.0);
        System.out.println( "The new student s2 data is " +s2.toString() + ".\n");
        
        //compare object data using the equals method 
        if ( s1.equals( s2) ) 
            System.out.println( "s1 data and s2 data are equal \n" );
        else
            System.out.println( "s1 data and s2 data are not equal\n" ) ;
  
        // TODO code application logic here
    }
}
