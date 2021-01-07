package RecursiveExample;
import java.util.Scanner;

public class FactRecursion {
	public static void main(String args[]) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		factNum(input);
		System.out.println(factNum(input));
	}
	public static int factNum(int input) {
		if(input == 0)
			return -1;
		else {
			int res = input * factNum(input - 1);
			return res;
		}
	}
}
