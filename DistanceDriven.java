import java.util.Scanner;
public class DistanceDriven{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.println ("Enter the distance to drive:   ");
double distance= input.nextDouble ();
System.out.println ("Enter the fuel efficiency of the car in miles/gallon:   ");
double fuelEfficiency= input.nextDouble ();
System.out.println ("Enter the price/gallon:   ");
double price= input.nextDouble ();
double drivingCost= distance/fuelEfficiency*price;
System.out.println ("The cost of driving is $" + drivingCost);
}
 }







