// Drive for the Duck simulator
// Bereket Abraham

public class DuckDriver {
  public static void main (String[] args) {
    Duck mduck = new MallardDuck();
    mduck.display();
    mduck.fly();
    mduck.quack();
    mduck.swim();

    System.out.println("------------------");

    Duck wduck = new WoodDuck();
    wduck.display();
    wduck.fly();
    wduck.quack();
    wduck.swim();
  }
}