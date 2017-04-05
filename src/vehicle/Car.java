package vehicle;

public class Car extends Vehicle {
	
	public static class Radio {
		public static String music() {
			return "ladidadidu";
		}
	}
	
	public CarData data = new CarData();

	//constructor
	public Car(int maxPeople, int topSpeed) {
		this.maxPeople = maxPeople;
		this.topSpeed = topSpeed;
		this.setMileage(0);
		this.data.tires = null;
	}
	
	public void changeTires(Tires tires) {
		this.data.tires = tires;
	}
	
	public void playMusic() {
		System.out.println(Radio.music());
	}
	
}
