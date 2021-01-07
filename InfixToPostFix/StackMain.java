package InfixToPostFix;

import java.util.Arrays;
import java.util.Scanner;

public class StackMain<T> {
	public static int precedenceOP(Character ch) {
		if(ch == '+' || ch == '-')
			return 1;
		if (ch == '*' || ch == '/')
			return 2;
		if (ch == '^')
			return 3;
	    return 0;
	}
	
	public static void inToPostExp(String exp) {
		int characterCount = exp.length();
		int index = 0;
		Character nextCharacter = ' ';
		char topOper, val1, val2;
		StackInterface<Character> operatorStack = new StackMethods();
		StackInterface<Character> valueStack = new StackMethods();		
		while(index < characterCount) {
			nextCharacter = exp.charAt(index);
			//System.out.println(nextCharacter);
			switch (nextCharacter) {
				case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h':
					valueStack.push(nextCharacter);
					break;
				case '0', '1', '2', '3', '4', '5':
					valueStack.push(nextCharacter);
					break;
				case '^':
					operatorStack.push(nextCharacter);
					break;             
				case '+': case '-': case '*': case '/':
					while(!operatorStack.isEmpty() && precedenceOP(nextCharacter) <= precedenceOP(operatorStack.peek())) {
						topOper = operatorStack.pop();
						val2 = valueStack.pop();
						val1 = valueStack.pop();
						valueStack.push(val1);
						valueStack.push(val2);
						valueStack.push(topOper);
					}
					operatorStack.push(nextCharacter);
					break;
				case '(':
					operatorStack.push(nextCharacter);
					break;
				case ')':
					topOper = operatorStack.pop();
					while(topOper != '(') {
						val2 = valueStack.pop();
						val1 = valueStack.pop();
						valueStack.push(val1);
						valueStack.push(val2);
						valueStack.push(topOper);
						topOper = operatorStack.pop(); 
					}
					break;
				default: break; // Ignore unexpected characters
			} // end switch
			index++;
		}
		while(!operatorStack.isEmpty()) {
			topOper = operatorStack.pop();
			val2 = valueStack.pop();
			val1 = valueStack.pop();
			valueStack.push(val1);
			valueStack.push(val2);
			valueStack.push(topOper);
		}
		System.out.println(Arrays.toString(valueStack.toArray()));
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String infix = null;
		
		do {
			System.out.print("Enter The Infix Expression (Enter \"0\" to Terminate): ");
			infix = sc.next();
			System.out.print("The Infix To Postfix Expression:");
			inToPostExp(infix);
			System.out.print("\n");
		}while (!infix.equals("0"));
	}
}
