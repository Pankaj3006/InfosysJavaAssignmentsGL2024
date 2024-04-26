package com.Aggregation;

class Subject {
	private String subjectName;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Subject(String subjectName) {
		this.subjectName = subjectName;
	}
}

class AggregationTryOut {
	private int rollNo;
	private String studentName;
	private Subject subject;
	
	AggregationTryOut(int rollNo, String studentName, Subject subject) {
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.subject = subject;
	}

	public void displayDetails() {
		System.out.println("Student Name: " + studentName);
		System.out.println("Subject Name: " + subject.getSubjectName());
		System.out.println("Student Roll Number: " + rollNo);

		// We cannot directly access the private member of the class Subject
		// To access the private members of aggregated class, we will have to
		// make use of the getter and setter methods

		// Add the getter and setter methods to class Subject and modify the
		// displayDetails method accordingly
	}

	public static void main(String args[]) {
		Subject subject = new Subject("Maths");
		AggregationTryOut obj = new AggregationTryOut(101, "Nate", subject);
		obj.displayDetails();
	}
}


