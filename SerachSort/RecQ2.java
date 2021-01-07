package SerachSort;
import java.util.Scanner;

public class RecQ2 {
	public static void main(String args[]) {
		display();
	}
	public static void display() {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<1 || num>10) {
			display();
		}
		else {
			System.out.println("num entered is: "+num);
		}
	}
}
