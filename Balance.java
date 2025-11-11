import java.util.Scanner;
public class Balance{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.print ("Enter balance ");
double balance =input. nextDouble();
System.out.print ("Enter annual percentage interest rate:  ");
double interestRate =input. nextDouble();
double formula= balance * (interestRate/1200);
System.out.print ("Your interest for the next month" + formula );
}
 }


