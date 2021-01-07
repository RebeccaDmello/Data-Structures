package SerachSort;
import java.util.Arrays;

public class QuickSort {
	public static void main(String args[]) {
		int[] a = {5,8,10,15,13,200,222,246,2,30,31,34,40};	
		int st = 0, lst = a.length - 1;
		qckSort(a,st,lst);
		System.out.println(Arrays.toString(a));
	}

	private static void qckSort(int a[], int st, int lst) {
        int i = st, j = lst;
        
        // Get the pivot element from the middle of the list
        int pivot = a[st + (lst-st)/2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (a[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (a[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                int temp = a[i];
                a[i]= a[j];
                a[j]= temp;
                i++;
                j--;
            }
        }
        // Recursion
        if (st < j)
            qckSort(a,st, j);
        if (i < lst)
            qckSort(a,i, lst);
    }
}
