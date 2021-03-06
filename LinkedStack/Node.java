package LinkedStack;
public class Node<T> {
	Object data;
	Node next;
	
	Node(Object data){
		this.data = data;
		next = null;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
}