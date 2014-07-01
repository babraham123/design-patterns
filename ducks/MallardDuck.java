// MallardDuck class for the Duck Simulator
// Bereket Abraham

public class MallardDuck extends Duck {
	public MallardDuck () { 
		myQuack = new LoudQuack();
		myFly = new RocketPackFly();
	}

	@Override
	public void display () {
		System.out.println("Hello, I'm a mallard duck");
	}
}