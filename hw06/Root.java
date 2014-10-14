////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw06
//Program #2
//Root Java Program
//use bisection method to compute the square root of a number that user
//enters
//
import java.util.Scanner;
public class Root {
    //main method
    public static void main(String[] args){
        //declear a new scanner
        Scanner myScanner = new Scanner( System.in );
        //prompt the user to enter a double
        System.out.print("Enter a double: ");
        //declear variables
        double x=myScanner.nextDouble();
        double low=0.0;
        double high=(x+1);
        double t=0.0000001;
        double m=0;
        //loops for bisection method using 0.0000001 as the “tolerance”
        while ((high-low)>=t*(1+x)) {
            m=(low+high)/2;
            if ((m*m)>x){
                high=m;
            }
            else {
                low=m;
            }
        }
        //print out the result
        System.out.println("The square root of "+x+" is: "+m);
    }   //end of main method
}   //end of class

        