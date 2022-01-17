public class ForecastDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private float pressure;
    private float prevPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("FORECAST");

        if (pressure == prevPressure) {
            System.out.println("More of the same");
        } else if (pressure > prevPressure) {
            System.out.println("Improving weather on the way!");
        } else {
            System.out.println("Watch out for cooler, rainy weather");
        }

        System.out.println("");
    }

    @Override
    public void update() {
        prevPressure = pressure;
        pressure = weatherData.getPressure();

        display();
    }

}
