package InfixToPostFix;

interface StackInterface<T> {
	public boolean push(T newElm);
	public T peek();
	public T pop();
	public void clear();
	public boolean isEmpty();
	public T[] toArray();
}
