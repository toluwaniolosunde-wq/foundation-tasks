import java.util.Scanner;
public class Heat{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.println ("Enter amount of water in kilograms: ");
double water =input. nextDouble();
System.out.println ("Initial temperature of water: ");
double initialTemperature =input. nextDouble();
System.out.println ("Final temperature of water: ");
double finalTemperature =input. nextDouble();
double formula= water*(finalTemperature-initialTemperature)*4184;
System.out.println ("Energy needed to heat water is " + formula);
}
 }




