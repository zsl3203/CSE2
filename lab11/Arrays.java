//
import java.util.Scanner;
public class Arrays{
    public static void main(String [] arg){
        int [] input=new int [10];
        int sum=0;
        int min=0;
        int max=0;
        
        System.out.print("Enter 10 ints ");
        Scanner scan= new Scanner(System.in);
        for (int i=0;i<10;i++){
            input [i]=scan.nextInt();
            sum+=input[i];
        }
        
        int [] inverse=new int[10];
        for (int i=0;i<10;i++){
            inverse[i]=input[9-i];
        }
        
        min=input[0];
        for (int i=0;i<10;i++){
            if (input[i]<min){
                min=input[i];
            }
        }
        
        max=input[0];
        for (int i=0;i<10;i++){
            if (input[i]>max){
                max=input[i];
            }
        }
        
        System.out.println("The lowest entry is "+min);
        System.out.println("The highest entry is "+max);
        System.out.println("The sum is "+sum);
        for (int i=0;i<10;i++){
            System.out.println(" "+input[i]+" "+inverse[i]);
        }
        
        
        
    }
}