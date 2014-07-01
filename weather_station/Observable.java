// Observer Pattern
// Bereket Abraham
import java.util.ArrayList;

public class Observable {
	private boolean changed;
	private ArrayList<Observer> subscribers;

	public Observable () {
		subscribers = new ArrayList<Observer>();
		changed = false;
	}
	
	public void subscribe (Observer o) {
		subscribers.add(o);
	}

	public void unsubscribe (Observer o) {
		int i = subscribers.indexOf(o);
		subscribers.remove(i);
	}

	public void notifySubscribers (Object arg) {
		if (changed) {
			for (Observer o : subscribers) {
				o.update(this, arg);
			}
		}
		changed = false;
	}
	public void notifySubscribers () {
		notifySubscribers(null);
	}

	public void setChanged () {
		changed = true;
	}
	
}