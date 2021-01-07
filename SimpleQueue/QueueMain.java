package SimpleQueue;

import java.util.Arrays;

public class QueueMain<T> {
	public static void main(String args[]) {
		QueueInterface<Object> qi = new QueueMethods<>();
		qi.enque("Rebecca");
		qi.enque("Ku");
		qi.enque("Pipoo");
		qi.enque("Papa");
		System.out.println("Elements before any operation are "+Arrays.toString(qi.toArray()));
		System.out.println("The Elment which is removed from front is "+qi.deque());
		System.out.println("Elment in front is "+qi.getFront());
		
	}
}
