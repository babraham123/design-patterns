// Decorator Pattern
// Bereket Abraham

public class Milk extends CondimentDecorator {
	Beverage beverage;

	public Milk (Beverage b) {
		beverage = b;
		description = "Milky I guess.";
	}

	public String getDescription () {
		return beverage.getDescription() + ", " + description;
	}

	public float cost () {
		return beverage.cost() + 0.50f;
	}
}