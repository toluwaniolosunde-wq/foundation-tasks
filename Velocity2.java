import java.util.Scanner;
public class Velocity{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.println ("Enter the initial velocity (v) in meters/seconds:  ");
double velocity= input.nextDouble ();
System.out.println ("Enter the ending velocity (v) in meters/seconds:  ");
double endingVelocity= input.nextDouble ();
System.out.println ("Enter the time (t) span in seconds:  ");
double time= input.nextDouble ();
double averageAcceleration= (endingVelocity - velocity) /( time);
System.out.println ("The average acceleration is" + averageAcceleration);
}
 }

