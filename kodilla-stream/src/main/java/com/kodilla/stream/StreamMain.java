package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        //processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::multiplyAByB);

        //Zadanie: upiększacz tekstów
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("abc", s -> "ABC" + s + "ABC");
        poemBeautifier.print();
        poemBeautifier.beautify("abc", String::toUpperCase);
        poemBeautifier.print();
        poemBeautifier.beautify("abc", s -> "++" + s);
        poemBeautifier.print();
        poemBeautifier.beautify("abc", String::toLowerCase);
        poemBeautifier.print();
    }
}