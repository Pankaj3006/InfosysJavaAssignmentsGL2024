package com.Array;

class Student{
    private int[] marks;
    private char[] grade;
    
    public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public char[] getGrade() {
		return grade;
	}

	public void setGrade(char[] grade) {
		this.grade = grade;
	}
    
    public Student(int[] marks)
    {
    	this.marks = marks;
    	this.grade = new char[10];
 
    }
    
    public void findGrade() {
    	    
    	for(int i=0; i<getMarks().length; i++)
    	{
    		if(getMarks()[i]>=92)
    			grade[i] ='E';
    		
    		else if(getMarks()[i]>=85 && getMarks()[i]<92)
    		   grade[i] = 'A';
    		
    		else if(getMarks()[i]>=70 && getMarks()[i]<85)
     		   grade[i] = 'B';
    		
    		else if(getMarks()[i]>=65 && getMarks()[i]<70)
    			grade[i] = 'C';
    		
    		else
     		   grade[i] = 'D';
    	}
    	setGrade(grade);
    }

}

public class ArrayAssignment4 {

	public static void main(String[] args) {
		int[] marks = { 79, 87, 97, 65, 78, 99, 66 }; 
		Student student = new Student(marks);
		student.findGrade();
        System.out.println("Grades corresponding to the marks are : ");
		char[] grades = student.getGrade();
		for (int index = 0; index < grades.length; index++) {
			System.out.print(grades[index] + " ");
		}

	}

}
