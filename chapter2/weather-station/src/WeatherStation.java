public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(
            weatherData
        );
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(25.0f, 65.0f, 30.4f);
        System.out.println("---");
        System.out.println("");
        weatherData.setMeasurements(27.0f, 70.0f, 35.0f);
        System.out.println("---");
        System.out.println("");
        weatherData.setMeasurements(26.0f, 90.0f, 33.0f);
        System.out.println("---");
        System.out.println("");
        weatherData.setMeasurements(24.0f, 80.0f, 33.0f);

    }

}
