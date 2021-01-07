package EvaluatePostfix;

interface StackInterface<T> {
	public boolean push(T newEntry);
	public T pop();
	public T peek();
	public void clear();
	public T[] toArray();
	public boolean isEmpty();
}
