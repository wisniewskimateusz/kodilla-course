package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String textToBeauty, PoemDecorator decorator) {
        return decorator.decorate(textToBeauty);
    }
}