package HeapSort;
import java.util.Arrays;
import java.util.Scanner;

public class MaxHeapReheap {

	static class MaxHeap<T> {
        private T[] heap;
        private int size=0;
        private int maxsize;
        private int lastIndex;
               
        public MaxHeap(T[] entries)
        {
        	@SuppressWarnings("unchecked")
        	T[] tempHeap = (T[]) new Comparable[entries.length + 1];
        	heap = tempHeap;
        	lastIndex = entries.length;
        	// copy given array to data field
        	for (int index = 0; index < entries.length; index++) {
        		heap[index + 1] = entries[index];
        		size++;
        	}
        	// create heap
//        	for (int rootIndex = lastIndex / 2 - 1; rootIndex >= 0; rootIndex--)
//        		reheap(heap, rootIndex, lastIndex);
        	heapSort(heap, size);
        }
    
        private  <T extends Comparable<? super T>> void reheap(Object[] heap, int rootIndex, int lastIndex)
        {
        	boolean done = false;
        	T orphan = (T) heap[rootIndex];
        	int leftChildIndex = 2 * rootIndex + 1;

        	while (!done && (leftChildIndex <= lastIndex))
        	{
	        	int largerChildIndex = leftChildIndex;
	        	int rightChildIndex = leftChildIndex + 1;
	        	if ( (rightChildIndex <= lastIndex) && ((T) heap[rightChildIndex]).compareTo((T) heap[largerChildIndex]) > 0)
        	        	largerChildIndex = rightChildIndex;
	        	if (orphan.compareTo((T) heap[largerChildIndex]) < 0) {
		        	heap[rootIndex] = heap[largerChildIndex];
		        	rootIndex = largerChildIndex;
		        	leftChildIndex = 2 * rootIndex + 1;
		        	System.out.println(Arrays.toString(heap));
		        } else
		        	done = true;
        	} // end while
        	heap[rootIndex] = orphan;

//	        boolean done = false;
//	        T orphan = heap[rootIndex];
//	        int leftChildIndex = 2 * rootIndex;
//	        while (!done && (leftChildIndex <= lastIndex)) {
//		        int largerChildIndex = leftChildIndex;
//		        int rightChildIndex = leftChildIndex + 1;
//		        if ((rightChildIndex <= lastIndex) && ((Integer)heap[rightChildIndex]).compareTo((Integer)heap[largerChildIndex]) > 0) {
//		        	largerChildIndex = rightChildIndex;
//		        	System.out.println("Changed Focus from " + (Integer)heap[leftChildIndex] + " to " + (Integer)heap[rightChildIndex]);
//		        }
//		        if (((Integer)orphan).compareTo((Integer)heap[largerChildIndex]) < 0) {
//			        heap[rootIndex] = heap[largerChildIndex];
//			        rootIndex = largerChildIndex;
//			        leftChildIndex = 2 * rootIndex;
//			        System.out.println("Swap " + Arrays.toString(heap));
//		        } else {
//		        	done = true;
//		        }
//	        }
//	        heap[rootIndex] = orphan;
//	        System.out.println("After" + Arrays.toString(heap) + "\nBreak WHILE\n");
        }
        
        public <T extends Comparable<? super T>> void heapSort(Object[] array, int n) {
        	// create first heap
	        for (int rootIndex = n / 2 - 1; rootIndex >= 0; rootIndex--)
	        	reheap(array, rootIndex, n - 1);
//	        int leftChildIndex = 2 * rootIndex + 1;
//	        leftChildIndex = 2 * rootIndex + 1;
	        swap(array, 0, n - 1);
	        for (int lastIndex = n - 2; lastIndex > 0; lastIndex--) {
		        reheap(array, 0, lastIndex);
		        swap(array, 0, lastIndex);
	        } // end for
        }

		private void swap(Object[] array, int fpos, int spos) {
			// TODO Auto-generated method stub
			T tmp;
            tmp = (T) array[fpos];
            array[fpos] = array[spos];
            array[spos] = tmp;
			
		}
		
		public void toArray() {
			System.out.println(Arrays.toString(heap));
		}

    }
    public static <T> void main(String[] arg)
    {
    	//null, 100, 90, 60, 70, 80, 20, 50, 10, 40, 30
    	//null, 100, 90, 70, 80, 50, 60, 30, 10, 40, 20
    	System.out.println("Array Elements\nInit0[null, 10, 20, 30, 40, 50, 60]\n");
    	Object[] rehp = {10, 20, 30, 40, 50, 60};
    	MaxHeap maxReHeap = new MaxHeap(rehp);
       maxReHeap.toArray();
    }
 
} 