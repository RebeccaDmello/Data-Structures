package EvaluatePostfix;

public class StackMethods<T> implements StackInterface<T> {

	Object a[] = new Object[20];
	int count = 0;
	
	public boolean push(T newElem) {
		a[count] = newElem;
		count++;
		return true;
	}
	
	public T peek() {
		return (T)a[count-1];
	}
	
	public T pop() {
		Object temp = a[count-1];
		a[count-1] = null;
		count--;
		return (T)temp;
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public void clear() {
		a = new Object[count];
		count=0;
	}
	
	public T[] toArray() {
		Object tempArry[] = new Object[20];
		for(int i = 0; i < count; i++) {
			tempArry[i] = a[i];
		}
		return (T[])tempArry;
	}
}
