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
        //ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        int quantityOfQuantity = 0;
        when(statisticsMock.postsCount())
                .thenReturn(quantityOfQuantity);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int resultOf0Posts = forumStatistics.getPostsQuantity();
        // Then
        assertEquals(0, resultOf0Posts);
    }

    @Test
    void testCalculateAdvStatisticsOf1000Posts() {
        //Given
        //ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        int quantityOfPosts = 1000;
        when(statisticsMock.postsCount())
                .thenReturn(quantityOfPosts);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int theResultOf1000Posts = forumStatistics.getPostsQuantity();
        // Then
        assertEquals(1000, theResultOf1000Posts);
    }

    @Test
    void testCalculateAdvStatisticsOfZeroComments() {
        //Given
        //ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
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
        //ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
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
        //ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
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
        //ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
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
        //ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
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