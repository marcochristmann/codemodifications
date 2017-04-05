package vehicle;

public class Tires {
	
	//fields
	public final int maxRange;
	private int currentRange;
	public String manufacturer;
	
	//constructor
	public Tires(int maxRange, String manufacturer) {
		this.maxRange = maxRange;
		setCurrentRange(0);
		this.manufacturer = manufacturer;
	}
	
	public int remainingRange() {
		int a = currentRange;
		int b = maxRange;
		int calculation = a - b;
		int result = calculation;
		return result;
	}
	
	public int getCurrentRange() {
		return currentRange;
	}
	
	public void setCurrentRange(int currentRange) {
		this.currentRange = currentRange;
	}	

}
