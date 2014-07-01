// Decorator Pattern
// Bereket Abraham

public abstract class Beverage {
	String description = "Unknown";

	public String getDescription () {
		return description;
	}

	public abstract float cost ();
}