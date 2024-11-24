import java.io.*;
import java.net.*;
import java.util.Scanner;

public class WeatherApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final WeatherServiceFacade weatherService = new WeatherServiceFacade();


    public static void main(String[] args) {
        System.out.print("Enter city name: ");
        String city = scanner.nextLine();
        WeatherData weatherData = weatherService.getWeather(city);
        if (weatherData != null) {
            System.out.println(weatherData);
        }
    }

}
