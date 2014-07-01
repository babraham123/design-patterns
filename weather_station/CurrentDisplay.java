// Observer Pattern, pull only notification
// Bereket Abraham
import java.util.ArrayList;

public class CurrentDisplay implements Observer {
	private Observable station;
	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentDisplay () {
		station = null;
	}

	public void update (Observable o, Object arg) {
		if (station instanceof WeatherStation) {
			WeatherStation data = (WeatherStation) station;
			temperature = data.getTemperature();
			humidity = data.getHumidity();
			pressure = data.getPressure();
			display();
		}
	}

	public void display () {
		System.out.println("Current Conditions: ");
		System.out.println("Temperature= " + temperature + "F, Humidity= " + humidity + "%, Pressure= " + pressure);
	}

	public void addStation (Observable station) {
		this.station = station;
		this.station.subscribe(this);
	}

	public void removeStation () {
		station.unsubscribe(this);
		station = null;
	}

}