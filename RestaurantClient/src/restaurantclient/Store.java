/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantclient;

/**
 *
 * @author btong3
 */
public class Store {
    // declaring two instace variables
    private String storename;
    private final double taxRate = .10;

    //overloaded constructor
    public Store ( String name)
    { 
        storename = name; // setName method
    }
    
    //getName method
    public String getName ( )
    {
        return storename;
    }
    
    //setName mutator method
    public void setName ( String name ) 
    {
        storename = name; 
    }
    
    // toString method
    public String toString ()
    {
        return storename; 
    }
    
    //equals method
    public boolean equals ( Store s1 )
    {
        if (s1.getName().equals (storename))
            return true; 
        else 
            return false;
    }
    
    
    public double getTaxRate()
    {
        return taxRate;
    }
    
            
}


