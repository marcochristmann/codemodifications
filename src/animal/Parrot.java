package animal;

public class Parrot extends Animal {
	
	public final class DyingNoise2 extends DyingNoise {
		public String noise() {
			return "raaaw......";
		}
	}

	//constructor
	public Parrot() {
	}

	@Override
	public void kill() {
		makeDyingNoise();
		
	}

	private void makeDyingNoise() {
		System.out.println(new DyingNoise2().noise());		
	}
	
	public void babble() {
		String s = "Hello";
		System.out.println(s);
	}

}
