////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw06
//Program #1
//Roulette simulations Java Program
//This programe simulates one person’s betting on 100 spins, and 
//run the simulation 1000 times and collect data on the outcome
//compute the number of times this he lose everything
//compute the total winnings and the number of times he walked away 
//with a profit in one session of 100 spins of the wheel
//
public class Roulette{
    //main method
    public static void main(String[] args) {
        //declaer variables
        int r=0;
        int s=0;
        int wins=0;
        int totalwin=0;
        int profit=0;
        int lose=0;
        //loops of 1000 repetitions
        while (r<1000) {
            //increament of r
            r++;
            //generate a random number from 0 to 37
            int n=(int)(Math.random()*38);
            //loops of 100 spins
            while (s<100) {
                //increament of s
                s++;
                //generate a random number from 0 to 37
                int result=(int)(Math.random()*38);
                //the situations of winning
                if (result==n) {
                    //increament of wins
                    totalwin++;
                    wins++;
                }
            }
            //the situations that lose everything
            if (wins==0) {
                //increament of lose
                lose++;
            }
            //the situations that walked away with a profit
            else if (wins>=3) {
                //increament of profit
                profit++;
            }
            //set the spins and wins to 0 in order to make the loop goes on
            s=0;
            wins=0;
        }
        //print the result
        System.out.println("The total wins is: "+totalwin);
        System.out.println("The number of times that lose everything is: "+lose);
        System.out.println("The number of times walked away with profit is: "+profit);
    }   //end of main method
}   //end of loops