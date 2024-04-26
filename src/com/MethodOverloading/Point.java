package com.MethodOverloading;

public class Point {
	
	private double xCoordinate;
	private double yCoordinate;
	
	public Point(double xCoordinate, double yCoordinate)
	{
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public double getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	public double calculateDistance() {
		double distance = Math.sqrt(Math.pow(this.xCoordinate, 2)+ Math.pow(this.yCoordinate, 2));
		
		return Math.round(distance * 100.0)/100.0;
   }
	
	public double calculateDistance(Point point) {
             
       double xdistance = this.xCoordinate - point.getxCoordinate();
       double ydistance = this.yCoordinate - point.getyCoordinate();
       
       double distance = Math.sqrt(Math.pow(xdistance, 2)+Math.pow(ydistance, 2));
       return Math.round(distance * 100.0)/100.0;
	}

}
