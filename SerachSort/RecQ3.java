package SerachSort;

public class RecQ3 {
	
	public static void main(String args[]) {
		int a[] = {1,2,3,4,5};
		
		
		int st = 0, lst = a.length-1;
		
		for(int i=0;i<a.length;i++) {
			System.out.println("before "+a[i]);
		}
		
		arryDisp(a,st,lst);
		
		for(int i=0;i<a.length;i++) {
			System.out.println("after "+a[i]);
		}	
	}
	
	public static void arryDisp(int a[], int st, int lst) {
		int temp = a[st];
		a[st] = a[lst];
		a[lst] = temp;
		++st;
		--lst;
		if(st != lst)
			arryDisp(a,st,lst);
	}
}
