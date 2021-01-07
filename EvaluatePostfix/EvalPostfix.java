package EvaluatePostfix;

import java.util.Arrays;
import java.util.Scanner;

public class EvalPostfix {
	static String InExp = "";
	
	
	public static void evaluatePostfix(String exp) {
		int characterCount = exp.length();
		int index = 0;
		char nextCharacter = ' ';
		Double val1, val2, result=0.0;
		StackInterface<Double> valueStack = new StackMethods();		
		
		while(index < characterCount) {
			nextCharacter = exp.charAt(index);
			//System.out.println(nextCharacter);
			switch (nextCharacter) {
				case 'a', 'b', 'c', 'd', 'e':
					if(nextCharacter=='a') {
						valueStack.push(2.0);
					}
					else if(nextCharacter=='b') {
						valueStack.push(3.0);
					}
					else if(nextCharacter=='c') {
						valueStack.push(4.0);
					}
					else if(nextCharacter=='d') {
						valueStack.push(5.0);
					}
					else if(nextCharacter=='e') {
						valueStack.push(6.0);
					}
					break;            
				case '+': case '-': case '*': case '/': case '^':
					val2 = valueStack.pop();
					val1 = valueStack.pop();
					System.out.println(val2 + " || " + val1);
					if(nextCharacter=='+') {
						result = val1 + val2;
					}
					else if(nextCharacter=='-') {
						result = val1 - val2;
					}
					else if(nextCharacter=='*') {
						result = val1 * val2;
					}
					else if(nextCharacter=='/') {
						result = val1 / val2;
					}
					else if(nextCharacter=='^') {
						result = Math.pow(val1, val2);
					}
					valueStack.push(result);
					break;
				default: break; 
			} // end switch
			index++;
		}
		System.out.println(valueStack.peek());
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String postfix = null;
		do {
			System.out.print("Enter The postFix Expression (Enter \"0\" to Terminate): ");
			postfix = sc.next();
			System.out.print("The Postfix Evaluation result is:");
			evaluatePostfix(postfix);
			System.out.print("\n");
		}while (!postfix.equals("0"));
	}
}
