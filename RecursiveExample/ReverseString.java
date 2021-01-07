package RecursiveExample;

public class ReverseString {
	public static void main(String args[]){
		String a = "Rebecca";
		char c[] = a.toCharArray();
		int st = 0;
		int lst = c.length - 1; 
		revString(c,st,lst);
		System.out.println(c);
	}
	public static void revString(char c[], int st, int lst) {
		char temp = c[st];
		c[st] = c[lst];
		c[lst] = temp;
		++st;
		--lst;
		if(st!=lst)
			revString(c,st,lst);
	}
}
