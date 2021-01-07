package SerachSort;
import java.util.Arrays;

public class mergeSort {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		Integer[] a = new Integer[5];
        a[0] = new Integer(2);
        a[1] = new Integer(1);
        a[2] = new Integer(4);
        a[3] = new Integer(3);
        a[4] = new Integer(-1);
        int st=0,lst= a.length-1;
        mergesort(a,st, lst);
		System.out.println(Arrays.toString(a));
	}
	
	public static  <T extends Comparable<T>> void mergesort(T a[], int st, int lst) {
		if(st == lst) 
			return;
		else {
			int mid = (st+lst)/2;
			mergesort(a, st, mid);
			mergesort(a, mid+1, lst);
			System.out.println(st + " " + lst + " " + mid);
			merge(a, st, mid, lst);
		}
	}
	
	public static <T extends Comparable<T>> void merge(T a[], int st, int mid, int lst) {
		Object[] tmp = new Object[lst-st+1]; 
		int i = st;
		int j = mid+1;
		int k = 0;
		while (i <= mid && j <= lst) {
		    if (a[i].compareTo(a[j])<=0)      
		    	tmp[k] = a[i++];
		    else
		    	tmp[k] = a[j++];
		    k++;
		}
		if (i <= mid && j > lst) {
		    while (i <= mid) 
		    	tmp[k++] = a[i++];
		} else {
		    while (j <= lst)
			tmp[k++] = a[j++];
		}
		for (k = 0; k < tmp.length; k++) {
		    a[k+st] = (T)(tmp[k]); 
		}
		
	}
	
}
