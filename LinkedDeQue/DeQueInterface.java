package LinkedDeQue;

interface DeQueInterface<T> {
	public void addToFront(T newEntry);		//Adds a new entry to the front of the deque.
	public void addToBack(T newEntry);		//Adds a new entry to the back of the deque.
	public T removeFront();					//Removes and returns the front entry of the deque.
	public T removeBack();					//Removes and returns the back entry of the deque.
	public T getFront();					//Retrieves the front entry of the deque.
	public T getBack();						//Retrieves the back entry of the deque.
	public boolean isEmpty();				//Sees whether the deque is empty.
	public void clear();					//Removes all enteries from the deque.
	public T[] toArray();
}
