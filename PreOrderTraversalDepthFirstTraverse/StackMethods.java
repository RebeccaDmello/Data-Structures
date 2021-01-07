package PreOrderTraversalDepthFirstTraverse;

public class StackMethods<T> implements StackInterface<T> {

	Object a[] = new Object[5];
	int count = 0;
	
	public boolean push(T insElm) {
		a[count] = insElm;
		count++;
		return true;
	}
	
	public T peek() {
		return (T)a[count-1];
	}
	
	public T pop() {
		T temp = (T)a[count-1];
		a[count-1]=null;
		count--;
		return temp;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public void clear() {
		a = new Object[count];
		count = 0;
	}
	
//	public T[] toArray() {
//		Object[] tempArry = new Object[5];
//		for(int i=0; i<count;i++) {
//			tempArry[i] = a[i];
//		}
//		return (T[])tempArry;
//	}
	
}
