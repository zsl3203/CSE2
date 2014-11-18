//
//Shaolun Zhang
//hw10
//Program #2
//
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  public static void showHands(){
      Scanner scan=new Scanner(System.in);
      int deck [] = new int [52];
      String answer="";
      String[] suits={"Spades","Hearts","Diamonds","Clubs"};
      String[] ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen",
      "king"};
      do{
      for (int i=0;i<deck.length;i++){
          deck[i]=i;
      }
      int hand[]={-1,-1,-1,-1,-1};
      for (int i=0;i<5;i++){
      int index=(int)(Math.random()*(52-i));
      hand[i]=deck[index];
      deck[index]=deck[51-i];
      deck[51-i]=-1;
      }
      String Clubs="Clubs: ";
      String Diamonds="Diamonds: ";
      String Hearts="Hearts: ";
      String Spades="Spades: ";
      for (int i=0; i<5; i++){
          String suit = suits[hand[i]/13];
          String rank = ranks[hand[i]%13];
          if (suit.equals("Clubs")){
              Clubs+=rank+" ";
          }
          if (suit.equals("Diamonds")){
              Diamonds+=rank+" ";
          }
          if  (suit.equals("Hearts")){
              Hearts+=rank+" ";
          }
          if (suit.equals("Spades")){
              Spades+=rank+" ";
          }
      }
      System.out.println(Clubs);
      System.out.println(Diamonds);
      System.out.println(Hearts);
      System.out.println(Spades);
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
      }while(answer.equals("Y")||answer.equals("y"));
  }
  
  public static void simulateOdds(){
      int deck [] = new int [52];
      int Rank[]={0,0,0,0,0};
      int j=0, ace=0, two=0, three=0, four=0, five=0, six=0, seven=0, eight=0,
      nine=0, ten=0, jack=0, queen=0, king=0, r=0, n=0;
      do{
      for (int i=0;i<deck.length;i++){
          deck[i]=i;
      }
      int hand[]={-1,-1,-1,-1,-1};
      for (int i=0;i<5;i++){
      int index=(int)(Math.random()*(52-i));
      hand[i]=deck[index];
      deck[index]=deck[51-i];
      deck[51-i]=-1;
      }
      for (int i=0;i<5;i++){
        Rank[i]=hand[i]%13;
      }
      if(FindDuplicates.exactlyOneDup(Rank)){
        for (int i=1;i<5;i++){
          if (Rank[i-1]==Rank[i]){
           switch (Rank[i]){
           case 0: ace+=1;break;
           case 1: two+=1;break;
           case 2: three+=1;break;
           case 3: four+=1;break;
           case 4: five+=1;break;
           case 5: six+=1;break;
           case 6: seven+=1;break;
           case 7: eight+=1;break;
           case 8: nine+=1;break;
           case 9: ten+=1;break;
           case 10: jack+=1;break;
           case 11: queen+=1;break;
           case 12: king+=1;break;
         }
        }
      }
      }
      else{
        n+=1;
      }
      j++;
      }while(j<10000);
      System.out.println("A: "+ace);
      System.out.println("2: "+two);
      System.out.println("3: "+three);
      System.out.println("4: "+four);
      System.out.println("5: "+five);
      System.out.println("6: "+six);
      System.out.println("7: "+seven);
      System.out.println("8: "+eight);
      System.out.println("9: "+nine);
      System.out.println("10: "+ten);
      System.out.println("J: "+jack);
      System.out.println("Q: "+queen);
      System.out.println("K: "+king);
      System.out.println("total not exactly one pair: "+n);
  }
}
