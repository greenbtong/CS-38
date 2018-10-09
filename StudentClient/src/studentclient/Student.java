/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclient;

/**
 *
 * @author btong3
 */
public class Student {
    private String name;
    private String ssn;
    private double gpa;
    
    public Student( String newName, String newSsn, double newGpa)
    {
        name = newName;
        ssn = newSsn;
        gpa = newGpa;
    }
    
    public String getName ( )
    {
        return name;
    }
    public void setName( String newName )
    {
        name = newName;
    }
    public String getSsn ( )
    {
        return ssn;
    }
    
   public void setSsn ( String newSsn )
   {
       ssn = newSsn;
   }
   public double getGpa ( ) 
   {
       return gpa; 
   }
   public  void setGpa ( double newGpa )
   {
       if (newGpa < 0 || newGpa > 4 )
       {
           System.out.println("ERROR!");
       }
       else {gpa = newGpa;}
               }
   public String toString ( )
   {
       return name + " " + ssn + " " + gpa;
   }
   public boolean equals ( Object o )
   {
        if ( !( o instanceof Student ) )
            return false ;
        Student o1 = (Student)o;
        if (name == o1.name 
                && ssn == o1.ssn 
                && gpa == o1.gpa )
            return true;
        else return false;
   }
}

