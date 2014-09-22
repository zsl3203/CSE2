////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw04
//Programe #2
//Days of month Java Program
//
import java.util.Scanner;
public class Month{
    //main method
    public static void main (String[] args){
        //create a scanner
        Scanner myScanner=new Scanner(System.in);
        //prompt the user to enter the month
        System.out.print("Enter an int giving the number of the month (1-12) ");
        //test int
        if (myScanner.hasNextInt()){
            int month=myScanner.nextInt();
            // test the month
            if (month>=1&&month<=12){
                if (month==1||month==3||month==5||month==7||month==8||month==10
                ||month==12){
                    System.out.println("The month has 31 days");
                }
                else if (month==4||month==6||month==9||month==11){
                    System.out.println("The month has 30 days");
                }
                //for February
                else {
                    //prompt the user to enter the year
                    System.out.print("Enter an int giving the year: ");
                    //test int
                    if (myScanner.hasNextInt()){
                        int year=myScanner.nextInt();
                        //test positive
                        if (year>0){
                            //test leap year
                            if ((year%4==0&&year%100!=0)||year%400==0){
                                System.out.println("The month has 29 days");
                            }
                            else {
                                System.out.println("The month has 28 days");
                            }
                        }
                        else {
                            System.out.println("You did not enter a positive "+
                            "int");
                            return;
                        }
                    }
                    else {
                        System.out.println("You did not enter an int");
                        return;
                    }
                }
            }
            else {
                System.out.println("You did not enter an int between 1 and 12");
                return;
            }
        }
        else {
            System.out.println("You did not enter an int");
            return;
        }
    }   //end of main method
}   //end of class