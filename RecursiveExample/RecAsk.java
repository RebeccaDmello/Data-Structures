package RecursiveExample;
import java.util.Scanner;

public class RecAsk {
	public static void main(String args[]) {
		askInput();
	}
	public static void askInput() {
		System.out.println("Enter input from 1 and 10");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input <=10 && input >=0) {
			System.out.println("Input is "+input);
		}
		else {
			askInput();
		}
	}
}
