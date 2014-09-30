////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw05
//Program #1
//Burger King Java Program
//
import java.util.Scanner;
public class BurgerKing{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter a letter to indicate a choice of \n"+
        "Burger (B or b) \n"+"Soda (S or s) \n"+"Fries (F or f) ");
        String answer=myScanner.next();
        if(answer.length()==1){
            if(answer.equals("B")||answer.equals("b")){
                System.out.print("Enter (A or a) for all the fixins \n"+
                "(C or c) for cheese \n"+"(N or n) for none of the above ");
                String burger=myScanner.next();
                if(burger.equals("a")||burger.equals("A")){
                    System.out.println("You ordered a burger with all the fixins");
                }
                else if(burger.equals("c")||burger.equals("C")){
                    System.out.println("You ordered a burger with cheese");
                }
                else if(burger.equals("n")||burger.equals("N")){
                    System.out.println("You ordered a burger");
                }
                else {
                    System.out.println("You did not enter any of A a C c or N n");
                    return;
                }
            }
            else if(answer.equals("S")||answer.equals("s")){
                System.out.print("Do you want \n Pepsi (p or P) "+
                "Coke (c or C)\n Sprite (s or S) \n Mountain Dew (M or m)");
                String soda=myScanner.next();
                if(soda.equals("C")||soda.equals("c")){
                    System.out.println("You ordered a Pepsi");
                }
                else if(soda.equals("S")||soda.equals("s")){
                    System.out.println("You ordered a Sprite");
                }
                else if(soda.equals("M")||soda.equals("m")){
                    System.out.println("You ordered a Mountain Dew");
                }
                else {
                    System.out.println("You did not enter any of C c S s or N n");
                    return;
                }
            }
            else if(answer.equals("F")||answer.equals("f")){
                System.out.print("Do you want a large or small order of fries "+
                "(l,L,s, or S) ");
                String fries=myScanner.next();
                if(fries.equals("l")||fries.equals("L")){
                    System.out.println("You ordered large fries");
                }
                else if(fries.equals("s")||fries.equals("S")){
                    System.out.println("You ordered small fries");
                }
                else {
                    System.out.println("You did not enter any of L l S or s");
                    return;
                }
            }
            else {
                System.out.println("You did not enter any of B, b, S, s, F, or f");
                return;
            }
        }
        else {
            System.out.println("a single character expected");
        }
    }
}