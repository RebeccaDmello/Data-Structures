package RecursiveExample;
import java.util.Arrays;

public class ReverseArray {
	public static void main(String args[]) {
		int a[] = {2,5,8,9,1};
		int st = 0;
		int lst = a.length - 1;
		revArray(a,st,lst);
		System.out.println(Arrays.toString(a));
	}
	public static void revArray(int a[],int st, int lst) {
			int temp = a[st];
			a[st] = a[lst];
			a[lst] = temp;
			++st;
			--lst;
			if(st != lst)
				revArray(a,st,lst);
	}
}
