package com.restapi.restapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.restapi.restapi.model.WeatherResponse;

/**
 * Service class for fetching weather data from the OpenWeather API.
 * This class is responsible for making API calls to retrieve weather information
 * for a specified city.
 */
@Service
public class WeatherService {   

    @Value("${openweather.api.key}")
    private String apiKey; // API key for authenticating requests to the OpenWeather API.

    @Value("${openweather.api.url}")
    private String apiUrl; // The base URL for the OpenWeather API.

    /**
     * Fetches the weather data for a specified city.
     * 
     * @param city the name of the city for which to fetch weather data.
     * @return a WeatherResponse object containing the weather data for the specified city,
     *         or null if the request fails or the city is not found.
     */
    public WeatherResponse getWeather(String city) {
        // Construct the API request URL using the city name and API key.
        String url = String.format("%s?q=%s&appid=%s&units=metric", apiUrl, city, apiKey);

        // Create a RestTemplate instance to make the API call.
        RestTemplate restTemplate = new RestTemplate();
        
        // Make the API call and map the response to the WeatherResponse class.
        WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);

        return response;
    }
}