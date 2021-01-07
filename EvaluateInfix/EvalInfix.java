package EvaluateInfix;

/**
 * @author rebecca
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class EvalInfix {
	//CHECKS THE PRECEDENCE OF OPERATORS
	public static int precedenceOP(Character ch) {
		if(ch == '+' || ch == '-')
			return 1;
		if (ch == '*' || ch == '/')
			return 2;
		if (ch == '^')
			return 3;
	    return 0;
	}
	
	//EVALUATES INFIX EXPRESSION RECEIVED FROM MAIN METHODS
	public static void evaluateInfix(String exp) {
		int characterCount = exp.length();
		
		int index = 0;
		Character nextCharacter = ' ';
		char topOper;
		Double val1, val2, result=0.0;
		//STACK TO STORE OPERATOR
		StackInterface<Character> operatorStack = new StackMethods();
		//STACK TO STORE OPERAND
		StackInterface<Double> valueStack = new StackMethods();		
		while(index < characterCount) {
			nextCharacter = exp.charAt(index);
			//READ NEXT CHARACTER FROM THE EXPRESSION ON PERFORM PUSH, POP AND EVALUATION ON THE STACK VALUE
			switch (nextCharacter) {
				case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h':
					if(nextCharacter=='a') 
						valueStack.push(2.0);
					else if(nextCharacter=='b') 
						valueStack.push(3.0);
					else if(nextCharacter=='c') 
						valueStack.push(4.0);
					else if(nextCharacter=='d') 
						valueStack.push(5.0);
					else if(nextCharacter=='e') 
						valueStack.push(6.0);
					else if(nextCharacter=='f') 
						valueStack.push(7.0);
					else if(nextCharacter=='g') 
						valueStack.push(1.0);
					else if(nextCharacter=='h') 
						valueStack.push(72.0);
					break;  
				case '0', '1', '2', '3', '4', '5','6','7','8','9':
					if(nextCharacter=='1') 
						valueStack.push(1.0);
					else if(nextCharacter=='2') 
						valueStack.push(2.0);
					else if(nextCharacter=='3') 
						valueStack.push(3.0);
					else if(nextCharacter=='4') 
						valueStack.push(4.0);
					else if(nextCharacter=='5') 
						valueStack.push(5.0);
					else if(nextCharacter=='6') 
						valueStack.push(6.0);
					else if(nextCharacter=='7') 
						valueStack.push(7.0);
					else if(nextCharacter=='8') 
						valueStack.push(8.0);
					else if(nextCharacter=='9') 
						valueStack.push(9.0);
					else if(nextCharacter=='0') 
							valueStack.push(0.0);
					break; 
				case '^':
					operatorStack.push(nextCharacter);
					break;             
				case '+': case '-': case '*': case '/':
					while(!operatorStack.isEmpty() && precedenceOP(nextCharacter) <= precedenceOP(operatorStack.peek())) {
						topOper = operatorStack.pop();
						val2 = valueStack.pop();
						val1 = valueStack.pop();
						if(topOper == '+')
							result = val1 + val2;
						else if(topOper == '-')
							result = val1 - val2;
						else if(topOper == '*')
							result = val1 * val2;
						else if(topOper == '/')
							result = val1 / val2;
						else if(topOper == '^')
							result = Math.pow(val1, val2);
						valueStack.push(result);	
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
						if(topOper == '+') 
							result = val1 + val2;
						else if(topOper == '-') 
							result = val1 - val2;
						else if(topOper == '*') 
							result = val1 * val2;
						else if(topOper == '/') 
							result = val1 / val2;
						else if(topOper == '^') 
							result = Math.pow(val1, val2);
						valueStack.push(result);
						topOper = operatorStack.pop();
					}
					break;
				default: break; // Ignore unexpected characters
			} // end switch
			index++;
		}
		//CHECKS IF THE OPERATOR STACK IS EMPTY, IF NOT THEN PERFORMS LAST OPERATIONS
		while(!operatorStack.isEmpty()) {
			topOper = operatorStack.pop();
			val2 = valueStack.pop();
			val1 = valueStack.pop();
			if(topOper == '+') 
				result = val1 + val2;
			else if(topOper == '-') 
				result = val1 - val2;
			else if(topOper == '*') 
				result = val1 * val2;
			else if(topOper == '/') 
				result = val1 / val2;
			else if(topOper == '^') 
				result = Math.pow(val1, val2);
			valueStack.push(result);	
		}
		System.out.println(valueStack.peek());
	}
	//MAIN METHOD WHICH TAKES INPUT FROM USER AND PASSES TO RESP. METHODS
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String infix = null;
		
		do {
			System.out.print("Enter The Infix Expression (Enter \"0\" to Terminate): ");
			infix = sc.next();
			System.out.println("The Infix To Postfix Expression:");
			evaluateInfix(infix);
			System.out.print("\n");
		}while (!infix.equals("0"));
	}
}
