package com.OOPS;

class Rectangle {
	public float length;
	public float width;
	
	public double calculatePerimeter() {
		
		double perimeter = 2*(length+width);		
		return perimeter;
	}
	
	public double calculateArea() {
		
		double area = length* width;
		return area;
	}
}

public class MethodsAssignment4 {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.length = 6f;
		rectangle.width = 3f;
		
		System.out.println("Area of the rectangle is: "+rectangle.calculateArea());
		System.out.println("Perimeter of the rectangle is: "+rectangle.calculatePerimeter());
	}
}
