package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double resultAdd = calculator.add(1, 2);
        double resultSub = calculator.sub(3, 1);
        double resultMul = calculator.mul(2, 2);
        double resultDiv = calculator.div(4, 2);
        //Then
        assertEquals(3.0, resultAdd);
        assertEquals(2.0, resultSub);
        assertEquals(4.0, resultMul);
        assertEquals(2.0, resultDiv);
    }
}