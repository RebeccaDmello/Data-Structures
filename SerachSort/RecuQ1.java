package SerachSort;

public class RecuQ1 {
	public static void main(String args[]) {
		displayRowOfCharacters('*',5);
	}
	
	public static void displayRowOfCharacters(char c , int num) {
		if(num > 0) {
			System.out.print(c);
			displayRowOfCharacters( c , num-1);
		}
	}
}
