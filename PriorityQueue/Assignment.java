package PriorityQueue;

import java.sql.Date;

public class Assignment<T> {
	T course;
	T task;
	Date date;
	
	Assignment(T course, T task, Date date){
		this.course = course;
		this.task = task;
		this.date = date;
	}
	
	public T getCourse() {
		return course;
	}
	
	public T getTask() {
		return task;
	}
	
	public Date getDate() {
		return date;
	}
	
	public int compareTo(Assignment other) {
		return date.compareTo(other.date);
	}
	
	public void setCourse(T course) {
		this.course = course;
	}
	
	public void setTask(T task) {
		this.task = task;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
}
