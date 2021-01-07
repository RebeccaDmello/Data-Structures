package RecursiveExample;
import java.util.*; 
public class MinMax {
	 public static void main(String args[]) 
	    { 
	        int a[] = {1, 4, 45, 6, -50, 10, 2}; 
	        System.out.println(findMin(a));
	    }
	 public static int findMin(int a[]) {
		 for(int i=0; i<a.length;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]>a[j]) {
					 int temp = a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
			 
		 }
		 return a[0];
	 }
}
