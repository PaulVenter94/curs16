package ro.fasttrackit.curs16Homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    @Test
    @DisplayName("WHEN temp is positive from F to C")
    void degreesFahrenheitToCelsius() {
        //setup
        //run
        double result = TemperatureConverter.fahrenheitToCelsius(50);
        //assert
        assertThat(result).isEqualTo(10);
    }
    @Test
    @DisplayName("WHEN give temp in C THEN return value in Fahrenheit")
    void celsiusToFahrenheit() {
        //setup
        //run
        var result = TemperatureConverter.celsiusToFahrenheit(0);
        //assert
        assertThat(result).isEqualTo(32);
    }
}