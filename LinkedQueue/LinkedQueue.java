package LinkedQueue;
import java.util.Arrays;

public class LinkedQueue<T> implements QueueInterface<T>{

	Node head;
	int count = 1;

	@Override
	public void enqueue(Object newEntry) {
		Node iNode = new Node(newEntry);
		if(count==1) {
			head = iNode;
		}	
		else {
			Node tail = head;
			while(tail.getNext() != null) {
				tail = tail.getNext();
			}
			tail.setNext(iNode);
		}
		count++;
	}

	@Override
	public T dequeue() {
		T removed = (T)head.getData();
		head = head.getNext();
		count--;
		return removed;
	}

	@Override
	public T getFront() {
		return (T)head.getData();
	}

	@Override
	public boolean isEmpty() {
		return count==1;
	}

	@Override
	public void clear() {
		head = null;
		count = 1;
	}

	@Override
	public T[] toArray() {
		Object[] tempArry = new Object[count - 1];
		Node tail = head;
		int i = 0;
		while(tail != null) {
			tempArry[i] = (T) tail.getData();
			tail = tail.getNext();
			i++;
		}
		return (T[]) tempArry;
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		QueueInterface<Object> myQue = new LinkedQueue<Object>();
		myQue.enqueue("Rebecca");
		myQue.enqueue("Jess");
		myQue.enqueue("Jill");
		myQue.enqueue("Jane");
		myQue.enqueue("Joe");

		System.out.println(Arrays.toString(myQue.toArray()));
		String front = (String)myQue.getFront(); // returns "Jim"
		System.out.println(front + " is at the front of the queue.");
		front = (String)myQue.dequeue(); // removes and returns "Jim"
		System.out.println(front + " is removed from the queue.");
		myQue.enqueue("Jerry");
		System.out.println(Arrays.toString(myQue.toArray()));
		front = (String)myQue.getFront(); // returns "Jess"
		System.out.println(front + " is at the front of the queue.");
		front = (String)myQue.dequeue(); // removes and returns "Jess"
		System.out.println(Arrays.toString(myQue.toArray()));
		System.out.println(front + " is removed from the queue.");
		System.out.println(Arrays.toString(myQue.toArray()));
	}
	
}
