package SerachSort;
import java.util.Arrays;

public class SortOcomplexity {
	public static void main(String args[]) {
		int a[] = {3,-1,8,7,-9,0};
		int st = 0, lst = a.length - 1;
		boolean sorted = false;
		sort(a,st,lst,sorted);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int a[], int st, int lst, boolean sorted) {
		while(!sorted) {
			sorted = true;
			for(int i = 0; i < a.length-1; i++) {
				if(a[i]>a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					sorted = false;
				}
			}
		}
	}
}
