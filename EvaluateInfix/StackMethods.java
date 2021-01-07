package EvaluateInfix;

public class StackMethods<T> implements StackInterface<T>{

	Object a[] = new Object[100];
	int count = 0;
	
	public T push(T newElm) {
		T temp = (T)a[count];
		a[count] = newElm;
		count++;
		return temp;
	}
	
	public T pop() {
		T temp = (T)a[count-1];
		a[count-1] = null;
		count--;
		return (T)temp;
	}
	
	public T peek() {
		return (T)a[count-1];
	}
	
	public void clear() {
		a = new Object[count];
		count = 0;
	}
	
	public T[] toArray() {
		Object[] temp = new Object[100];
		for(int i = 0; i < count; i++) {
			temp[i] = a[i];
		}
		return (T[])temp;
	}
	
	public boolean isEmpty() {
			return count == 0;
	}
	
}
