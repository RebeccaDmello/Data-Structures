package FixedArray;

import java.util.*;

public class FixedMain {
	public static void main(String args[]) {
		FixedInterface<Object> fl = new FixedMethods();
		Scanner sc = new Scanner(System.in);
		int insElm = 0;
		int pos = 0;
		int choice = 1;
		
		while(choice!=0) {
			System.out.println("Enter your choices: 0: Terminate 1: Add Element 2: Add Element at specific position 3: Remove Element at Specific position 4: Replace Element from specific position \n"
					+ "5: Check if the element is present in the list 6:Get Element from specific position 7:Get all the elements from the list 8:Clear list 9: Check if it is empty or not ");
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				break;
			case 1:
				System.out.println("Enter Element to be added");
				insElm = sc.nextInt();
				System.out.println(fl.add(insElm));
				break;
			case 2:
				System.out.println("Enter the position where the element had to be added");
				pos = sc.nextInt();
				System.out.println("Enter the Element to be inserted");
				insElm = sc.nextInt();
				System.out.println(fl.add(pos, insElm));
				break;
			case 3:
				System.out.println("Enter position");
				pos = sc.nextInt();
				System.out.println(fl.remove(pos));
				break;
			case 4:
				System.out.println("Enter position");
				pos = sc.nextInt();
				System.out.println("Enter Element");
				insElm = sc.nextInt();
				System.out.println(fl.replace(pos, insElm));
				break;
			case 5:
				System.out.println("Enter Elememt to be Checked");
				insElm = sc.nextInt();
				System.out.println(fl.contains(insElm));
				break;
			case 6:
				System.out.println("Enter Position to retrieve element");
				pos = sc.nextInt();
				System.out.println(fl.getElm(pos));
				break;
			case 7:
				System.out.println("Elements in Array are:");
				System.out.println(Arrays.toString(fl.toArray()));
				break;
			case 8:
				System.out.println(fl.clear());
				break;
			case 9:
				System.out.println(fl.isEmpty());
				break;
			}
		}
	}
}
