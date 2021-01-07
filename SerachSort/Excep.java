package SerachSort;
import java.util.*;
class ScoreException extends Exception{
	ScoreException(String s){
		super(s);
	}
}


//MAIN CLASS
public class Excep {
	public static void main(String args[]) throws ScoreException {
		int stdID[] = {2,3,4,5};
		int std[] = new int[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<stdID.length;i++) {
			System.out.println("Enter your score for  "+stdID[i]+": ");
			try {
				int score = Integer.parseInt(sc.next());
				if(score > 100 || score < 0) {
					throw new ScoreException("It is greater than 100. Invalid!!");
				}	
				else {
					std[i] = score;
					
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		for(int j=0; j< stdID.length;j++) {
			System.out.println("Student ID is: "+stdID[j] +" score is "+std[j]);
		}
	}
}
