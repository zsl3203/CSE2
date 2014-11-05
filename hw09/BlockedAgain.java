////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw 09
//Blocked Again Java Program
//Practice designing a nested sequence of method calls that divide 
//a larger problem into subproblems. 
//
import java.util.Scanner;
public class BlockedAgain{
    //main method
    public static void main(String []s){
    int m;
    //force user to enter int in range 1-9, inclusive.
    m = getInt(); 
    //System.out.println("fsdfj"+m);
    allBlocks(m);
    }
    //method getInt
    public static int getInt(){
        int x=0;
        System.out.println("Enter an in int between 1 and 9, inclusive: ");
        x=checkRange(checkInt());
        return x;
    }
    //method checkInt
    public static int checkInt(){
        Scanner scan=new Scanner(System.in);
        int y=0;
        if(scan.hasNextInt()){
            y=scan.nextInt();
        }
        else {
            while(!scan.hasNextInt()){
            scan.next();
            System.out.println("You did not enter an int; try again: ");
            }
        y=scan.nextInt();
        }
        return y;
    }
    //method checkRange
    public static int checkRange(int z){
        Scanner scan=new Scanner(System.in);
        int input=z;
        if (input>=1&&input<=9){
            return input;
        }
        else {
            while(input<1||input>9){
                System.out.println("You did not enter an int in [1,9]; try again: ");
                input=scan.nextInt();
            }
        }
    return input;
    }
/*    public static void allBlocks(int n){
        for (int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                for(int j=1;j<=n-i;j++){
                System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                System.out.print(i);
                }
                for(int j=1; j <=n-i; j++) {
                System.out.print(" ");
                }
                System.out.print("\n");
            }
            for(int m=1;m<=n-i;m++){
                System.out.print(" "); 
            }
            for(int m=1;m<=2*i-1;m++){
                System.out.print("-");
            }
            for(int m=1;m<=n-i;m++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }*/
    
    //methid allBlocks
    public static void allBlocks(int n){
        for (int i=1;i<=n;i++){
            blocks(i,n);
            line(i,n);
        }
    }
    //method blocks
    public static void blocks(int a,int b){
        for(int k=1;k<=a;k++){
                for(int j=1;j<=b-a;j++){
                System.out.print(" ");
                }
                for(int j=1;j<=2*a-1;j++){
                System.out.print(a);
                }
                for(int j=1; j <=b-a; j++) {
                System.out.print(" ");
                }
                System.out.print("\n");
            }
    }
    //methid line
    public static void line (int c,int d){
        for(int m=1;m<=d-c;m++){
                System.out.print(" "); 
            }
            for(int m=1;m<=2*c-1;m++){
                System.out.print("-");
            }
            for(int m=1;m<=d-c;m++){
                System.out.print(" ");
            }
            System.out.print("\n");
    }
    
}   //end of class
