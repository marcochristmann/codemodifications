package vehicle;

public abstract class Vehicle {
	
	//fields
	public int maxPeople;
	public int topSpeed;
	private int mileage;
	
	//constructor
	public Vehicle() {		
	}
	
	//getter and setter
	public int getMileage() {
		return mileage;
		
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

}
