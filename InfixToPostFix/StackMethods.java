package InfixToPostFix;

public class StackMethods<T> implements StackInterface<T>{
	Object a[] = new Object[20];
	int count = 0;

	public boolean push(T newElm) {
		a[count] = newElm;
		count++;
		return true;
	}

	public T peek() {
		return (T)a[count-1];
	}

	public T pop() {
		Object temp = a[count-1];
		a[count-1]=null;
		count--;
		return (T)temp;
	}

	public void clear() {
		a =  new Object[count];
		count = 0;	
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count == 0;
	}


	public T[] toArray() {
		Character temp[]= new Character[count];
		for(int i=0 ; i<count ; i++) {
			temp[i]=(Character) a[i];
		}
		return (T[])temp;
	}

}
