package animal;

public class Parrot extends Animal {
	
	private static final String HELLO = "Hello";

	//constructor
	public Parrot() {
	}

	@Override
	public void kill() {
		makeDyingNoise();
		
	}

	private void makeDyingNoise() {
		System.out.println(new DyingNoise() {
			public String noise() {
				return "raaaw......";
			}
		}.noise());		
	}
	
	public void babble() {
		String s = HELLO;
		System.out.println(s);
	}

}
