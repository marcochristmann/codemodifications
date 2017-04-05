package animal;

public class Parrot extends Animal {
	
	//constructor
	public Parrot() {
	}

	@Override
	public void kill() {
		makeDyingNoise();
		
	}

	public void babble() {
		String s = "Hello";
		System.out.println(s);
	}

}
