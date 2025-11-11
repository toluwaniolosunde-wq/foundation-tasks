import java.util.Scanner;
public class Balance{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.println ("Enter distance to drive: ");
double distance =input. nextDouble();
System.out.println ("Enter the fuel efficiency of the car in miles/gallon: ");
double efficiency =input. nextDouble();
System.out.println ("Enter the fuel price/gallon: ");
double price =input. nextDouble();
double answer= distance/efficiency * price;
System.out.println ("The cost of the trip is " + answer );
}
 }