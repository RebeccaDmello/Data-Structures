package SerachSort;

public class RecQ4 {

	public static void main(String args[]) {
		String input = "Rebecca";
		char[] in = input.toCharArray();
		int begin=0;
		int end=in.length-1;
		
		dispRev(in, begin, end);
		for(int i=0; i<in.length;i++) {
			System.out.println(in[i]);
		}
	}
	public static void dispRev(char[] in, int begin, int end) {  
				char temp;
		        temp = in[begin];
		        in[begin]=in[end];
		        in[end] = temp;
		        --end;
		        ++begin;
		        if(end!=begin)
		        	dispRev(in, begin, end);
	}
}
