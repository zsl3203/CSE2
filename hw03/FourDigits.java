////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw03
//Program #3
//FourDigits
//
import java.util.Scanner;
public class FourDigits{
    //main method
    public static void main(String[] args){
    //construct an instance of the Scanner class  
    Scanner myScanner=new Scanner(System.in);
    //input data
    System.out.print("Enter a double: ");
    double n=myScanner.nextDouble();
    int firstDigit, secondDigit, thirdDigit, forthDigit;
    //find out four digits
    firstDigit=(int)(n*10)%10;
    secondDigit=(int)(n*100)%10;
    thirdDigit=(int)(n*1000)%10;
    forthDigit=(int)(n*10000)%10;
    //print out result
    System.out.println("The four digits are: "+firstDigit+secondDigit+thirdDigit
    +forthDigit);
    }   //end of class
}   //end of method