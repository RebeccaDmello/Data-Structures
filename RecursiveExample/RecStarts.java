package RecursiveExample;
import java.util.*;

class RecStarts{
	public static void main(String args[]) {
		displayRowOfCharacters('*',5);
	}
	
	public static void displayRowOfCharacters(char c, int n) {
		if(n>0) {
			System.out.print(c);
			displayRowOfCharacters(c,n-1);
		}
	}
}
