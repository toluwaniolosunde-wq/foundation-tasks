import java.util.Scanner;
public class EvenOdd{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.println("Enter number: ");
int numberOne =input. nextInt();
System.out.println("Enter number: ");

int numberTwo =input. nextInt();
System.out.println("Enter number: ");

int numberThree =input. nextInt();
System.out.println("Enter number: ");

int numberFour =input. nextInt();
System.out.println("Enter number: ");

int numberFive =input. nextInt();
int even=0;
int odd=0;
if( numberOne % 2==0){
even = even + numberOne;
}else {
odd= odd + numberOne;
}if( numberTwo % 2==0){
even = even + numberTwo;
}else {
odd= odd + numberTwo;
}if( numberThree % 2==0){
even = even + numberThree;
}else {
odd= odd + numberThree;
}if( numberFour % 2==0){
even = even + numberFour;
}else {
odd= odd + numberFour;
}if( numberFive % 2==0){
even = even + numberFive;
}else {
odd= odd + numberFive;
System.out.println("The sum of even numbers is " + even);
System.out.println("The sum of odd numbers is " + odd);
}
 }
  }






