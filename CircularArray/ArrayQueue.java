/**
 * 
 */
package CircularArray;

import java.util.Arrays;

/**
 * @author rebecca
 *
 */
public class ArrayQueue<T> implements QueueInterface<T>{
	private int frontIndex;
	private int backIndex;
	private static final int DEFAULT_INITIAL_CAPACITY = 4;

	Object a[];
	int count = 0;
	
	public ArrayQueue() {
		this(DEFAULT_INITIAL_CAPACITY);
	}

	public ArrayQueue(int initialCapacity) {
		// TODO Auto-generated constructor stub
		T[] tempQueue = (T[])new Object[initialCapacity + 1];
		a = tempQueue;
		frontIndex = 0;
		backIndex = initialCapacity;
	}
	
	@Override
	public void enque(T newEntry)
	{
		ensureCapacity();
		backIndex = (backIndex + 1) % a.length;
		a[backIndex] = newEntry;
		count++;
	} 

	public T deque()
	{
		T front = null;
		if (!isEmpty())
		{
			front = (T) a[frontIndex];
			a[frontIndex] = null;
			frontIndex = (frontIndex + 1) % a.length;
		}
		count--;
		return front;
	} 

	private void ensureCapacity()
	{
		if (frontIndex == ((backIndex + 2) % a.length)) 
		{ 
			T[] oldQueue = (T[]) a;
			int oldSize = oldQueue.length;
			T[] tempQueue = (T[]) new Object[2 * oldSize];
			a = tempQueue;
			for (int index = 0; index < oldSize - 1; index++)
			{
				a[index] = oldQueue[frontIndex];
				frontIndex = (frontIndex + 1) % oldSize;
			}
			frontIndex = 0;
			backIndex = oldSize - 2;
		} 
	} 
	
	
	public T getFront()
	{
		T front = null;
		if (!isEmpty())
			front = (T) a[frontIndex];
		return front;
	} 

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		a = (T[]) new Object[count];
		count = 0;
	}

	@Override
	public boolean isEmpty()
	{
		return frontIndex == ((backIndex + 1) % a.length);
	}

	@Override
	public void toArray() {
		// TODO Auto-generated method stub
		Object tempArry[] = new Object[count];
//		for(int i= 0; i< count;i++) {
		
		for(int i = frontIndex; i != backIndex; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(frontIndex + " | | " + backIndex);
//		System.out.println("-----------------------------------------");
//		Object tempArry2[] = new Object[backIndex - frontIndex];
//		int k = 0;
//		for(int j=frontIndex; j< backIndex;j++) {
//			tempArry2[k] = a[j];
//			k++;
//		}
//		System.out.println(frontIndex + " | | " + backIndex);
//		System.out.println(Arrays.toString(tempArry2));
		//return (T[]) tempArry;
	}

	
}
