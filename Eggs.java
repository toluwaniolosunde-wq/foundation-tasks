import java.util.Scanner;
public class Eggs{
public static void main (String [] args){
Scanner input=new Scanner (System.in);
System.out.println ("How many eggs do you have? ");
int numberEggs =input.nextInt();
int gross= numberEggs/144;
int dozen= (numberEggs%144)/12;
int leftovers= (numberEggs%12);
if(numberEggs > 500){
System.out.println ("You have " + gross + "gross left.");
}if(numberEggs > 500){
System.out.println ("You have " + dozen + "dozen left.");
}if(numberEggs > 500){
System.out.println ("You have " + leftovers
 + "leftovers." );
}
 }
  }
