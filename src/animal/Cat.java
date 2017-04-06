package animal;

public class Cat extends Animal {
	
	//fields
	public boolean hasTail;
	public final String name;
	
	//constructor
	public Cat(String name, String noise, int feet, boolean hasTail) {
		this.name = name;
		this.noise = noise;
		this.feet = feet;
		this.hasTail = hasTail;
	}

	@Override
	public void makeNoise() {
		String shout = "";
		for (int i = 0; i < this.noise.length(); i++) {
			shout += this.noise.substring(i, i+1);
		}
		System.out.println(shout);
	}
	
	@Override
	public void kill() {
		this.setAlive(false);
		this.noise = "";
	}

}
