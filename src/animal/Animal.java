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
	
	//abstract methods
	public abstract void kill();
	
	//implemented methods
	public void makeNoise() {
		System.out.println(noise);
	}


	protected void makeDyingNoise() {
		System.out.println(new DyingNoise() {
			public String noise() {
				return "raaaw......";
			}
		}.noise());		
	}

}