package vehicle;

public class Tires {
	
	//fields
	public final int maxRange;
	private int currentRange;
	public String manufacturer;
	
	//constructor
	public Tires(TiresParameter parameterObject) {
		this.maxRange = parameterObject.maxRange;
		setCurrentRange(0);
		this.manufacturer = parameterObject.manufacturer;
	}
	
	public int remainingRange() {
		int a = currentRange;
		int b = maxRange;
		int result = a - b;
		return result;
	}
	
	public int getCurrentRange() {
		return currentRange;
	}
	
	public void setCurrentRange(int currentRange) {
		this.currentRange = currentRange;
	}	

}
