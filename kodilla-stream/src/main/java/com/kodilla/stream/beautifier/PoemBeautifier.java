package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public static String beautify(String textToBeauty, PoemDecorator decorator) {
        return decorator.decorate(textToBeauty);
    }
}
