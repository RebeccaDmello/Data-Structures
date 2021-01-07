package LinkedDeQue;
import java.util.*;
public class LinkedDeque<T> implements DeQueInterface<T> {
	Node head, tail;
	int count = 1;
	
	@Override
	public void addToFront(T newEntry) {
		Node newNode = new Node(newEntry);
		if(head == null) {
			head = tail = newNode;
		} else {
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;
		}
		count++;
	}

	@Override
	public void addToBack(T newEntry) {
		Node newNode = new Node(newEntry);
		if(head == null) {
			head = tail = newNode;
		} else {
			newNode.setPrev(tail);
			tail.setNext(newNode);
			tail = newNode;
		}
		count++;
	}

	@Override
	public T removeFront() {
		T removedF = null;
		if (head == null) return null;
			removedF = (T) head.getData();
			head = head.getNext();
			head.setPrev(null);
		count--;
		return removedF;
	}

	@Override
	public T removeBack() {
		T removedE = null;
		if (head == null) return null;
			removedE = (T) tail.getData();
			tail = tail.getPrev();
			tail.setNext(null);
		count--;
		return removedE;
	}

	@Override
	public T getFront() {
		return (T) head.getData();
	}

	@Override
	public T getBack() {
		return (T) tail.getData();
	}

	@Override
	public boolean isEmpty() {
		return count == 1;
	}

	@Override
	public void clear() {
		head = tail = null;
		count = 1;
	}
	
	public T[] toArray() {
		Object temp[] = new Object[count -1];
		Node tNode = head;
		int i = 0;
		while(tNode != null) {
			temp[i] = tNode.getData();
			tNode = tNode.getNext();
			i++;
		}
		return (T[]) temp;
	}
	
	public static void main(String[] args) {
		DeQueInterface<Object> dq = new LinkedDeque<>();
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while(choice > 0) {
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.println("00. Exit\n01. Add An Element To Front Of The Queue\t02. Add An Element To Back Of The Queue\n03. Remove An Element From Front Of The Queue\t04. Remove An Element From Back Of The Queue\n05. Get First Element In The Queue\t\t06. Get Last Element In The Queue\n07. Is Queue Empty?\t\t\t\t08. Print Queue Elements\n09. Clear The Queue");
            System.out.print("Enter Choice: ");
            choice = Integer.parseInt(sc.next());
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            switch (choice) {
                case 1:
                    System.out.print("Enter An Element To Add Front Of The Queue: ");
                    Object dqF = sc.next();
                    dq.addToFront(dqF);
                    break;
                case 2:
                	System.out.print("Enter An Element To Add Back Of The Queue: ");
                    Object dqB = sc.next();
                    dq.addToBack(dqB);
                    break;
                case 3:
                	System.out.println("An Element Has Been Removed From Front Of The Queue: " + dq.removeFront());
                    break;
                case 4:
                	System.out.println("An Element Has Been Removed From Back Of The Queue: " + dq.removeBack());
                    break;
                case 5:
                	System.out.println("An Element At Front Of The Queue: " + dq.getFront());
                    break;
                case 6:
                    System.out.println("An Element At Back Of The Queue: " + dq.getBack());
                    break;
                case 7:
                	System.out.println("Is The Queue Empty?: " + dq.isEmpty());
                    break;
                case 8:
                    System.out.println(Arrays.toString(dq.toArray()));
                    break;
                case 9:
                	dq.clear();
                	System.out.println("The Queue Got Cleared");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("An Invalid Entry... Please Try Again...");
                    break;
            }
        }
	}
}
