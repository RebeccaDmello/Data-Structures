package LinkedList;
public class LList<T> implements ListInterface<T> {
    //Define Head of the list
    Node head;
    int count = 1;

    @Override
    public void add(T newEntry) {
    	//FOR ADDING ELEMENT
        Node newNode = new Node(newEntry);
        
        //IF LIST IS EMPTY THEN ADD NEWNODE TO HEAD ELSE ADD AT THE END => DISPLAY SUCCESS MESSAGE AND INCREMENT COUNTER
        if(count == 1) {
        	head = newNode;
        }
        else {
            Node tail = head;
            while(tail.getNext() != null) {
            	tail = tail.getNext();
            }
            tail.setNext(newNode);
        }
        System.out.println("An Element Added To The List...");
        count++;
    }

    @Override
    public void add(int newPosition, T newEntry) {
        if(newPosition >= 1 && newPosition < count-1) {
        	 int index = 1;
             Node iNode = new Node(newEntry);
             Node temp = head;
             if(newPosition == 1 && head != null) {
            	temp.setNext(head);
             	head = iNode;
             	count++;
             }
             else if (head != null) {
                 while (index != newPosition - 1) {
                	 temp = temp.getNext();
                     index++;
                 }
                 iNode.setNext(temp.getNext());
                 temp.setNext(iNode);
                 count++;
             }
             System.out.println("An Element Added To The List At " + newPosition + " Position...");
        } else {
            throw new ArrayIndexOutOfBoundsException("Illegal Location Is Given To Add An Element...");
        }
    }

    @Override
    public T remove(int givenPosition) {
        if(givenPosition >= 1 && givenPosition < count) {
            int index = 1;
            T removed = null;
            Node temp = head;
            if(givenPosition == 1 && head != null) {
            	removed = (T) head.getData();
            	head = head.getNext();
            	count--;
            }
            else if (head != null) {
                while (index != givenPosition - 1) {
                	if(temp.getNext() == null) return null;
                	temp = temp.getNext();
                    index++;
                }
                removed = (T) temp.getNext().getData();
                temp.setNext(temp.getNext().getNext());
                count--;
            }
            return removed;
        } else {
            throw new ArrayIndexOutOfBoundsException("Illegal Location Is Given To Remove An Element...");
        }      
    }

    @Override
    public void clear() {
    	//SET HEAD OF THE LIST AS NULL THIS WILL FLUSH ALL THE DATA PRESENT IN THE LIST, DISPALY APPROPRIATE MESSAGE
        head = null;
        count = 1;
        System.out.println("The List Has Been Cleared...");
    }

    @Override
    public T replace(int givenPosition, T newEntry) {
        if(givenPosition >= 1 && givenPosition < count) {
            int index = 1;
            T replaced = null;
            Node rNode;
            if (head != null) {
            	rNode = head;
                while (index != givenPosition) {
                    rNode = rNode.getNext();
                    index++;
                }
                replaced = (T) rNode.getData();
                rNode.setData(newEntry);
            }
            return replaced;
        } else {
            throw new ArrayIndexOutOfBoundsException("Illegal Location Is Given To Replace An Element...");
        }
    }

    public T getEntry(int givenPosition) {
        if(givenPosition >= 1 && givenPosition <= count) {
            int index = 1;
            Node fNode = null;            
            if (head != null) {
                fNode = head;
                while (index != givenPosition) {
                    fNode = fNode.getNext();
                    index++;
                }
            }
            return (T) fNode.getData();
        } else {
            throw new ArrayIndexOutOfBoundsException("Illegal Location Is Given To Search An Element...");
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T[] toArray() {
        int arrIndex = 0;
        Node temp = head;
        T[] result = (T[]) new Object[count - 1];
        //System.out.println("Linked List: ");
        while(temp.getNext() != null) {
            result[arrIndex] = (T) temp.getData();
            temp = temp.getNext();
            arrIndex++;
        }
        return result;
    }

    @Override
    public boolean contains(T anEntry) {
        Node temp;
        if(head != null) {
        	temp = head;
        	while(temp.getNext() != null) {
        		if(temp.getData() == anEntry)
        			return true;
        		else
        			temp = temp.getNext();
            }
        }
        return false;
    }
    
    
//    public boolean contains(int elm){
//		Node temp = head;
//		if(head !=null){
//			while(temp.getNext()!=null){
//				if(temp.getData() == elm){
//					return true;
//				}
//				else{
//					temp = temp.getNext();
//				}
//			}
//		}
//		return false;    
//	}

    @Override
    public int getLength() {
        return count - 1;
    }

    @Override
    public boolean isEmpty() {
        return count == 1;
    }
}