////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw03
//Program #2
//Root
//
import java.util.Scanner;
public class Root{
    //main method
    public static void main (String[] args){
    //construct an instance of the Scanner class
    Scanner myScanner=new Scanner(System.in);
    //input data
    System.out.print("Enter a double: ");
    double x=myScanner.nextDouble();
    double guess, cubeValue;
    //calculate the cube root and cube
    guess=x/3;
    guess=(2*guess*guess*guess+x)/(3*guess*guess);
    guess=(2*guess*guess*guess+x)/(3*guess*guess);
    guess=(2*guess*guess*guess+x)/(3*guess*guess);
    guess=(2*guess*guess*guess+x)/(3*guess*guess);
    guess=(2*guess*guess*guess+x)/(3*guess*guess);
    cubeValue=guess*guess*guess;
    //print out result
    System.out.println("The cube root is: "+guess);
    System.out.println("The value of cube is: "+cubeValue);
    }   //end of main method
}   //end of class