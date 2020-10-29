package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .forEach(x -> System.out.println(x));

        return IntStream.range(0, numbers.length)
                .map(x -> numbers[x])
                .average().getAsDouble();
    }
}