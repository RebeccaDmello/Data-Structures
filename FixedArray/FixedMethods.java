package FixedArray;

public class FixedMethods<T> implements FixedInterface<T>{

	Object a[] = new Object[20];
	int count = 0;
	
	@Override
	public boolean add(T insElm) {
		Object temp = a[count];
		a[count] = insElm;
		count++;
		return true;
	}

	@Override
	public boolean add(int pos, int insElm) {
		for(int i = pos; i<count; i++) {
			int temp = insElm;
			insElm = (int) a[i];
			a[i] = temp;
		}
		a[count] = insElm;
		count++;
		return true;
	}

	@Override
	public T remove(int pos) {
		// TODO Auto-generated method stub
		T temp = (T) a[pos];
		for(int i=pos; i< count;i++) {
			a[i] = a[i+1];
		}
		count--;
		return temp;
	}

	@Override
	public T replace(int pos, T insElm) {
		Object temp = a[pos];
		a[pos] = insElm;
		return (T)temp;
	}

	@Override
	public boolean contains(T insElm) {
		for(int i = 0; i < count; i++) {
			if(a[i] == insElm) {
				System.out.println("Element is present");
				return true;
			}
		}
		return false;
	}

	@Override
	public T getElm(int pos) {
		// TODO Auto-generated method stub
		T temp = (T)a[pos];
		return temp;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		Object tempArry[] = new Object[count];
		for(int i=0; i<count; i++) {
			tempArry[i] = a[i];
		}
		return (T[])tempArry;
	}

	@Override
	public boolean clear() {
		a = new Object[count];
		count = 0;
		return true;
	}

	@Override
	public boolean isEmpty() {
		return count==0;
	}

}
