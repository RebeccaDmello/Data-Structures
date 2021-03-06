package PriorityQueue;

import java.sql.Date;
import java.util.Arrays;

public class PriorityQueueMain<T> {
	public static void main(String args[]) {
		AssignmentLog myHomework = new AssignmentLog();
		myHomework.addProject("CSC211", "Pg 50, Ex 2", Date.valueOf("2012-10-21"));
		
		Assignment pg75Ex8 = new Assignment("CSC215", "Pg 75, Ex 8", Date.valueOf("2012-10-14"));
		
		myHomework.addProject(pg75Ex8);
		System.out.println("The following assignment is due next:");
		System.out.println(myHomework.getNextProject().course);
	}
}
