package RecursiveExample;
import java.util.Arrays;

public class ArrayReverse {
	public static void main(String args[]) {
		int a[] = {2,5,7,1,6};
		int st =0, lst = a.length-1;
		revArray(a,st,lst);
		System.out.print(Arrays.toString(a));
	}
	public static void revArray(int a[],int st, int lst) {
		int temp = a[st];
		a[st] = a[lst];
		a[lst] = temp;
		++st;
		--lst;
		if(st!=lst)
			revArray(a,st,lst);
	}
}
