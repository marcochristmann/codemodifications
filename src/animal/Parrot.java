package animal;

public class Parrot extends Animal {
	
	private String s;

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
		s = "Hello";
		System.out.println(s);
	}

}
