// Driver for the Beverage calculator: Decorators
// Bereket Abraham

public class BeverageDriver {
  public static void main (String[] args) {
    Beverage coffee = new Decaf();
    System.out.println(coffee.getDescription() + " $" + coffee.cost());

    Beverage coffee2 = new Milk(
		new Mocha(
			new Mocha(
				new DarkRoast()
			)
		)
	);
    System.out.println(coffee2.getDescription() + " $" + coffee2.cost());
  }
}