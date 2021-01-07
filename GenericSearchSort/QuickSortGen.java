package GenericSearchSort;
import java.util.Arrays;

public class QuickSortGen{
	public static void main(String args[]) {
		Integer a[] = {4,8,2,7,9,0};
		int st = 0, lst = a.length - 1;
		qckSortGen(a,st, lst);
		System.out.println(Arrays.toString(a));
	}
	public static <T extends Comparable<T>> void qckSortGen(T a[], int st, int lst) {
		int i = st, j = lst;
		T pivot = a[st+(lst - st)/2];
		while(i<=j) {
			while(a[i].compareTo(pivot) == -1) { 
				i++;
			}
				
			while(a[j].compareTo(pivot) == 1) {
				j--;
			}
				
			if(i<=j) {
				T temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		if(st < j)
			qckSortGen(a,st,j);
		if(i < lst)
			qckSortGen(a,i,lst);
	}
}