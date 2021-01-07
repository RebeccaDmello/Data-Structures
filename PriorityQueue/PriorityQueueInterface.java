package PriorityQueue;

interface PriorityQueueInterface<T> extends Comparable<T> {
	public boolean add(T newElm);
	public T remove();	
	public T poll();
	public boolean offer(T newElm);
	public T element();
	public T peek();
	public boolean isEmpty();
	public int getSize();
	public void clear();
}
