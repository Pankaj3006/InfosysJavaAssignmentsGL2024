package com.Final;

class Student {
	private final int STIPEND=100;
	private int studentId;
	private int aggregateMarks;
	
	public int getSTIPEND() {
		return STIPEND;
	}	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAggregateMarks() {
		return aggregateMarks;
	}
	public void setAggregateMarks(int aggregateMarks) {
		this.aggregateMarks = aggregateMarks;
	}
	
	public double calculateTotalStipend() {
		
		double bonus=0.0;
		int marks = getAggregateMarks();
		if(marks >=85 && marks<90)
			bonus = 10;
		else if(marks>=90 &&  marks<95)
			bonus=15;
		else if(marks>=95 && marks<=100)
			bonus=20;
		
		double totalStipend = 100+bonus;
			
		return totalStipend;
	}
}

public class FinalExercise1 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentId(1212);
		student1.setAggregateMarks(93);

		double totalStipend = student1.calculateTotalStipend();
		System.out.println("The final stipend of " + student1.getStudentId()+" is $" + totalStipend);

		Student student2 = new Student();
		student2.setStudentId(1222);
		student2.setAggregateMarks(84);

		totalStipend = student2.calculateTotalStipend();
		System.out.println("The final stipend of " + student2.getStudentId()+" is $" + totalStipend);
	}

}
