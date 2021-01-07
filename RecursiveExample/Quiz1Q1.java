package RecursiveExample;
import java.util.Arrays;

public class Quiz1Q1 {
	public static void main(String args[]) {
		int a[] = {9,7,-3,99,-2,8,-4};
		int st = 0, lst = a.length - 1;
		sort(a,st,lst);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int a[], int st, int lst) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>=a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j]=temp;
					
				}
			}
		}
	}
}
