////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw 08
//Driver Program
//add the definitions of the methods so that the program would produce the output 
//the program would produce the output 
//
import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }
  
  //method one
  public static char getInput(Scanner scan,String m){
      String answer=scan.next();
      char x=' ';
      while(answer.length()!=1){
          System.out.print("You should enter exactly one character- ");
          answer=scan.next();
      }
      while((!answer.equals("c"))&&(!answer.equals("C"))){
          System.out.print("You did not enter a character from the list 'Cc'; try again- ");
          answer=scan.next();
      }
      if(answer.equals("c")||answer.equals("C")){
         x=answer.charAt(0);
      }
      return x;
      }
    
    //method two
    public static char getInput(Scanner scan,String n,int a){
        String answer2=scan.next();
        char y=' ';
        int count=1;
        while(count<=5){
          if(answer2.equals("y")||answer2.equals("Y")||answer2.equals("N")||answer2.equals("n")){
            y=answer2.charAt(0);
            break;
          }
          else if(answer2.length()>1){
            System.out.print("You should enter exactly one character- ");
            answer2=scan.next();
            count++;
          }
          else {
            System.out.print("You did not enter a character from the list 'yYnN'; try again- ");
            answer2=scan.next();
            count++;
          }
        if(count==5){
          System.out.println("You failed after 5 tries");
          break;
        }
        }
        return y;
    }
    
    //method three
    public static char getInput(Scanner scan,String p,String q){
      System.out.println(p);
      System.out.println("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
      String answer3=scan.next();
      char z=' ';
      while(answer3.length()!=1){
        System.out.println("Enter exactly one character");
        System.out.println(p);
        System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
        answer3=scan.next();
      }
      while(answer3.length()==1){
        if(answer3.equals("0")||answer3.equals("1")||answer3.equals("2")||answer3.equals("3")||
        answer3.equals("4")||answer3.equals("5")||answer3.equals("6")||answer3.equals("7")||
        answer3.equals("8")||answer3.equals("9")){
          z=answer3.charAt(0);
          break;
        }
        else {
        System.out.println("You did not enter an acceptable character");
        System.out.println(p);
        System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
        answer3=scan.next();
        }
      }
      return z;
    }
}

