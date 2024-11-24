class WeatherServiceFacade {
    private final WeatherProvider openWeather = new OpenWeatherAdapter();
    private final RateLimiterProxy rateLimiter = new RateLimiterProxy();
    public WeatherData getWeather(String location) {
        if (rateLimiter.isCached(location)) {
            return rateLimiter.getCachedWeather(location);
        }

        WeatherData weatherData = null;
        if (rateLimiter.canAccess("OpenWeatherMap")) {
            weatherData = openWeather.getWeather(location);
        } else {
            System.out.println("Rate limit reached for all providers. Please try again later.");
        }

        if (weatherData != null) {
            rateLimiter.cacheWeather(location, weatherData);
        }

        return weatherData;
    }
}
