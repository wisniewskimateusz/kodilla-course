package com.kodilla.testing.collections;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> evenNumbers = new ArrayList<>(numbers);

        for (int i = 0; i < evenNumbers.size() - 1; i++) {
            if (evenNumbers.get(i )% 2 != 0) {
                evenNumbers.remove(i);
            }
        }
        return evenNumbers;
    }
}
