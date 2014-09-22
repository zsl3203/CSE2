////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw04
//Programe #1
//IncomeTax Java Programe
//
import java.util.Scanner;
public class IncomeTax{
    //main method
    public static void main (String[] args){
        //create a scanner
        Scanner myScanner=new Scanner(System.in);
        //prompt the user to enter the income
        System.out.print("Enter an int giving the number of thousands: ");
        //test the value
        if (myScanner.hasNextInt()){
            int number=myScanner.nextInt();
            if (number>=0){
              int money=number*1000;
              double tax, taxrate;
              if (number<20){
                  taxrate=0.05;
                  tax=(int)(taxrate*money*10)/10.0;
                  System.out.println("The tax rate on $"+money+" is 5.0%, "+
                  "and the tax is $"+tax);}
              else if (number>=20&&number<40){
                  taxrate=0.07;
                  tax=(int)(taxrate*money*10)/10.0;
                  System.out.println("The tax rate on $"+money+" is 7.0%, "+
                  "and the tax is $"+tax);}
              else if (number>=40&&number<78){
                  taxrate=0.12;
                  tax=(int)(taxrate*money*10)/10.0;
                  System.out.println("The tax rate on $"+money+" is 12.0%, "+
                  "and the tax is $"+tax);}
              else {
                  taxrate=0.14;
                  tax=(int)(taxrate*money*10)/10.0;
                  System.out.println("The tax rate on $"+money+" is 14.0%, "+
                  "and the tax is $"+tax);}
            }
            else { 
                System.out.println("You did not enter a positive int");
                return;}
        }
        else{
            System.out.println("You did not enter an int");
            return;}
    }   //end of main method
}   //end of class
