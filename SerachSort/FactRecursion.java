package SerachSort;

public class FactRecursion {
	public static void main(String args[]) {
		int n = 5;
		int factres = fact(n);
		System.out.println(""+factres);
	}
	public static int fact( int n) {
		if(n==0)
			return 1;
		else
			return (n*fact(n-1));
		     
	}
}
