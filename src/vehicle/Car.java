package vehicle;

public class Car extends Vehicle {
	
	//fields
	public Tires tires;
	
	//constructor
	public Car(int maxPeople, int topSpeed) {
		this.maxPeople = maxPeople;
		this.topSpeed = topSpeed;
		this.setMileage(0);
		this.tires = null;
	}
	
	public void changeTires(Tires tires) {
		this.tires = tires;
	}
	
	public void playMusic() {
		System.out.println(Radio.music());
	}
	
}
