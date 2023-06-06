package com.qa.junit5_example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach // run this method before each test
    public void init() {
        calculator = new Calculator();
        // we create a new calculator before each unit
        // test as a unit test should deal with a
        // fresh state
    }

    // @AfterEach can be used for methods that run after each test

    @Test
    public void addTwoNumbersTest() {
        // Arrange: the data for the test
        double num1 = 3.0, num2 = 7.0;
        double expectedResult = 10.0;

        // Act: perform the action under test
        double actualResult = calculator.add(num1, num2);

        // Assert: the result was as expected
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void subtractTwoNumbersTest() {
        // Arrange
        double num1 = 5.0, num2 = 3.0;
        double expectedResult = 2.0;

        // Act
        double actualResult = calculator.subtract(num1, num2);

        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
