import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class RateLimiterProxy {
    private final Map<String, Long> lastAccessTime = new HashMap<>();
    private final Map<String, WeatherData> cache = new ConcurrentHashMap<>();
    private final Map<String, Long> cacheTimestamps = new ConcurrentHashMap<>();
    private static final long COOLDOWN_PERIOD = 30 * 1000; // millisecond er jonno hishab
    private static final long CACHE_DURATION = 10 * 60 * 1000;

    public boolean canAccess(String provider) {
        long currentTime = System.currentTimeMillis();
        if (!lastAccessTime.containsKey(provider) || (currentTime - lastAccessTime.get(provider) > COOLDOWN_PERIOD)) {
            lastAccessTime.put(provider, currentTime);
            return true;
        }
        return false;
    }

    public boolean isCached(String location) {
        if (cache.containsKey(location) &&
                (System.currentTimeMillis() - cacheTimestamps.get(location)) < CACHE_DURATION) {
            System.out.println("Returning cached data...");
            return true;
        }
        return false;
    }
    public WeatherData getCachedWeather(String location) {
        return cache.get(location);
    }

    public void cacheWeather(String location, WeatherData weatherData) {
        cache.put(location, weatherData);
        cacheTimestamps.put(location, System.currentTimeMillis());
    }

}