package ro.fasttrackit.curs16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("When i add two integers posivitive their sum is returned!")
    void addingTwoPositive() {
        //Setuo

        //run
        var result = calculator.add(1, 2);
        //assert
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("When i add a positive and a negative Then their difference is returned")
    void addingPositiveAndNegative() {
        //setup

        //Run
        var result = calculator.add(1, -1);
        //
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("When adding a numberto the MaxInteger then Throw exception")
    void addingToMaxInteger() {
        //setup

        //run+assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.add(Integer.MAX_VALUE, 10));
        //assert
    }

    @Test
    @DisplayName("When i substract two positives Integers THEN difference is displayed")
    void subsTwoPositives() {
        //Setup

        //Run
        int result = calculator.substract(2, 1);
        //asesrt
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("When i substract two negatives")
    void subTwoNegatives() {
        //setup

        //Run
        int result = calculator.substract(-2, -3);
        //assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("Whem two positive numbers are multiplied THEN their result is returned")
    void multiplyPositiveWith1() {
        //Setup

        //Run
        int result = calculator.multiply(7, 1);
        //assert
        assertThat(result).isEqualTo(7);
    }

    @Test
    @DisplayName("Whem two numbers are multiplied THEN their result is returned")
    void multiplyPositive() {
        //Setup

        //Run
        int result = calculator.multiply(7, 7);
        //assert
        assertThat(result).isEqualTo(49);
    }

    @Test
    @DisplayName("Whem MaxInt is multiplied with ohter than 1 and 0 THEN exception is returned")
    void multiplyMaxInt() {
        //Setup

        //Run+Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.multiply(Integer.MAX_VALUE, 7));
    }
}