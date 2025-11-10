import java.util.Scanner;
public class Integer{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.println ("Enter a number between 0 and 1000: ");
int number= input.nextInt ();
int numberOne = number% 10;
int numberTwo= number/10;
int numberThree= numberTwo % 10;
int numberFour= numberTwo / 10;
int total= numberOne+ numberThree +numberFour;
if (number > 0 && number < 1000){
System.out.println("The sum of digits is " + total);
}else{
System.out.println ("Enter a number between 0 and 1000");
}
 }
  }




