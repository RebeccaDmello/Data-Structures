package EvaluateInfix;

interface StackInterface<T> {

	public T push(T newElm);
	public T pop();
	public T peek();
	public boolean isEmpty();
	public void clear();
	public T[] toArray();
}
