import java.util.Scanner;
public class DistanceCovered{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.println ("Enter the initial velocity (v) in meters/seconds:  ");
double velocity= input.nextDouble ();
System.out.println ("Enter the time (t) span in seconds:  ");
double time= input.nextDouble ();
System.out.println ("Enter the acceleration (a) in meters/seconds:  ");
double acceleration= input.nextDouble ();
double distance= ((velocity*time) + (0.5*acceleration*time*time));
System.out.print ("The distance covered is "+ distance );
}
 }




