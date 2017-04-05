package animal;

public class Cat extends Animal {
	
	public static Cat createCat(String name, String noise, int feet, boolean hasTail) {
		return new Cat(name, noise, feet, hasTail);
	}

	//fields
	public boolean hasTail;
	public final String name;
	
	//constructor
	private Cat(String name, String noise, int feet, boolean hasTail) {
		this.name = name;
		this.noise = noise;
		this.feet = feet;
		this.hasTail = hasTail;
	}

	@Override
	public void makeNoise() {
		String sound = "";
		for (int i = 0; i < this.noise.length(); i++) {
			sound += this.noise.substring(i, i+1);
		}
		System.out.println(sound);
	}
	
	@Override
	public void kill() {
		this.setAlive(false);
		this.noise = "";
	}

}
