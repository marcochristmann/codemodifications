package vehicle;

public class Car extends Vehicle {
	
	public static class Radio {
		public static String music() {
			return "ladidadidu";
		}
	}
	
	//fields
	private Tires tires;
	
	//constructor
	public Car(int maxPeople, int topSpeed) {
		this.maxPeople = maxPeople;
		this.topSpeed = topSpeed;
		this.setMileage(0);
		this.setTires(null);
	}
	
	public void changeTires(Tires tires) {
		this.setTires(tires);
	}
	
	public void playMusic() {
		System.out.println(Radio.music());
	}

	public Tires getTires() {
		return tires;
	}

	public void setTires(Tires tires) {
		this.tires = tires;
	}
	
}
