import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceTest {

    @Test
    void testGetCurrentWeatherSunny() {
        // Mock erstellen
        WeatherRepository mockRepository = mock(WeatherRepository.class);
        // Verhalten des Mocks definieren
        when(mockRepository.getWeather()).thenReturn("Sunny");

        // Service mit dem Mock initialisieren
        WeatherService weatherService = new WeatherService(mockRepository);

        // Test durchführen
        assertEquals("Sunny", weatherService.getCurrentWeather());
    }

    @Test
    void testGetCurrentWeatherRainy() {
        // Mock erstellen
        WeatherRepository mockRepository = mock(WeatherRepository.class);
        // Verhalten des Mocks definieren
        when(mockRepository.getWeather()).thenReturn("Rainy");

        // Service mit dem Mock initialisieren
        WeatherService weatherService = new WeatherService(mockRepository);

        // Test durchführen
        assertEquals("Rainy", weatherService.getCurrentWeather());
    }
}
