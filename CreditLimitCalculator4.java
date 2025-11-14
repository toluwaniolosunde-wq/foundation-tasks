import java.util.Scanner;
public class CraditLimitCalculator{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.print("Enter the number of customers: ");
int customerNumbers= input.nextInt();

for (int i=0; i< customerNumbers; i= i + 1){
System.out.println ("\nCustomer " + (i + 1));
System.out.print ("Enter account number: ");
int accountNumber= input.nextInt();
System.out.print ("Enter beginningBalance: ");
int beginningBalance= input.nextInt();

System.out.print("Enter total charges: ");
int totalCharges= input.nextInt();
System.out.print("Enter total credits: ");
int totalCredits= input.nextInt();



System.out.print ("Enter total credit limit: ");
int creditLimit= input.nextInt();

int newBalance= beginningBalance + totalCharges - totalCredits;
System.out.print ("New balance: " + newBalance);

if(newBalance>creditLimit){
System.out.println("Credit limit has been passed");
}
 }
  }
   }

