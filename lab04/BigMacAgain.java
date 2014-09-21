////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//lab04
//BigMacAgain Java Programe
//
import java.util.Scanner;
public class BigMacAgain{
    //main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
        if(myScanner.hasNextInt()){
        int number = myScanner.nextInt();
        if (number>0){
        double price=2.22;
        double cost=(int)(number*price*100)/100.0;
        System.out.println("You order "+number+" BigMacs for a cost of "
        +cost+" dollars.");
        
        System.out.print("Do you want an order of fries (Y/y/N/n)?");
        String answer=myScanner.next();
        if(answer.equals("Y")||answer.equals("y")){
        System.out.println("You ordered fries at a cost of $2.15");
        System.out.println("The total cost is "+(cost + 2.15)+" dollars");
        }
        else if (answer.equals("N")||answer.equals("n")){
        System.out.println("The total cost of this meal is "+cost+" dollars.");}
        else{
            System.out.println("Error");
            return;
        }   //end of fries
        }   //end of if (number>0)
        else{
            System.out.println("You did not enter an int>0");
            return;
            }   //else for number<0
        }   //end of int
        else{
            System.out.println("You did not enter an int");
            return;
        }   //else for not int
    }
}

        

       