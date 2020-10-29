package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private static ForumStatistics forumStatistics;

    @BeforeEach
    public void prepareMock() {
        forumStatistics = new ForumStatistics(statisticsMock);
    }

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    private List<String> generateUsersList(int numbersOfUsers) {
        List<String> resultUsersList = new ArrayList<>();
        for (int n = 1; n <= numbersOfUsers; n++){
            resultUsersList.add("a" + n);
        }
        return resultUsersList;
    }

    @Test
    void testCalculateAdvStatisticsOfZeroPosts() {
        //Given
        int quantityOfPosts = 0;
        int quantityOfComments = 0;
        when(statisticsMock.postsCount())
                .thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount())
                .thenReturn(quantityOfComments);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int resultOf0Posts = forumStatistics.getPostsQuantity();
        int resultOf0Comments = forumStatistics.getCommentsQuantity();
        // Then
        assertEquals(0, resultOf0Posts);
        assertEquals(0, resultOf0Comments);
    }

    @Test
    void testCalculateAdvStatisticsOf1000Posts() {
        //Given
        int quantityOfPosts = 1000;
        int quantityOfComments = 1000;
        when(statisticsMock.postsCount())
                .thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount())
                .thenReturn(quantityOfComments);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int resultOf1000Posts = forumStatistics.getPostsQuantity();
        int resultOf1000Comments = forumStatistics.getCommentsQuantity();
        // Then
        assertEquals(1000, resultOf1000Posts);
        assertEquals(1000, resultOf1000Comments);
    }

    @Test
    void testCalculateAdvStatisticsOfZeroComments() {
        //Given
        int quantityOfComments = 0;
        when(statisticsMock.commentsCount())
                .thenReturn(quantityOfComments);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int theResultOfComments = forumStatistics.getCommentsQuantity();
        // Then
        assertEquals(0, theResultOfComments);
    }

    @Test
    void testCalculateAdvStatisticsOfPostsMoreThanComments() {
        //Given
        int quantityOfPosts = 20;
        int quantityOfComments = 5;
        when(statisticsMock.postsCount())
                .thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount())
                .thenReturn(quantityOfComments);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double theResultOfPosts = forumStatistics.getAverageCommentsPerPosts();
        // Then
        assertEquals(4, theResultOfPosts);
    }

    @Test
    void testCalculateAdvStatisticsOfCommentsMoreThanPosts() {
        //Given
        int quantityOfPosts = 5;
        int quantityOfComments = 20;
        when(statisticsMock.postsCount())
                .thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount())
                .thenReturn(quantityOfComments);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double theResultOfComments = forumStatistics.getAverageCommentsPerPosts();
        // Then
        assertEquals(0.25, theResultOfComments);
    }

    @Test
    void testCalculateAdvStatisticsOf0Users() {
        //Given
        List<String> listOfUsers = new ArrayList<>();
        when(statisticsMock.usersNames())
                .thenReturn(listOfUsers);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int theResultOfUsersList = forumStatistics.getUsersQuantity();
        // Then
        assertEquals(0, theResultOfUsersList);
    }

    @Test
    void testCalculateAdvStatisticsOf100Users() {
        //Given
        List<String> listOfUsers = generateUsersList(100);
        when(statisticsMock.usersNames())
                .thenReturn(listOfUsers);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int theResultOfUsersList = forumStatistics.getUsersQuantity();
        // Then
        assertEquals(100, theResultOfUsersList);
    }
}