package animal;

public class Parrot extends Animal {
	
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
		String s = "Hello";
		System.out.println(s);
	}

}
