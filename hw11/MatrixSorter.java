//
//Shaolun Zhang
//hw11
//Program #2
//Matix Sorter Java Program
//Build and show a 3-D matrix randomly
//Then sort slab 3 by row and column
//
import java.util.Random;
public class MatrixSorter{
    //main method
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
   
    //method that build the matrix  
   public static int[][][]buildMat3d(){
       int a=0;
       int b=0;
       int c=0;
       int [][][] mat3d=new int [3][][];
       for (a=0;a<3;a++){
         mat3d[a]=new int [3+2*a][];
         for (b=0;b<3+2*a;b++){
           mat3d[a][b]=new int [a+b+1];{
             for (c=0;c<(a+b+1);c++){
               mat3d[a][b][c]=(int)(Math.random()*99)+1;
             }
           }
         }
       }
       return mat3d;
   }
    //method that show the matrix
   public static void show(int [][][] mat3d){
     for(int a=0;a<3;a++){
       System.out.println("---------------------------Slab "+(a+1));
       for(int b=0;b<(3+2*a);b++){
         for(int c=0;c<mat3d[a][b].length;c++){
           System.out.print(mat3d[a][b][c]+" ");
         }
         System.out.println();
       }
     }
   }
   
   //method that find the minimun in matrix
   public static int findMin(int [][][] mat3d){
     int min=100;
     for(int a=0;a<3;a++){
       for(int b=0;b<(3+2*a);b++){
         for(int c=0;c<(a+b+1);c++){
           if (mat3d[a][b][c]<=min){
             min=mat3d[a][b][c];
           }
         }
       }
     }
     return min;
   }
   
   //method sort()
   public static void sort(int[][]mat3d){
    for (int i=0;i<7;i++){
        selectionSort(mat3d[i]);
    }
    insertionSort(mat3d);
   }
   
   //method for selectionSort
   public static void selectionSort(int []list){
	     for (int i=0;i<list.length-1;i++){
	       int min=list[i];
	       int minIndex=i;
	       for(int j=i+1;j<list.length;j++){
	         if(list[j]<min){
	           min=list[j];
	           minIndex=j;
	         }
	       }
	       if(minIndex!=i){
	         list[minIndex]=list[i];
	         list[i]=min;
	       }
	     }
	   }
	
	//method for insertionSort
	public static void insertionSort(int [][]x){
		for (int i=1;i<7;i++){
			int [] a=x[i];
			int k;
			for (k=i-1;k>=0&&x[k][0]>a[0];k--){
				int []temp=x[k];
				x[k]=x[k+1];
				x[k+1]=temp;
			}
			x[k+1]=a;
		}
	}
	   
   
}
