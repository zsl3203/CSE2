////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//lab07
//While Loops Java Program
//
import java.util.Scanner;
public class LoopTheLoop {
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        String answer="Y";
        while (answer.equals("y")||answer.equals("Y")){
        int nStars=16;
        while (nStars>15||nStars<1){
            System.out.print("Enter an int between 1 and 15(1): ");
            while (myScanner.hasNextInt()==false){
                if (myScanner.hasNextInt()){
                    nStars=myScanner.nextInt();
                    break;
                }
                else {
                    System.out.print("Enter an int between 1 and 15(2): ");
                    myScanner.next();
                }
            }
            nStars=myScanner.nextInt();
        }
        int n=0;
        while (n<nStars){
            System.out.print("*");
            n++;
        }
        int m=0;
        while (m<=nStars){
            int times=m;
            while (times!=0){
                System.out.print("*");
                times--;
            }
            System.out.print("\n");
            m++;
        }
        System.out.print("Enter y or Y to go again: ");
        answer=myScanner.next();
        if (answer.equals("y")==false && answer.equals("Y")==false){
            break;
        }
        }
    }
}