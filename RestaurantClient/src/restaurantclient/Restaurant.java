/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantclient;

/**
 *
 * @author btong3
 */
public class Restaurant extends Store 
{
    // declare two instance variables
private int people;
private double avgPrice;

//overloaded constructor
public Restaurant( String storename, int PeopleServed, double AveragePrice)
{
    super(storename);
    people = PeopleServed;
    avgPrice = AveragePrice;
}

//getpeopleserved method
public int getPeopleServed ( )
{
    return people;
}

// getAveragePrice method
public double getAveragePrice ( )
{
    return avgPrice;
}

//setPeopleServed mutator method
public void setPeopleServed ( int PeopleServed )
{
    if (PeopleServed >= 0)
        people = PeopleServed;
    else
        System.out.println(" The number of people served cannot be less than zero. " );
   
    
}

//setAveragePrice mutator method
public void setAveragePrice ( double AveragePrice )
{
    if ( AveragePrice < 0 )
    {
        System.out.println ( " The average price per meal cannot be less than zero. " );
    }
    else 
    { 
      avgPrice = AveragePrice;
    }
    }

//toString method
public String toString ()
{
    return( "Store name: " + " "  + super.getName() + 
            "\nNumber of people served: " + getPeopleServed()
            + "\nAverage price per meal " + getAveragePrice());
}

//equals method compares two restaurant objects for the same field values
public boolean equals ( Restaurant r1 )
{
    if ( r1.toString().equals(toString()))
        return true;
    else 
        return false;
}

//averageTaxes method 
public double averageTaxes() 
{
    return((people*avgPrice )*super.getTaxRate());
}
}
        



