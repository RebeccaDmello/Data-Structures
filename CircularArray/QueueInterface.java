package CircularArray;

interface QueueInterface<T> {
	public void enque(T newElm);
	public T deque();
	public T getFront();
	public void clear();
	public boolean isEmpty();
	public void toArray();
}
