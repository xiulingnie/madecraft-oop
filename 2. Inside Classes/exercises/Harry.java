package exercises;

public class Harry {

	private boolean cloakOn;

	Harry() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell) {
		System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;

		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {
		Harry potter = new Harry();// 1. make harry potter
		potter.makeInvisible(true);// 2. become invisible
		potter.spyOnSnape();// 3. spy on professor snape
		potter.makeInvisible(false);// 4. become visible again
		potter.castSpell("stupefy");// 5. cast a “stupefy” spell
	}

}
