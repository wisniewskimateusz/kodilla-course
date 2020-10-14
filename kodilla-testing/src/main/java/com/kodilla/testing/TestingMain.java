package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int addResult = calculator.add(2, 3);

        if (addResult == 5){
            System.out.println("Dodawanie - test OK");
        } else {
            System.out.println("Error!");
        }

        int subtractResult = calculator.subtract(6, 3);
        if (subtractResult == 3){
            System.out.println("Odejmowanie - test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
