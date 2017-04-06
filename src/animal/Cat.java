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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (hasTail ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (hasTail != other.hasTail)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
