////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw03
//Program #1
//Bicycle
//
import java.util.Scanner;
public class Bicycle{
    //main method
    public static void main (String[] args){
    //construct an instance of the Scanner class
    Scanner myScanner=new Scanner(System.in);
    //input data
    System.out.print("Enter the number of second: ");
    int nTime=myScanner.nextInt();
    System.out.print("Enter the number of counts: ");
    int nCount=myScanner.nextInt();
    double wheelDiameter=27.0,
        PI=3.14159,
        feetPerMile=5280,
        inchesPerFoot=12,
        secondsPerMinute=60,
        minutesPerHour=60;
    double Distance, avgMph;
    //calculate the Disatance and avgMph
    Distance=nCount*wheelDiameter*PI/(inchesPerFoot*feetPerMile);
    avgMph=Distance/nTime*secondsPerMinute*minutesPerHour;
    avgMph=(int)(avgMph*100)/100.0;
    Distance=(int)(Distance*100)/100.0;
    //print out the result
    System.out.println("The distance was "+Distance+" miles and took "+
    (nTime/secondsPerMinute)+" minutes.");
    System.out.println("The average mph was "+avgMph);
    }   //end of main method 
}   //end of class