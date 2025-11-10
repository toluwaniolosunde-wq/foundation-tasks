import java.util.Scanner;
public class Dice{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.print ("First die roll ");
int die1= input. nextInt();
if (die1>0 && die1<7){
System.out.print ("Throw second die " );
}int die2= input. nextInt();
int total= die1 + die2;
if (die2>0 && die2<7){
System.out.print ("The total is " +  total);
}
 }
  } 