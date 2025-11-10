import java.util.Scanner;
public class Distance{
public static void main (String [] args){
Scanner input= new Scanner (System.in);
System.out.print ("How many miles have been travelled? ");
double miles= input.nextDouble ();
double kilometres= miles*1.6;
if (miles> 0){
System.out.println ("The distance in kilometres is " + kilometres);
}else{
System.out.println ("Please enter correct distance in miles ");
}
 }
  }


