import java.util.Scanner;
public class Subtotal{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.print ("How much is your subtotal? ");
double subtotal= input.nextDouble ();
System.out.print ("What is your gratuity rate? ");
double gratuity= input.nextDouble ();
double newGratuity= subtotal* gratuity/100;
double newSubtotal= subtotal + newGratuity;
System.out.print ("Your gratuity is " + newGratuity + " and total is " + newSubtotal);
}
 }



