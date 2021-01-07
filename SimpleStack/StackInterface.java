package SimpleStack;

interface StackInterface<T> {
	public boolean push(T insElm);
	public T pop();
	public T peek();
	public void clear();
	public boolean isEmpty();
	public T[] toArray();
}
