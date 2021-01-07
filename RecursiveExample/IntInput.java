package RecursiveExample;
import java.util.Scanner;

public class IntInput {
	public static void main(String args[]) {
		System.out.print("Enter no between 1 and 10");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		dispInput(input);
	}
	public static void dispInput(int input) {
		if(input > 10 && input < 1) {
//			System.out.println("Number entered is: "+input);
			dispInput(input);
		}else {
//			dispInput(input);
			System.out.println("Number entered is "+input);
		}
		
	}
	
}
