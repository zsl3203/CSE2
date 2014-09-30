////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw05
//Program #2
//Boolean variables Java Program
//
import java.util.Scanner;
public class BoolaBoola{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        boolean A=true, B=true, C=true, answer=true;
        String L="&&", G="||";
        int a=(int)(Math.random()*2);
        int b=(int)(Math.random()*2);
        int c=(int)(Math.random()*2);
        int d=(int)(Math.random()*4);
        switch (a%2) {
            case 0: A=true; break;
            case 1: A=false; break;
        }
        switch (b%2) {
            case 0: B=true; break;
            case 1: B=false; break;
        }
       switch (c%2) {
            case 0: C=true; break;
            case 1: C=false; break;
        }
        switch (d%4) {
            case 0: answer=A&&B&&C; L="&&"; G="&&"; break;
            case 1: answer=A&&B||C; L="&&"; G="||"; break;
            case 2: answer=A||B&&C; L="||"; G="&&"; break;
            case 3: answer=A||B||C; L="||"; G="||"; break;
        }
        System.out.print("Does "+A+" "+L+" "+B+" "+G+" "+C+" have the value "
        +"true(t/T) or false(f/F)? ");
        String input=myScanner.next();
        if (input.equals("T")||input.equals("t")) {
            boolean I=true;
            if (I==answer) {
                System.out.println("Correct");
            }
            else {
                System.out.println("Wrong; try again");
            }
        }
        else if (input.equals("F")||input.equals("f")) {
            boolean I=false;
            if (I==answer) {
                System.out.println("Correct");
            }
            else {
                System.out.println("Wrong; try again");
            }
        }
        else {
            System.out.println("Wrong; try again");
        }
    }
}