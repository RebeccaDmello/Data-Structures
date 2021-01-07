package PriorityQueue;

import java.util.NoSuchElementException;

public class PriorityMethods<T> implements PriorityQueueInterface<T>{

	T[] pq;
	int count = 0;
	int size = 11;
	
	PriorityMethods(){
		pq = (T[]) new Object[size];
	}
	
	PriorityMethods(int initialCapacity){
		int size = initialCapacity;
		pq = (T[]) new Object[size];
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean add(T newElm) {
		if(count == pq.length) {
			throw new ArrayIndexOutOfBoundsException("Array index out of bound");
		}
		else {
			pq[count] = newElm;
			count++;
			return true;
		}	
	}

	@Override
	public T remove() {
		if(count == 0) 
			throw new NoSuchElementException("No Element");
		else {
			T temp = pq[0];
			for(int i = 0; i < count; i++)
				pq[i] = pq[i+1];
			count--;
			return temp;
		}
	}

	@Override
	public T poll() {
		if(count == 0)
			return null;
		else {
			T temp = pq[0];
			for(int i = 0; i < count ; i++)
				pq[i] = pq[i+1];
			count--;
			return temp;
		}
	}

	@Override
	public boolean offer(T newElm) {
		if(count == pq.length) {
			return false;
		}
		else {
			pq[count] = newElm;
			count++;
			return true;
		}		
	}

	@Override
	public T element() {
		if(count == 0) 
			throw new NoSuchElementException("No Element");
		else {
			return pq[0];
		}
	}

	@Override
	public T peek() {
		if(count == 0) 
			return null;
		else {
			return pq[0];
		}
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public int getSize() {
		return count - 1;
	}

	@Override
	public void clear() {
		pq = (T[]) new Object[size];
		count = 0;
	}
}
