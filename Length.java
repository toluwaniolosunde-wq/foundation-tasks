import java.util.Scanner;
public class Length{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.println ("Enter speed: ");
double speed =input. nextDouble();
System.out.println ("Enter acceeration: ");
double acceleration =input. nextDouble();
double length= speed * speed/ (2* acceleration);
System.out.println ("The minimum run way length for this airplane is " + length);
}
 }



