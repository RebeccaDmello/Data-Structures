package GenericSearchSort;
public class BinSearcyGen{
	public static void main(String args[]) {
		Integer a[] = {9,3,6,1,2,4,10};
		int st = 0,lst = a.length-1;
		int find = 2;
		//sort it first
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] >a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		binSearchGen(a,st,lst,find);
	}
	public static <T extends Comparable<T>> void binSearchGen(T[] a, int st, int lst, T find) {
		int mid = (st+lst)/2;
		if(st > lst)
			System.out.println("Invalid");
		else if(a[mid].compareTo(find) == 0)
			System.out.println("Found");
		else if(a[mid].compareTo(find) == 1)
			binSearchGen(a,st,mid-1,find);
		else if(a[mid].compareTo(find) == -1)
			binSearchGen(a,mid+1,lst,find);
	}
}