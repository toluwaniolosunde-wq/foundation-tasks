import java.util.Scanner;
public class GasMileage{
public static void main(String [] args){
Scanner input= new Scanner (System.in);
int totalMiles=0;
int totalGallons=0;

while(true){
System.out.print("Enter miles driven (-1 to quit):");



int miles= input.nextInt();


if(miles == -1){ break;
}System.out.print ("Enter gallons used: ");
int gallons= input.nextInt();
double milesPerGallon= miles/gallons;
System.out.print("Miles per gallon for this trip: %.3f%n" + milesPerGallon);
totalMiles += miles;
totalGallons += gallons;
double combinedMilesPerGallon= totalMiles/totalGallons;
System.out.printf("Combined miles per gallon:%.3f%n%n", combinedMilesPerGallon);
}
 }
  }
