package com.Association;

class CabServiceProvider1 {
	private String cabServiceName;
	private int totalCabs;

	public CabServiceProvider1(String cabServiceName, int totalCabs) {
		this.cabServiceName = cabServiceName;
		this.totalCabs = totalCabs;
	}

	public String getCabServiceName() {
		return cabServiceName;
	}

	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}

	public int getTotalCabs() {
		return totalCabs;
	}

	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}

	public double calculateRewardPrice(Driver driver) {
		double bonus = 0.0;
		float driverRating = driver.getAverageRating();
		if (cabServiceName.equals("Halo")) {
			if ((driverRating >= 4.5) && (driverRating <= 5)) {
				bonus = 10.0 * driverRating;
			} else if ((driverRating >= 4) && (driverRating <= 4.5)) {
				bonus = 5.0 * driverRating;
			}
		} else if (cabServiceName.equals("Aber")) {
			if ((driverRating >= 4.5f) && (driverRating <= 5.0f)) {
				bonus = 8.0 * driverRating;
			} else if ((driverRating >= 4.0f) && (driverRating <= 4.5f)) {
				bonus = 3.0 * driverRating;
			}
		}
		return (Math.round(bonus * 100.0) / 100.0);
	}
}

class Driver {
	private String driverName;
	private float averageRating;

	public Driver(String driverName, float averageRating) {
		this.driverName = driverName;
		this.averageRating = averageRating;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public float getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}

}

public class AssociationExercise1 {

	public static void main(String args[]) {
		CabServiceProvider1 cabServiceProvider1 = new CabServiceProvider1("Halo", 50);

		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);

		Driver[] driversList = { driver1, driver2, driver3 };
		for (Driver driver : driversList) {
			System.out.println("Driver Name: " + driver.getDriverName());
			double bonus = cabServiceProvider1.calculateRewardPrice(driver);
			if (bonus > 0)
				System.out.println("Bonus: $" + bonus + "\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}
	}

}
