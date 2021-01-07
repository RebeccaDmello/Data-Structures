package FixedArray;

interface FixedInterface<T> {
	public boolean add(T insElm);
	public boolean add(int pos, int insElm);
	public T remove(int pos);
	public T replace(int pos, T insElm);
	public boolean contains(T insElm);
	public T getElm(int pos);
	public T[] toArray();
	public boolean clear();
	public boolean isEmpty();
}
