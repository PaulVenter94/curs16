package ro.fasttrackit.curs16Homework;

public class TemperatureConverter {
    public static double fahrenheitToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double temp) {
        return temp * 9 / 5 + 32;
    }
}
