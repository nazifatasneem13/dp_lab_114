import java.io.*;
import java.net.*;
import org.json.JSONObject;
class OpenWeatherAdapter implements WeatherProvider {
    private OpenWeatherAPI api = new OpenWeatherAPI();
    @Override
    public WeatherData getWeather(String location) {
        try {
            String response = api.fetchWeather(location);
            JSONObject json = new JSONObject(response);
            double temperature = json.getJSONObject("main").getDouble("temp");
            String condition = json.getJSONArray("Weather").getJSONObject(0).getString("description");
            return new WeatherData(location, temperature, condition, "Open Weather");


        } catch (Exception e) {
            System.out.println("Error fetching data from OpenWeatherMap: " + e.getMessage());
            return null;
        }
    }

}