package com.kodilla.stream.array;

import java.util.stream.IntStream;
//5 3 1 6
public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .forEach(x -> System.out.println(numbers[x]));

        return IntStream.range(0, numbers.length)
                .map(x -> numbers[x])
                .average()
                .orElse(0);
    }
}