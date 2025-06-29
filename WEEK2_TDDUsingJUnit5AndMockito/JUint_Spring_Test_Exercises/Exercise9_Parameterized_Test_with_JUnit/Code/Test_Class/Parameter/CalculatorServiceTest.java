package com.example.Parameter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "5, 7, 12",
        "10, -3, 7",
        "0, 0, 0",
        "-2, -3, -5"
    })
    void testAdd(int a, int b, int expectedSum) {
        int result = calculatorService.add(a, b);
        assertEquals(expectedSum, result);
    }
}
