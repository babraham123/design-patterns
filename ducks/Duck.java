// Duck superclass for the Duck Simulator
// Bereket Abraham

public abstract class Duck {
	QuackBehavior myQuack;
	FlyBehavior myFly;

	public Duck () {
		//
	}

	public void fly () {
		myFly.performBehavior();
	}

	public void quack () {
		myQuack.performBehavior();
	}

	public void swim () {
		System.out.println("All ducks can swim, duh");
	}

	abstract public void display();
}