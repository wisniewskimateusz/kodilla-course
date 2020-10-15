package com.kodilla.testing;

import com.kodilla.testing.collections.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.List;

public class TestingMain {
    public static void main(String[] args){

        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers2 = oddNumbersExterminator.exterminate(numbers);

        for(int i: numbers2) {
            System.out.println(i);
        }
    }
}