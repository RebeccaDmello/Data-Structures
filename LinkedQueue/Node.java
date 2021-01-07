package LinkedQueue;

//Class Used to Create Elements of The Linked List
public class Node<T> {
  Object data;
  Node<T> prev;
  Node<T> next;

  // Constructor to create a new node / Next is by default initialized as null
  public Node(Object d) {
      data = d;
      prev = null;
      next = null;
  }

  public Object getData() {
      return data;
  }

  public void setData(Object dataVal) {
      data = dataVal;
  }

  public Node<T> getPrev() { return prev; }

  public Node<T> getNext() {
      return next;
  }

  public void setPrev(Node<T> prvVal) {
      prev = prvVal;
  }

  public void setNext(Node<T> nxtVal) {
      next = nxtVal;
  }
}