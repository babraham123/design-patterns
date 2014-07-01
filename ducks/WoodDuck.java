// WoodDuck class for the Duck Simulator
// Bereket Abraham

public class WoodDuck extends Duck {
	public WoodDuck () { 
		myQuack = new SoftQuack();
		myFly = new WingsFly();
	}

	@Override
	public void display () {
		System.out.println("Hello, I'm a wood duck");
	}

}