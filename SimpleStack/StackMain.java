package SimpleStack;

import java.util.Arrays;

public class StackMain {
	public static void main(String args[]) {
		StackInterface<Object> si = new StackMethods<>();
		si.push(".NET");
		si.push("Data Structures");
		si.push("Java");
		si.push("Web");
		si.push("Mobile");
		System.out.println(si.pop());
		System.out.println(si.peek());
		System.out.println(si.isEmpty());
		System.out.println(Arrays.toString(si.toArray()));
	}
}
