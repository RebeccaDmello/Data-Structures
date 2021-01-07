package LevelOrderBreathFirstTraversalQueue;

interface QueueInterface<T> {
	public boolean enque(T newElm);
	public T deque();
	public T getFront();
	public void clear();
	public boolean isEmpty();
	public T[] toArray();
}
