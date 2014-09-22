////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw04
//Programe #3
//Course Number Java Program
//
import java.util.Scanner;
public class CourseNumber{
        //prompt the user to enter the course number
        System.out.print("Enter a six digit course number: ");
        int number=myScanner.nextInt();
        //test range of years
        if (number>=186510&&number<=201440){
            int year=(int)(number/100);
            //test course number
            if (number%100==10){
                System.out.println("The course was offered in the spring "+
                "semester of "+year);
            }
            else if (number%100==20){
                System.out.println("The course was offered in the summer 1 "+
                "semester of "+year);
            }
            else if (number%100==30){
                System.out.println("The course was offered in the summer 2 "+
                "semester of "+year);
            }
            else if (number%100==40){
                System.out.println("The course was offered in the fall "+
                "semester of "+year);
            }
            else {
                System.out.println((number%100)+
                " is not a legitimate semester");
            }
        }
        else {
            System.out.println("The number was outside the range "+
            "[186510,201440]");
            return;
        }
    }   //end of main method
}   //end of class