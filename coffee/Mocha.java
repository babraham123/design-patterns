// Decorator Pattern
// Bereket Abraham

public class Mocha extends CondimentDecorator {
	Beverage beverage;

	public Mocha (Beverage b) {
		beverage = b;
		description = "Good ole chocolate.";
	}

	public String getDescription () {
		return beverage.getDescription() + ", " + description;
	}

	public float cost () {
		return beverage.cost() + 0.50f;
	}
}