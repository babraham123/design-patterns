// Driver for the Weather Station
// Bereket Abraham

public class WeatherDriver {
  public static void main (String[] args) {
    WeatherStation station = new WeatherStation();

    CurrentDisplay cdisplay1 = new CurrentDisplay();
    cdisplay1.addStation(station);

    station.setMeasurements(75.2f, 34.1f, 11f);
    station.setMeasurements(82.4f, 56f, 12f);

    cdisplay1.removeStation();
    station.setMeasurements(11.2f, 2.1f, 0.1f);
  }
}