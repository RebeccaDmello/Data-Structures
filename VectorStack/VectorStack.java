package VectorStack;
import java.util.Vector;
import java.util.Arrays;
import java.util.Scanner;

public class VectorStack<T> implements StackInterface<T> {
	private Vector<T> stack;
	private static final int MAX_CAPACITY = 2;
	
	public VectorStack(){
		this(MAX_CAPACITY);
	}
	
	public VectorStack(int maxCapacity) {
		stack = new Vector<T>(MAX_CAPACITY);
	}//end vector class constructor
	
	
	//STACK METHODS USED WITH VECTOR STACK
	@Override
	public void push(T newEntry) {
		stack.add(newEntry);
	}

	@Override
	public T pop() {
		T top = null;
		if(!isEmpty())
			top = stack.remove(stack.size() - 1);
		return top;
	}

	@Override
	public T peek() {
		T top = null;
		if(!isEmpty())
			top = stack.lastElement();
		return top;
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public void clear() {
		stack.clear();
	}

	@Override
	public T[] toArray() {
		T[] temp = (T[]) new Object[stack.size()];
		for(int i = 0; i < stack.size(); i++) {
			temp[i] = stack.elementAt(i);
		}
		return temp;
	}

	public static void main(String[] args) {
		VectorStack<Object> vstack = new VectorStack<>();
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while(choice > 0) {
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.println("00. Exit\n01. Push An Element To Stack\t02. Pop An Element From Stack\t03. Peek Element Of Stack\n04. Is Stack Empty?\t\t05. Print The Stack\t\t06. Clear Stack");
            System.out.print("Enter Choice: ");
            choice = Integer.parseInt(sc.next());
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            switch (choice) {
                case 1:
                    System.out.print("Enter An Element To Push: ");
                    Object ela = sc.next();
                    vstack.push(ela);
                    break;
                case 2:
                	System.out.println("An Element Has Been Popped From Stack: " + vstack.pop());
                    break;
                case 3:
                	System.out.println("Peek Element Of Stack: " + vstack.peek());
                    break;
                case 4:
                	System.out.println("Is Stack Empty: " + vstack.isEmpty());
                    break;
                case 5:
                    System.out.println(Arrays.toString(vstack.toArray()));
                    break;
                case 6:
                	vstack.clear();
                	System.out.println("Stack Cleared");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("An Invalid Entry... Please Try Again...");
                    break;
            }
        }
	}
}
