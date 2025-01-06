# REST-API-CLIENT

**COMPANY**: CODTECH IT SOLUTIONS

**NAME**: ABHINAV GAHLAUT

**INTERN ID**: CT12FRU

**DOMAIN**: JAVA PROGRAMMING

**BATCH DURATION**: December 25th, 2024 to February 25th, 2025

**MENTOR NAME**: NEELA SANTHOSH

# **REST API CLIENT: The Weather Application**

This repository provides a Spring Boot application that functions as a REST API for retrieving weather information. The API leverages the OpenWeatherMap API to fetch weather data for a specified city. Users can interact with the API through an endpoint to obtain the current temperature, weather description, humidity, and wind speed.

**FILES PROVIDED IN REPO:**
- restapi folder (Containing the project)
- How-to-run.txt (Text file having information on how to execute the application)

**TOOLS/TECH. USED:**
- Java
- Spring Boot
- OpenWeatherMap API

**KEY FEATURES:**
- **REST API**: The application exposes a REST API endpoint (/weather/temperature) that accepts an optional city name as a query parameter. If no city is specified, the API defaults to retrieving weather data for Ahmedabad, India.
- **Spring Boot**: The application is built using Spring Boot, a popular framework for rapid application development in Java. Spring Boot simplifies configuration management and enables quick application startup.
- **OpenWeatherMap Integration**: The application utilizes the OpenWeatherMap API, a free service that provides weather data for various locations worldwide.
- **Model Classes**: The code defines model classes to represent the structure of the weather data recieved from the OpenWeatherMap API. These classes include WeatherResponse, Main, Weather, Wind
- **Weather Service**: The WeatherService class is responsible for interacting with the OpenWeatherMap API. It constructs the API request URL using for the provided city nameand retrieves the weather data in JSON format.
- **Weather Controller**: The WeatherController class handles incoming API requests. it retrieves the city name from the query parameter and delegates the wweather data retrieval task to the WeatherService. Upon successful retrieval, the controller parses the weather data and constructs a human-readable response containing the current temperature, weather description, humidity, and wind speed.

**CODE STRUCTURE:**
The repository is organized into several Java packages, each containing classes with specific functionalities:
- **com.restapi.restapi**: This package contains the main application class (WeatherApiClientApplication) that serves as the entry point for the Spring Boot application.
- **com.restapi.restapi.model**: This package houses the model classes (WeatherResponse, Main, Weather, and Wind) that represent the weather data structure.
- **com.restapi.restapi.service**: This package contains the WeatherService class reponsible for fetching weather data from the OpenWeatherMap API.
- **com.restapi.restapi.controller**: This package houses the WeatherController class that handles API requests and constructs the weather information reponse.

**USAGE:**
1. **Prerequisites**:
   - JDK (Java Development Kit)
   - Maven build tool

2. **Clone the repo**:
   - git clone https://github.com/gahlautabhinav/REST-API-CLIENT

3. **Navigate to the project directory**:
   - cd restapi

4. **Add your own OpenWeatherMap API key**:
   - Make changes in the "application.properties" file located in the resources directory. Add your own OpenWeatherMap API Key.

5. **Run the application**:
   - Open "How-to-run.txt" text file and run the first two lines in the command line and the last line in the web browser after running the application successfully.

# **OUTPUT**
