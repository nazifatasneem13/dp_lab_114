import java.io.*;
import java.net.*;

class OpenWeatherAPI {
    private static final String API_KEY = "0e87b701dc735ede819b1fed3ad63aeb";

    public String fetchWeather(String location) throws IOException {
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + URLEncoder.encode(location, "UTF-8") + "&units=metric&appid=" + API_KEY;
        return makeApiCall(apiUrl);
    }

    private String makeApiCall(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");


        return ;

    }
}
