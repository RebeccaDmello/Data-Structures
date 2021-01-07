package SimpleQueue;

public class QueueMethods<T> implements QueueInterface<T>{
	Object a[] = new Object[20];
	int count = 0;
	
	
	@Override
	public boolean enque(T newElm) {
		// TODO Auto-generated method stub
		Object temp = a[count];
		a[count] = newElm;
		count++;
		return true;
	}

	@Override
	public T deque() {
		// TODO Auto-generated method stub
		Object temp = a[0];
		for(int i = 0; i<count-1;i++) {
			a[i] = a[i+1];
		}
		a[count-1] = null;
		count--;
		return (T)temp;
	}

	@Override
	public T getFront() {
		// TODO Auto-generated method stub
		return (T)a[0];
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
		return count == 0;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		Object tempArry[] = new Object[count];
		for(int i=0; i< count;i++) {
			tempArry[i] = a[i];
		}
		return (T[]) tempArry;
	}

}
