public class Main {
    public static void main(String[] args) {
        // Erstellen einer Instanz des WeatherRepository
        WeatherRepository weatherRepository = new DefaultWeatherRepository();

        // Initialisieren des WeatherService mit dem WeatherRepository
        WeatherService weatherService = new WeatherService(weatherRepository);

        // Abrufen des aktuellen Wetters und Ausgabe auf der Konsole
        String currentWeather = weatherService.getCurrentWeather();
        System.out.println("Das aktuelle Wetter ist: " + currentWeather);
    }
}
