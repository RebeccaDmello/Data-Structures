package BracketChecker;

public class StackMethods<T> implements StackInterface<T> {

	Object a[] = new Object[20];
	int count = 0;
	
	@Override
	public boolean push(T insElm) {
		// TODO Auto-generated method stub
		a[count] = insElm;
		count++;
		return true;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		Object temp = a[count-1];
		return (T)temp;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		Object temp = a[count-1];
		a[count-1] = null;
		count--;
		return (T)temp;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		a = new Object[count];
		count = 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count==0;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		Object tempArry[] = new Object[count];
		for(int i = 0; i< count; i++) {
			tempArry[i] = a[i];
		}
		return (T[])tempArry;
	}

}
