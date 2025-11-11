import java.util.Scanner;
public class Minutes{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.println ("Enter the number of minutes:  ");
int minutes= input.nextInt ();
int years= minutes/525600;

int remainderOne=minutes%525600;;

int remainderTwo= remainderOne/1440;
System.out.print ("Maximum number of years and remaining days are " + years + " years " + remainderTwo + " days ");
}
 }

