package SerachSort;

public class fiboRecu {
	public static void main(String args[]) {
		int count = 10;
		fibo(count-2);
		for(int i = 0; i < count ;i++ ) {
			System.out.print(" "+fibo(i));
		}
	}
	public static int fibo(int count) {
		if(count == 0)
			return 0;
		if(count == 1)
			return 1;
		return fibo(count-2) + fibo(count-1);
	}
}
