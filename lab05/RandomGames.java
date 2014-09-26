////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//lab05
//Random Games Java Program
//
import java.util.Scanner;
public class RandomGames{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter R or r for Roulette, C or c for craps,"
        + "P or p for pick a card- ");
        String answer=myScanner.next();
        if(answer.length()==1){
        if(answer.equals("R")||answer.equals("r")){
            int r=(int)(Math.random()*38);
            switch (r%38) {
                case 37: System.out.println("Roulette: 00"); break;
                default: System.out.println("Roulette: "+r); break;
            }
        }
        else if(answer.equals("C")||answer.equals("c")){
            int a=(int)(Math.random()*6)+1;
            int b=(int)(Math.random()*6)+1;
            int craps=a+b;
            System.out.println("Craps: "+a+"+"+b+"="+craps);
        }
        else if(answer.equals("P")||answer.equals("p")){
            int suit=(int)(Math.random()*4)+1;
            int N=(int)(Math.random()*13)+1;
            switch (suit%4) {
                case 0: System.out.println(N+" of hearts"); break;
                case 1: System.out.println(N+" of diamonds"); break;
                case 2: System.out.println(N+" of spades"); break;
                case 3: System.out.println(N+" of clubs"); break;
            }
        }
        else {
            System.out.println("'"+answer
            +"' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
        }
        }
        else {
            System.out.println("a single character expected");
        }
    }
}