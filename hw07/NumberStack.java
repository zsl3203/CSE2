////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw07
//Number Stack Java Program
//prompt the user for an int between 1 to 9 then display the 
//number stack
//
import java.util.Scanner;
public class NumberStack{
	//main method
	public static void main(String[] arg){
    //declear a new scanner
    Scanner scan=new Scanner(System.in);
    //prompt the user for a int between 1 and 9
    System.out.print("Enter a number between 1 and 9- ");
    int n=scan.nextInt();
    //using for loops
    System.out.println("Using for loops:");
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
    //using while loops
    System.out.println("Using while loops: ");
    int a=1,b=1,c=1,d=1,e=1,f=1,g=1,h=1;
    while (a<=n){
        while (b<=a){
            while (c<=n-a){
                System.out.print(" ");
                c++;
            }
            while (d<=2*a-1){
                System.out.print(a);
                d++;
            }
            while (e<=n-a){
                System.out.print(" ");
                e++;
            }
        System.out.print("\n");
        c=1;d=1;e=1;
        b++;
        }
        b=1;
            while (f<=n-a){
                System.out.print(" ");
                f++;
            }
            while (g<=2*a-1){
                System.out.print("-");
                g++;
            }
            while (h<=n-a){
                System.out.print(" ");
                h++;
            }
        System.out.print("\n");
        f=1;g=1;h=1;
        a++;
    }
    //using do-while loops
    System.out.println("Using do-while loops: ");
    int p=1,q=1,r=1,s=1,t=1,u=1,v=1,w=1;
    do {
        do{
            do{
                System.out.print(" ");
                r++;
            }while(r<=n-p+1);
            do{
                System.out.print(p);
                s++;
            }while(s<=2*p-1);
            do{
                System.out.print(" ");
                t++;
            }while(t<=n-p-1);
        System.out.print("\n");
        r=1;s=1;t=1;
        q++;
        }while(q<=p);   
        q=1;
            do{
                System.out.print(" ");
                u++;
            }while(u<=n-p+1);
            do{
                System.out.print("-");
                v++;
            }while(v<=2*p-1);
            do{
                System.out.print(" ");
                w++;
            }while(w<=n-p-1);
        System.out.print("\n");
        u=1;v=1;w=1;
        p++;
    }while(p<=n);
	}   //end of main method
}   //end of class


    