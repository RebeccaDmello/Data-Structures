package GenericSearchSort;
import java.util.Arrays;

public class InsSortGen {
	public static void main(String args[]) {
		Integer a[] = {99,9,8,2,4,7,9};
		int lst = a.length - 1;
		insSort(a,lst);
		System.out.println(Arrays.toString(a));
	}
	public static <T extends Comparable<T>> void insSort(T a[], int lst) {
		if(lst <=0)
			return;
		insSort(a,lst - 1);
		T insElm = a[lst];
		int j = lst - 1;
		while(j >= 0 && a[j].compareTo(insElm) == 1) {
			a[j+1] = a[j];
			j--;
		}
		a[j+1] = insElm;
	}
}
