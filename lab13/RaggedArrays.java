//
import java.util.Arrays;
import java.util.Random;
public class RaggedArrays{
    public static void main(String [] arg){
        int [] [] ragged= new int [5] [];
        for (int i=0;i<5;i++){
            ragged[i]=new int [5+3*i];
            for (int j=0;j<5+3*i;j++){
                ragged[i][j]=(int)(Math.random()*40);
            }
        }
        System.out.println("The array before sorting");
        for (int i=0;i<5;i++){
            for (int j=0;j<5+3*i;j++){
            System.out.print(ragged[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The array after sorting");
        for (int i=0;i<5;i++){
            int [] A=new int [5+3*i];
            for (int j=0;j<5+3*i;j++){
                A[j]=ragged[i][j];
            }
            Arrays.sort(A);
            for (int j=0;j<5+3*i;j++){
            System.out.print(A[j]+" ");
            }
            System.out.println();
            }
    }
}
        