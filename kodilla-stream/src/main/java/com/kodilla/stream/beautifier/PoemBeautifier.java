package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    String textAfterBeauty;

    public String beautify(String textToBeauty, PoemDecorator decorator) {
        textAfterBeauty = decorator.decorate(textToBeauty);
        return textToBeauty;
    }

    public void print() {
        System.out.println(textAfterBeauty);
    }
}
