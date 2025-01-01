package com.restapi.restapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 * Represents the response from the weather API.
 * This class is used to map the JSON response to Java objects.
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {  

    @JsonProperty("main")
    private Main main; // Containes the main weather data.

    @JsonProperty("weather")
    private List<Weather> weather; // Contains weather conditions.

    @JsonProperty("wind")
    private Wind wind; // Contains wind data.

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * Represents the main weather data.
     */
    public static class Main {
        @JsonProperty("temp")
        private Double temp; // Temperature in degrees Celsius.

        @JsonProperty("humidity")
        private Double humidity; // Humidity in percentage.


        public Double getTemp() {
            return temp;
        }

        public void setTemp(Double temp) {
            this.temp = temp;
        }

        public Double getHumidity() {
            return humidity;
        }

        public void setHumidity(Double humidity) {
            this.humidity = humidity;
        }

    }

    /**
     * Represents weather conditions such as description.
     */
    public static class Weather {
        @JsonProperty("description")
        private String description; // Description of the weather.

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    /**
     * Represents wind data including speed.
     */
    public static class Wind {
        @JsonProperty("speed")
        private Double speed; // Wind speed in meters per second.

        public Double getSpeed() {
            return speed;
        }

        public void setSpeed(Double speed) {
            this.speed = speed;
        }
    }
}