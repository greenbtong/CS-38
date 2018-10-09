/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantclient;

/**
 *
 * @author btong3
 */
public class RestaurantClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Restaurant r1 = new Restaurant ( "Juan", 10, 15 );
    
    Restaurant r2 = new Restaurant ( "One One", 15, 10 );
    
    //output of r1 name, number of people served, and average price per person
  System.out.println(r1.toString()+ "\n");
  System.out.println(r2.toString() + "\n");
   
    //change r2 values of number of people served and the average price per person to r1's value
   r2.setPeopleServed(r1.getPeopleServed());
   r2.setAveragePrice(r1.getAveragePrice());
   
   //equals method
   if ( r1.equals(r2) )
       System.out.println( "r1 and r2 are equal \n");
   else
       System.out.println( "r1 and r2 are not equal \n");
   
   //using the mutator method on r2 to change the name to the name of r1
   r2.setName(r1.getName());
   
   //equal method 
   if (r1.equals(r2)) 
       System.out.println( "r1 and r2 are equal. \n");
   else
       System.out.println( "r1 and r2 are not equal. \n");
   
   //output average price
   System.out.println( "The average price per person is " + r1.getAveragePrice() + ".\n");
    }
   
}
