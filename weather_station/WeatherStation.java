// Observer Pattern, pull only notification
// Bereket Abraham
import java.util.ArrayList;

public class WeatherStation extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherStation () {
	}

	public void setMeasurements (float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public void measurementsChanged() {
		// pull from web?
		setChanged();
		notifySubscribers();
	}

	public float getTemperature () {
		return temperature;
	}
	public float getHumidity () {
		return humidity;
	}
	public float getPressure () {
		return pressure;
	}

}