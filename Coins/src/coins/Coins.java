/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coins;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author btong3
 */
public class Coins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nickles;
        int dimes; 
        int quarters; 
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print( "\nEnter the number of nickles > " );
        nickles = scan.nextInt( );
        System.out.println( " Your number of nickles: " + nickles );
        
        System.out.print( "\nEnter the number of dimes > " );
        dimes = scan.nextInt ( );
        System.out.println( " Your number of dimes: " + dimes );
        
        System.out.print( "\nEnter the number of quarters > " );
        quarters = scan.nextInt ( ); 
        System.out.println( " Your number of quarters: " + quarters );
       
       DecimalFormat pricePattern = new DecimalFormat( "$#0.00" );
       double total = (nickles * .05) + (dimes * .10) + (quarters * .25);
       System.out.println( "\nThe total total dollar ammount of coins: " + pricePattern.format( total ) );
       System.exit (0); 
       // TODO code application logic here
    }
}
