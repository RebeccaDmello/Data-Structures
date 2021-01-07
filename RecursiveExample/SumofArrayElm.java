package RecursiveExample;

public class SumofArrayElm {
	public static void main(String args[]) {
		int a[] = {2,5,7,1};
		int n = a.length;
		System.out.println(dispSum(a,n));
	}
	public static int dispSum(int a[], int n) {
		
		if(n == 1) {
			return (int)a[n-1];
		}else {
			return ((int)(dispSum(a, n-1)*(n-1) + a[n-1]));
		}
	}
}
