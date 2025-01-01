package com.restapi.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restapi.model.WeatherResponse;
import com.restapi.restapi.service.WeatherService;

/**
 * Controller class for handling weather-related requests.
 * This class provides endpoints to fetch weather data for a specified city.
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService; // Service for fetching weather data.

    private static final String DEFAULT_CITY = "Ahmedabad"; // Default city to use if none is provided.

    /**
     * Endpoint to get the current temperature and weather information for a specified city.
     * If no city is provided, the default city is used.
     * 
     * @param city the name of the city for which to fetch weather data.
     * @return a string containing the current temperature, weather description, humidity, and wind speed,
     *         or a message indicating that the temperature data is not available.
     */
    @GetMapping("/temperature")
    public String getTemperature(@RequestParam(required = false) String city) {
        // Use the default city if no city is provided.
        if (city == null || city.isEmpty()) {
            city = DEFAULT_CITY;
        }

        // Fetch the weather data for the specified city.
        WeatherResponse weatherResponse = weatherService.getWeather(city);

        // Check if the response contains valid weather data.
        if (weatherResponse != null && weatherResponse.getMain() != null) {
            Double temp = weatherResponse.getMain().getTemp(); // Get the temperature.
            String description = weatherResponse.getWeather().get(0).getDescription(); // Get the weather description.
            Double humidity = weatherResponse.getMain().getHumidity(); // Get the humidity.
            Double windSpeed = weatherResponse.getWind() != null ? weatherResponse.getWind().getSpeed() : null; // Get the wind speed.

            // Build the response string with weather information.
            StringBuilder responseBuilder = new StringBuilder();
            responseBuilder.append(String.format("Current temperature in %s is %.2f°C<br>", city, temp));
            responseBuilder.append(String.format("Description: %s<br>", description));
            responseBuilder.append(String.format("Humidity: %.2f%%<br>", humidity));
            responseBuilder.append(String.format("Wind Speed: %.2f m/s<br>", windSpeed != null ? windSpeed : 0.0));

            return responseBuilder.toString(); // Return the formatted weather information.
        }
        else {
            return "Temperature data not available.";
        }
    }
}