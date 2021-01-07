package BracketChecker;
import java.util.Scanner;

public class StackBalanceMain {

	public static boolean isPaired(char open, char close) {
		return (open == '(' && close == ')') ||
				(open == '[' && close == ']') ||
				(open == '{' && close == '}');
	}
	public static boolean checkBalance(String exp) {
		StackInterface<Character> si = new StackMethods<>();
		int index = 0;
		int expLength = exp.length();
		boolean isBalanced = true;
		char nextChar=' ';
		while(isBalanced && (index<expLength)) {
			nextChar = exp.charAt(index);
			switch(nextChar) {
			case '(': case '[' : case '{':
				si.push(nextChar);
				break;
			case ')':case ']': case '}':
				if(si.isEmpty()) {
					isBalanced = false;
				}
				else{
					char toPop = si.pop();
					isBalanced = isPaired(toPop, nextChar);
				}
				break;
			default:
				break;
			}
			index++;
		}
		if(!si.isEmpty()) {
			return isBalanced = false;
		}
		return isBalanced;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your expression to check if its balanced");
		String exp = sc.next();
		System.out.println("The Statement is: "+checkBalance(exp));
	}
}
