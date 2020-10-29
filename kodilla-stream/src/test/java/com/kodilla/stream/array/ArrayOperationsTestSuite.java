package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[] {2, 6, 2, 4, 9, 1};
        //When
        double resultOfAverage = ArrayOperations.getAverage(numbers);
        //Then
        assertEquals(4.0, resultOfAverage, 0.1);
    }
}