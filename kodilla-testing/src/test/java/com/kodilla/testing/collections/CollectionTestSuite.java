package com.kodilla.testing.collections;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Collections Test Suite")
public class CollectionTestSuite {

    @DisplayName(
            "Checking if the class behaves correctly when the list is empty."
    )

    @BeforeEach
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        //when
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //then
        assertEquals(0, result.size());
        assertTrue(result.isEmpty());
    }

    @DisplayName(
            "Checking if the class behaves correctly when the list contains even and odd numbers."
    )

    @AfterEach
    @Test
    void testOddNumbersExterminatorNormalList() {
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 4);
        //when
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //then
        List<Integer> exceptResult = List.of(2, 4);
        assertEquals(exceptResult, result);
    }
}
