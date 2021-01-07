package SerachSort;
import java.util.Arrays;

public class BinSearch {
	public static void main(String args[]) {
		int[] a = {5,8,10,15,13,200,222,246,2,30,31,34,40};
		int temp = 0;
		
		//sorting array in ascending order which is required for binary sort
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				// reverse to < for descending
				if(a[i] > a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]= temp;
				}}}		
		System.out.println(Arrays.toString(a));
		int st = 0;
		int lst = a.length - 1;
		int find = 200;
		binSear(a, st, lst, find);
		//System.out.print(res);
	}
	//static method can only call static methods
	public static void binSear(int[] a, int st, int lst, int find) {
		int mid = (st + lst)/2;
		if(st > lst) {
			System.out.println("invalid");
		}
		else if(a[mid] == find) {
			System.out.print("answer is at location "+mid);
		}else if(a[mid] > find) {
			binSear(a, st, mid-1, find);			
		}
		else if(a[mid] < find) {
			binSear(a, mid+1, lst, find);
		}
		//return -1;
	}
}

