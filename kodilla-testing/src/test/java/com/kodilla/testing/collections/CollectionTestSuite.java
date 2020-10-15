package com.kodilla.testing.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Collections Test Suite")
public class CollectionTestSuite {

    @Test
    void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        List<Integer> numbers = new ArrayList<>();

        List<Integer> exceptResult = List.of(2, 4);
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        Assertions.assertTrue(true);
    }

    @Test
    void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        List<Integer> exceptResult = List.of(2, 4);
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        Assertions.assertEquals(exceptResult, result);
    }
}
