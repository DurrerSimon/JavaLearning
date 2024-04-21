public class DefaultWeatherRepository implements WeatherRepository {
    @Override
    public String getWeather() {
        // In einer realen Anwendung würde hier auf eine Datenquelle zugegriffen
        // Hier geben wir einfach einen festen Wert zurück
        return "Sunny";
    }
}
