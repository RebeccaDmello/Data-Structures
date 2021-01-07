package SerachSort;
import java.util.Arrays;

public class InsertionSort {
	public static void main(String args[]) {
		int[] a = {5,8,10,15,13,200,222,246,2,30,31,34,40};			
		int st=0,lst= a.length-1;
//		insSort(a, st, lst);
		insSort(a,lst);	//Recursive call 2
		System.out.println(Arrays.toString(a));
	}
	
	//Iterative insertion sort
//	public static void insSort(int a[],int st, int lst) {
//		for(int i=0; i<lst; i++) {
//			int j=i;
//			while(j>0 && a[j]<a[j-1]) {
//				int temp = a[j];
//				a[j]=a[j-1];
//				a[j-1]=temp;
//				j--;
//			}
//		}
//	}


	//Recursive Insertion Sort NOT IMPORTANT
//	public static void insSort(int a[],int st, int lst) {
//		if(st < lst) {
//			insSort(a, st, lst-1);
//			insertInOrder(a[lst],a,st,lst-1);
//		}
//	}
//	
//	public static void insertInOrder(int insElm,int a[],int st,int lst) {
//		if(insElm >= a[lst]) {
//			a[lst+1]=insElm;
//		}
//		else if(st<lst) {
//			a[lst+1]= a[lst];
//			insertInOrder(insElm,a,st,lst-1);
//		}
//		else {
//			a[lst+1]= a[lst];
//			a[lst]=insElm;
//		}
//	}
	
	
	//Recursive Insertion sort 2
	public static void insSort(int a[], int lst) {
		if(lst <= 1)
			return;
		insSort(a, lst-1);
		int insElm = a[lst];
		int j = lst - 1;
		while(j >= 0 && a[j] > insElm) {
			
			a[j+1]=a[j];
			j--;
			
		}
		a[j+1]= insElm;
		//System.out.println(Arrays.toString(a));
	}	
}

/*lst = array.length - 1;

j = lst-1   //2nd last element

j + 1 = lst - 1 + 1
lst // aaray last element
*/
