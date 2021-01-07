package GenericSearchSort;

public class SeqSearchGen {
	public static  void main(String args[]) {
		Integer[] a = {2,5,8,3,88,1};
		int st = 0, lst = a.length-1;
		Integer find = 1;
		seqSearchGen(a,st,lst,find);
	}
	public static <T extends Comparable<T>> void seqSearchGen(T[] a,int st, int lst, T find) {
		if(st > lst)
			System.out.println("Invalid or Empty");
		else if(a[st] == find) {
			System.out.println("Element Found " + st);	
		}
		else {
			seqSearchGen(a,st+1,lst,find);
		}
	}
}
