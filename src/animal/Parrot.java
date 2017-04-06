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
				return Messages.getString("Parrot.0"); //$NON-NLS-1$
			}
		}.noise());		
	}
	
	public void babble() {
		String s = Messages.getString("Parrot.1"); //$NON-NLS-1$
		System.out.println(s);
	}

}
