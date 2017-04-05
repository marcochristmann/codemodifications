package animal;

public abstract class Animal {
	
	//fields
	public String noise;
	protected int feet;
	private boolean alive;
	
	
	//constructor
	public Animal() {		
	}
	
	
	//getter and setter
	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	//implemented methods
	public void makeNoise() {
		System.out.println(noise);
	}

}