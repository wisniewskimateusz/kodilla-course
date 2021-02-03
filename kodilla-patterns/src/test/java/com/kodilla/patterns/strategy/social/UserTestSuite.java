package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User pablo = new Millenials("Pablo");
        User diablo = new YGeneration("Diablo");
        User tom = new ZGeneration("Tom");

        //When
        String pabloPublish = pablo.sharePost();
        System.out.println("Pablo post: " + pabloPublish);
        String diabloPublish = diablo.sharePost();
        System.out.println("Diablo post: " + diabloPublish);
        String tomPublish = tom.sharePost();
        System.out.println("Tom should: " + tomPublish);

        //Then
        assertEquals("Facebook", pabloPublish);
        assertEquals("Twitter", diabloPublish);
        assertEquals("Snapchat", tomPublish);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User pablo = new Millenials("Pablo");

        //When
        String pabloPublish = pablo.sharePost();
        System.out.println("Pablo post: " + pabloPublish);
        pablo.setSocialPublisher(new TwitterPublisher());
        pabloPublish = pablo.sharePost();
        System.out.println("Pablo post: " + pabloPublish);

        //Then
        assertEquals("Twitter", pabloPublish);
    }
}