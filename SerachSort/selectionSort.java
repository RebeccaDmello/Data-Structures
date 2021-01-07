package SerachSort;
import java.util.Arrays;

//selection sort implementation using Recursive calls
public class selectionSort {
	public static void main(String args[]) {
		int[] a = {5,8,10,15,13,200,222,246,2,30,31,34,40};
		int st = 0;
		int lst = a.length-1;
		selSort(a, st, lst);
		System.out.println(Arrays.toString(a));
	}
	
	//Iterative Selection sort
//	public static void selSort(int a[]) {
//		for(int i = 0; i <a.length ; i++) {
//			for(int j = i+1; j < a.length; j++) {
//				if(a[i]>a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}	
//	}
	
	//Recursive Selection sort
	public static void selSort(int a[], int st, int lst) {
		if(st == lst)
			return;
	    for ( int j = st + 1; j <= lst; j++ )
	    {
	        if (a[st] > a[j] )
	        {   
		        int temp = a[st];
			    a[st] = a[j];
			    a[j] = temp;
	        }
	    }  
		selSort(a, st + 1, lst);
	}	
}
