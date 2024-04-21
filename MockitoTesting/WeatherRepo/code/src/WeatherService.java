public class WeatherService {
    private WeatherRepository weatherRepository;

    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public String getCurrentWeather() {
        return weatherRepository.getWeather();
    }
}
