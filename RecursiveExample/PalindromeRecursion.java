package RecursiveExample;
import java.util.Scanner;

public class PalindromeRecursion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String input = sc.next();
		char[] in = input.toCharArray();
		int st = 0;
		int lst = in.length - 1;
		checkPali(in,st,lst);
	}
	public static void checkPali(char[] in,int st,int lst) {  
				if(in[st] != in[lst]) {
					System.out.println("It is not palindrome");
					checkPali(in,st,lst);
				}
				if(in[st] == in[lst] || in[st] < in[lst] + 1) {
					checkPali(in,st+1,lst-1);
					System.out.println("Its a palindrome");	
				}
				 
	}
}
