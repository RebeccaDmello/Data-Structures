package GenericSearchSort;
import java.util.Arrays;

public class SelectionSortGen {
	public static void main(String args[]) {
		Integer a[] = {3,5,7,1,2,9};
		int st = 0 , lst = a.length - 1;
		selSortGen(a, st, lst);
		System.out.println(Arrays.toString(a));
	}
	public static <T extends Comparable<T>> void selSortGen(T[] a, int st, int lst) {
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i].compareTo(a[j]) == 1) {
					T temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}


