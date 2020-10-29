package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        int actualYear = LocalDate.now().getYear();

        Map<Integer, ForumUser> theResultMapOfForum = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> (actualYear - user.getDateOfBirth().getYear()) >= 20)
                .filter(user -> user.getPostQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        theResultMapOfForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


        //Zadanie: upiększacz tekstów
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("abc", text -> "ABC" + text + "ABC");
        poemBeautifier.print();
        poemBeautifier.beautify("abc", String::toUpperCase);
        poemBeautifier.print();
        poemBeautifier.beautify("abc", s -> "++" + s);
        poemBeautifier.print();
        poemBeautifier.beautify("abc", String::toLowerCase);
        poemBeautifier.print();
    }
}