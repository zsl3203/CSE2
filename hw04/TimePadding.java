////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw04
//Programe #4
//Time Padding Java Program
//
import java.util.Scanner;
public class TimePadding{
    //main method
    public static void main (String[] args){
        //create a scanner
        Scanner myScanner=new Scanner(System.in);
        //prompt the user to enter the time in seconds
        System.out.print("Enter the time in seconds: ");
        //test int
        if (myScanner.hasNextInt()){
            int time=myScanner.nextInt();
            int hour=(int)(time/3600);
            int minute=(int)((time%3600)/60);
            int second=(int)((time%3600)%60);
            //test positive
            if (time>0){
                if (minute<10&&second>=10){
                    System.out.println("The time is "+hour+":0"+minute+":"
                    +second);
                }
                else if (second<10&&minute>=10){
                    System.out.println("The time is "+hour+":"+minute+":0"
                    +second);
                }
                else if (minute<10&&second<10){
                    System.out.println("The time is "+hour+":0"+minute+":0"
                    +second);
                }
                else {
                    System.out.println("The time is "+hour+":"+minute+":"
                    +second);
                }
            }
            else {
                System.out.println("You did not enter a positive int");
                return;
            }
        }
        else {
            System.out.println("You did not enter an int");
            return;
        }
    }   //end of main method
}   //end of class