package PriorityQueue;

import java.sql.Date;

public class AssignmentLog<T> {
	private PriorityQueueInterface<Assignment> log;
	
	public AssignmentLog()
	{
		log = new PriorityMethods<Assignment>();
	} // end constructor
	
	public void addProject(Assignment newAssignment)
	{
		log.add(newAssignment);
	} 
	public void addProject(String courseCode, String task, Date dueDate)
	{
		Assignment newAssignment = new Assignment(courseCode, task, dueDate);
		addProject(newAssignment);
	} // end addProject
	public Assignment getNextProject()
	{
		return log.peek();
	} // end getNextProject
	public Assignment removeNextProject()
	{
		return log.remove();
	}
}
