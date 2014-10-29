//
import java.util.Scanner;
public class Methods{
    public static void main(String [] arg){
	    Scanner scan=new Scanner(System.in);
	    int a,b,c;
	    System.out.println("Enter three ints");
	    System.out.print("a: ");
	    a=getInt(scan);
	    System.out.print("b: ");
    	b=getInt(scan);
    	System.out.print("c: ");
	    c=getInt(scan);
	    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	    System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
    }
    public static int getInt(Scanner scan){
        int x;
        if(scan.hasNextInt()){
          x = scan.nextInt();
        }
        else {
            while(!scan.hasNextInt()){
            System.out.println("You did not enter an int; try again- ");
            scan.next();
            } 
        x=scan.nextInt();
        }
    return x;
    }
    
    public static int larger(int m,int n){
        if(m>n){
            return m;
        }
        else {
            return n;
        }
    }
    
    public static boolean ascending(int d,int e,int f){
        if (d<e&&e<f){
            return true;
        }
        else {
            return false;
        }
    }
}

