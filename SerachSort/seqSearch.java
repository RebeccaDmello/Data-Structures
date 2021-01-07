package SerachSort;

public class seqSearch {
//Sequential search accepts unsorted array
	public static void main(String args[]) {
		int[] a = {5,8,10,15,13,200,222,246,2,30,31,34,40};
		int find = 40;
		int st = 0; 
		int lst = a.length - 1;
		sequenSearch(a,find, st, lst);
	}
	
	public static void sequenSearch(int[] a,int find, int st, int lst) {
		if(st > lst) {
			System.out.println("Element not found or Array is empty");
		}
		else if(a[st] == find) {
			System.out.println("Eleent Found at location "+st);
		}
		else{
			sequenSearch(a, find, st + 1, lst);
		}
	}
}
