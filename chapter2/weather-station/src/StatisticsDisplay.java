public class StatisticsDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private float avgTemperature;
    private float minTemperature;
    private float maxTemperature;
    private float avgHumidity;
    private float minHumidity;
    private float maxHumidity;
    private float avgPressure;
    private float minPressure;
    private float maxPressure;
    private int measurements;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);

        measurements = 0;

        avgTemperature = 0;
        avgHumidity = 0;
        avgPressure = 0;

        minTemperature = Float.POSITIVE_INFINITY;
        minHumidity = Float.POSITIVE_INFINITY;
        minPressure = Float.POSITIVE_INFINITY;

        maxTemperature = Float.NEGATIVE_INFINITY;
        maxHumidity = Float.NEGATIVE_INFINITY;
        maxPressure = Float.NEGATIVE_INFINITY;
    }

    @Override
    public void display() {
        System.out.println("STATISTICS");
        System.out.println("Avg. Temperature: " + avgTemperature + "°C");
        System.out.println("Min. Temperature: " + minTemperature + "°C");
        System.out.println("Max. Temperature: " + maxTemperature + "°C");
        System.out.println("Avg. Humidity:    " + avgHumidity + "%");
        System.out.println("Min. Humidity:    " + minHumidity + "%");
        System.out.println("Max. Humidity:    " + maxHumidity + "%");
        System.out.println("Avg. Pressure:    " + avgPressure);
        System.out.println("Min. Pressure:    " + minPressure);
        System.out.println("Max. Pressure:    " + maxPressure);
        System.out.println("");
    }

    @Override
    public void update() {
        float temperature = weatherData.getTemperature();
        float humidity = weatherData.getHumidity();
        float pressure = weatherData.getPressure();

        measurements++;

        avgTemperature = ((avgTemperature * (measurements - 1)) + temperature) / measurements;
        avgHumidity = ((avgHumidity * (measurements - 1)) + humidity) / measurements;
        avgPressure = ((avgPressure * (measurements - 1)) + pressure) / measurements;

        if (temperature < minTemperature) {
            minTemperature = temperature;
        }

        if (humidity < minHumidity) {
            minHumidity = humidity;
        }

        if (pressure < minPressure) {
            minPressure = pressure;
        }

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if (humidity > maxHumidity) {
            maxHumidity = humidity;
        }

        if (pressure > maxPressure) {
            maxPressure = pressure;
        }

        display();
    }

}
