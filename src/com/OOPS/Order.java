package com.OOPS;

public class Order {

	public int orderId;
	public String orderedFoods;
	public double totalPrice;
	public String status;
	
	public Order() {
		this.status = "Ordered";
		}
		
		public Order(int orderid, String orderedFoods)
		{
			this.orderId = orderid;
			this.orderedFoods = orderedFoods;
			this.status = "Ordered";
		}
	
	public double calculateTotalPrice(int unitPrice)
	{
		System.out.println("Order Details");
		System.out.println("Order Id: "+orderId);
		System.out.println("Ordered Food: "+orderedFoods);
		System.out.println("Order Status: "+status);
		return totalPrice=unitPrice;
	}	

}
