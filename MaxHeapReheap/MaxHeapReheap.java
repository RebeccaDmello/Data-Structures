package MaxHeapReheap;
import java.util.Arrays;
import java.util.Scanner;

public class MaxHeapReheap {

	static class MaxHeap<T> {
        private T[] heap;
        private int size;
        private int maxsize;
        private int lastIndex;
        
 
        public MaxHeap(int size) {
            this.maxsize = size;
            this.size = 0;
            heap = (T[]) new Integer[this.maxsize + 1];          
        }
        
        public MaxHeap(T[] entries)
        {
	        heap = (T[]) new Integer[entries.length + 1];  
	        lastIndex = entries.length;
	        
	        // copy given array to data field
	        for (int index = 0; index < entries.length; index++) {
	        	heap[index + 1] = (T) entries[index];
	        	size++;
	        }
	        
	        // create heap
	        for (int rootIndex = lastIndex / 2; rootIndex > 0; rootIndex--) {
	        	System.out.println("RootIndex: " + rootIndex + " i.e. " + heap[rootIndex]);
	        	reheap(rootIndex);
	        	System.out.println("Returned To FOR");
	        }
        }
        
        public boolean isEmpty() {
        	return size == 0;
        }
        
        public T removeMax()
        {
	        T root = null;
	        if (isEmpty() == false) {
	        	root = heap[1]; // return value
		        heap[1] = heap[lastIndex]; // form a semiheap
		        System.out.println("Rermove " + Arrays.toString(heap));
		        lastIndex--; // decrease size
		        reheap(1); // transform to a heap
		        size--;
	        } // end if
	        return root;
        }
        
        private void reheap(int rootIndex)
        {
	        boolean done = false;
	        T orphan = heap[rootIndex];
	        int leftChildIndex = 2 * rootIndex;
	        while (!done && (leftChildIndex <= lastIndex)) {
		        int largerChildIndex = leftChildIndex;
		        int rightChildIndex = leftChildIndex + 1;
		        if ((rightChildIndex <= lastIndex) && ((Integer)heap[rightChildIndex]).compareTo((Integer)heap[largerChildIndex]) > 0) {
		        	largerChildIndex = rightChildIndex;
		        	System.out.println("Changed Focus from " + (Integer)heap[leftChildIndex] + " to " + (Integer)heap[rightChildIndex]);
		        }
		        if (((Integer)orphan).compareTo((Integer)heap[largerChildIndex]) < 0) {
			        heap[rootIndex] = heap[largerChildIndex];
			        rootIndex = largerChildIndex;
			        leftChildIndex = 2 * rootIndex;
			        System.out.println("Swap " + Arrays.toString(heap));
		        } else {
		        	done = true;
		        }
	        }
	        heap[rootIndex] = orphan;
	        System.out.println("After" + Arrays.toString(heap) + "\nBreak WHILE\n");
        }
    }
    public static <T> void main(String[] arg)
    {
    	//null, 100, 90, 60, 70, 80, 20, 50, 10, 40, 30
    	//null, 100, 90, 70, 80, 50, 60, 30, 10, 40, 20
    	System.out.println("Array Elements\nInit0[null, 10, 20, 30, 40, 50, 60,70]\n");
    	Integer[] rehp = {10, 20, 30, 40, 50, 60, 70};
    	MaxHeap maxReHeap = new MaxHeap(rehp);
        Integer ch = 1;
        Scanner sc = new Scanner(System.in);
        while(ch != 0) {
	        System.out.println("0. To Exit\n1. Remove Max");
	        System.out.print("Choice: ");
	        ch = Integer.parseInt(sc.next());
	        switch(ch) {
	        case 0:
	        	break;
	        case 1:
	        	System.out.println("Removed max is " + maxReHeap.removeMax());
	        	break;
	        default:
	        	System.out.println("Invalid Entry");
	        	break;
	        }
        }
    }
 
} 