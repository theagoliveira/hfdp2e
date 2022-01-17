public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CURRENT CONDITIONS");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity:    " + humidity + "%");
        System.out.println("Pressure:    " + pressure);
        System.out.println("");

    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        pressure = weatherData.getPressure();
        display();
    }

}
