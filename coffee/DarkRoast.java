// Decorator Pattern
// Bereket Abraham

public class DarkRoast extends Beverage {
	public DarkRoast () {
		description = "Dark roast coffee. mmhhm.";
	}

	public float cost () {
		return 1.19f;
	}
}