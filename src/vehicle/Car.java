package vehicle;

public class Car extends Vehicle {
	
	public static class Radio {
		public static String music() {
			return "ladidadidu";
		}
	}
	
	//fields
	public Tires tires;
	
	//constructor
	public Car(int maxPeople, int topSpeed) {
		this.maxPeople = maxPeople;
		this.topSpeed = topSpeed;
		this.setMileage(0);
		this.tires = null;
	}
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void changeTires(Tires tires) {
		this.tires = tires;
	}
	
	public void playMusic() {
		System.out.println(Radio.music());
	}
	
}
