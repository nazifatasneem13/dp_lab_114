class WeatherData {
    private String location;
    private double temperature;
    private String condition;
    private String source;

    public WeatherData(String location, double temperature, String condition, String source) {
        this.location = location;
        this.temperature = temperature;
        this.condition = condition;
        this.source = source;
    }

    public String toString() {
        return String.format("Weather in %s from %s: %.2f°C, %s", location, source, temperature, condition);
    }
}
