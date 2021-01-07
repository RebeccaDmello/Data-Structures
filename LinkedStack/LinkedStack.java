package LinkedStack;
import java.util.*;

public class LinkedStack<T> implements StackInterface<T>{
	Node head = null;
	int count = 1;
	
	@Override
	public void push(T newEntry) {
		Node newNode = new Node(newEntry);
		newNode.setNext(head);
		head = newNode;
		count++;
	}
	
	@Override
	public T peek() {
		T peekData = null;
		if(head != null)
			peekData = (T) head.getData();
		return peekData;
	}

	@Override
	public T pop() {
		T popData = peek();
		if(head != null)
			head = head.getNext();
		count--;
		return popData;
	}

	@Override
	public boolean isEmpty() {
		return count == 1;
	}

	@Override
	public void clear() {
		head = null;
		count = 1;
	}

	@Override
	public T[] toArray() {
		Object[] tempArr = new Object[count - 1];
		Node temp = head;
		int i = 0;
		while(temp != null){
			tempArr[i] = temp.getData();
			temp = temp.getNext();
			i++;		
		}
		return (T[]) tempArr;
	}
	
	public static void main(String[] args) {
		LinkedStack<Object> lstack = new LinkedStack<>();
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
                    lstack.push(ela);
                    break;
                case 2:
                	System.out.println("An Element Has Been Popped From Stack: " + lstack.pop());
                    break;
                case 3:
                	System.out.println("Peek Element Of Stack: " + lstack.peek());
                    break;
                case 4:
                	System.out.println("Is Stack Empty: " + lstack.isEmpty());
                    break;
                case 5:
                    System.out.println(Arrays.toString(lstack.toArray()));
                    break;
                case 6:
                	lstack.clear();
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
