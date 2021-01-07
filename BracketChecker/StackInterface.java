package BracketChecker;

interface StackInterface<T> {
	public boolean push(T insElm);
	public T peek();
	public T pop();
	public void clear();
	public boolean isEmpty();
	public T[] toArray();
}
