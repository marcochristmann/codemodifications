package vehicle;

public class Car extends Vehicle {
	
	public static class Radio {
		public static String music() {
			return "ladidadidu";
		}
	}
	
	//fields
	public Tires tires;
	
	public boolean equals(Object arg0) {
		return tires.equals(arg0);
	}

	public int getCurrentRange() {
		return tires.getCurrentRange();
	}

	public int hashCode() {
		return tires.hashCode();
	}

	public int remainingRange() {
		return tires.remainingRange();
	}

	public void setCurrentRange(int currentRange) {
		tires.setCurrentRange(currentRange);
	}

	public String toString() {
		return tires.toString();
	}

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
