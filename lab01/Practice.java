import java.util.Scanner;
public class Practice{
	public static void main(String[] arg){
		int [][]list={
			{2,1,5,9,4},
			{13,14,11,15,12,19,17,16},
		};
		insertionSort(list[0]);
		insertionSort(list[1]);
		int temp[]=list[0];
		list[0]=list[1];
		list[1]=temp;
		for(int j=0;j<2;j++){
		for(int i=0;i<list[j].length;i++){
			System.out.print(list[j][i]+" ");
		}
		System.out.println();
		}
	}

	public static void selectionSort(int []x){
	     for (int i=0;i<x.length-1;i++){
	       int min=x[i];
	       int minIndex=i;
	       for(int j=i+1;j<x.length;j++){
	         if(x[j]<min){
	           min=x[j];
	           minIndex=j;
	         }
	       }
	       if(minIndex!=i){
	         x[minIndex]=x[i];
	         x[i]=min;
	       }
	     }
	   }
	   
	public static void insertionSort(int []x){
		for (int i=1;i<x.length;i++){
			int a=x[i];
			int k;
			for (k=i-1;k>=0&&x[k]>a;k--){
				x[k+1]=x[k];
			}
			x[k+1]=a;
			System.out.println(k);
		}
	}
	
}
	