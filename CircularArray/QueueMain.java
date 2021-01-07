package CircularArray;

import java.util.Arrays;

public class QueueMain<T> {
	public static void main(String args[]) {
		QueueInterface qi = new ArrayQueue();
		qi.enque("Rebecca");
		qi.enque("Papa");
		qi.enque("dopii");
//	
		qi.toArray();
		
		qi.enque("study");
		qi.toArray();
		
		qi.enque("work");
		qi.toArray();
		
				
		qi.enque("work");
		qi.toArray();
		qi.enque("work");
		qi.toArray();
		
		System.out.println("The Elment which is removed from front is "+qi.deque());
		qi.toArray();
		
		
		System.out.println("The Elment which is removed from front is "+qi.deque());
		qi.toArray();
//		System.out.println("Elment in front is "+qi.getFront());
//		
	}
}
