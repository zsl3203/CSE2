//
//Shaolun Zhang
//hw11
//Program #1
//Texas Poker Java Program
//Ask user for five cards and show them
//Determine wining hands
//
import java.util.Scanner;
import java.util.Arrays;
public class PokerHands{
    //main mrthod
    public static void main(String [] arg){
        Scanner scan=new Scanner(System.in);
        //variables
        String suit="";
        String answer="";
        int rank=0;
        int hand []=new int [5];
        int ranks []=new int [13];
        int times []=new int [5];
        int r=0;
        for (int i=0;i<13;i++){
            ranks[i]=0;
        }
        for (int i=0;i<5;i++){
            times[i]=0;
        }
        do{
        //prompt user for 5 cards
        for (int i=0;i<5;i++){
            System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
            suit=scan.next();
            while (!suit.equals("c")&&!suit.equals("d")&&!suit.equals("h")&&!suit.equals("s")){
                System.out.println("You did not enter a valid response");
                System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
                suit=scan.next();
            }
            System.out.print("Enter one of '14', '13', 12', '11', '10', ...'2'(14 for Ace)- ");
            rank=scan.nextInt();
            if(suit.equals("c")){
                hand[i]=rank-2;
            }
            if(suit.equals("d")){
                hand[i]=rank+13-2;
            }
            if(suit.equals("h")){
                hand[i]=rank+26-2;
            }
            if(suit.equals("s")){
                hand[i]=rank+39-2;
            }
            r=hand[i]%13;
            ranks[r]+=1;
        }
            for (int i=0;i<13;i++){
                //switch i for different situation
                switch(ranks[i]){
                    case 0: times[0]+=1;break;
                    case 1: times[1]+=1;break;
                    case 2: times[2]+=1;break;
                    case 3: times[3]+=1;break;
                    case 4: times[4]+=1;break;
                }
            }
        //call the method to show cards in hand
        showOneHand(hand);
        //determine winning hands
        if (royal(hand)){
            System.out.print("royal ");
        }
        if (straight(hand)){
            System.out.print("straight ");
        }
        if (flush(hand)){
            System.out.print("flush ");
        }
        //call metod repeat to find the repeation of cards in hand
        repeat(times,hand);
        System.out.println();
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
        answer=scan.next();
      }while(answer.equals("Y")||answer.equals("y"));
    }
    
    //method that show cards in hand
    public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",  "Spades:   "};
	String face[]={"2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ",
  	"J ","Q ","K ","A "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }
  
  //method that determine straight
  public static boolean straight(int hand[]){
      int a []=new int [5];
      for (int i=0;i<5;i++){
          a[i]=hand[i]%13;
      }
      Arrays.sort(a);
      if (a[0]+4==a[4]&&a[1]+3==a[4]&&a[2]+2==a[4]&&a[3]+1==a[4]){
          return true;
      }
      else {
          return false;
      }
  }
  
  //method that determine flush
  public static boolean flush(int hand[]){
      int b []=new int [5];
      for (int i=0;i<5;i++){
          b[i]=hand[i]/13;
      }
      if (b[0]==b[1]&&b[1]==b[2]&&b[2]==b[3]&&b[3]==b[4]){
          return true;
      }
      else {
          return false;
      }
  }
  
  //method that determine royal
  public static boolean royal(int hand[]){
      int c []=new int [5];
      for (int i=0;i<5;i++){
          c[i]=hand[i]%13;
      }
      Arrays.sort(c);
      if (c[0]==8&&c[1]==9&&c[2]==10&&c[3]==11&&c[4]==12){
          return true;
      }
      else {
          return false;
      }
  }
  
  //method that determine the repeation of cards in hand
  public static void repeat(int times[],int hand[]){
      if (times[4]==1){
          System.out.print("Four of a Kind");
      }
      if (times[2]==2){
          System.out.print("Two Pair");
      }
      if (times[2]==1&&times[3]==1){
          System.out.print("Full House");
      }
      if (times[2]==1&&times[3]!=1){
          System.out.print("One Pair");
      }
      if (times[1]==5&&!straight(hand)&&!flush(hand)){
          System.out.print("High Card");
      }
  }
}