package VectorStack;

interface StackInterface<T> {
	public void push(T newElm);
	public T pop();
	public T peek();
	public void clear();
	public boolean isEmpty();
	public T[] toArray();
}
