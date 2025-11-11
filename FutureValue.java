import java.util.Scanner;
public class FutureValue{
public static void main (String [] args){
Scanner input= new Scanner (System.in);

System.out.println ("Enter investment amount:   ");

double investmentAmount= input.nextDouble ();

System.out.println ("Enter annual interest rate:   ");

double interestRate= input.nextDouble ();

System.out.println ("Enter number of Years:   ");

int years= input.nextInt ();

double futureInvestmentValue= investmentAmount * Math.pow((1+ (
interestRate/100)), (years*12));
System.out.println ("Future value is $" + futureInvestmentValue);
}
 }


