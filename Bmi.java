import java.util.Scanner;
public class Bmi{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.println ("Enter your weight in pounds:  ");
double weight= input.nextDouble ();
System.out.println ("Enter your height in inches:  ");
double height= input.nextDouble ();
double weightKilograms= weight*0.45359237;
double heightMeters= height*0.0254;
double heightSquare= heightMeters * heightMeters;
double Bmi= weightKilograms/heightSquare;
System.out.print("BMI is " + Bmi);
}
 }

