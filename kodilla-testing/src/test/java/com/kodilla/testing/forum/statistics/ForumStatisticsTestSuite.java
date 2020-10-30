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
        int quantityOfPosts = 0;
        int quantityOfComments = 0;
        List<String> listOfUsers = new ArrayList<>();
        when(statisticsMock.postsCount())
                .thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount())
                .thenReturn(quantityOfComments);
        when(statisticsMock.usersNames())
                .thenReturn(listOfUsers);
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
        for (int n = 1; n <= numbersOfUsers; n++) {
            resultUsersList.add("a" + n);
        }
        return resultUsersList;
    }

    @Test
    void testCalculateAdvStatisticsOfZeroPosts() {
        //Given & When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(0, forumStatistics.getPostsQuantity());
        assertEquals(0, forumStatistics.getCommentsQuantity());
        assertEquals(0, forumStatistics.getUsersQuantity());

        assertEquals(0, forumStatistics.getAverageCommentsPerPosts());
        assertEquals(0, forumStatistics.getAverageCommentsPerUser());
        assertEquals(0, forumStatistics.getAveragePostsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsOf1000Posts() {
        //Given
        int quantityOfPosts = 1000;
        int quantityOfComments = 1000;
        List<String> listOfUsers = generateUsersList(200);
        when(statisticsMock.postsCount())
                .thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount())
                .thenReturn(quantityOfComments);
        when(statisticsMock.usersNames())
                .thenReturn(listOfUsers);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(1000, forumStatistics.getPostsQuantity());
        assertEquals(1000, forumStatistics.getCommentsQuantity());
        assertEquals(200, forumStatistics.getUsersQuantity());
        assertEquals(1, forumStatistics.getAverageCommentsPerPosts());
        assertEquals(5, forumStatistics.getAverageCommentsPerUser());
        assertEquals(5, forumStatistics.getAveragePostsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsOfPostsMoreThanComments() {
        //Given
        int quantityOfPosts = 20;
        int quantityOfComments = 5;
        List<String> listOfUsers = generateUsersList(20);
        when(statisticsMock.postsCount())
                .thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount())
                .thenReturn(quantityOfComments);
        when(statisticsMock.usersNames())
                .thenReturn(listOfUsers);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(20, forumStatistics.getPostsQuantity());
        assertEquals(5, forumStatistics.getCommentsQuantity());
        assertEquals(20, forumStatistics.getUsersQuantity());

        assertEquals(0.25, forumStatistics.getAverageCommentsPerPosts());
        assertEquals(0.25, forumStatistics.getAverageCommentsPerUser());
        assertEquals(1, forumStatistics.getAveragePostsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsOfCommentsMoreThanPosts() {
        //Given
        int quantityOfPosts = 5;
        int quantityOfComments = 20;
        List<String> listOfUsers = generateUsersList(5);
        when(statisticsMock.postsCount())
                .thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount())
                .thenReturn(quantityOfComments);
        when(statisticsMock.usersNames())
                .thenReturn(listOfUsers);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(5, forumStatistics.getPostsQuantity());
        assertEquals(20, forumStatistics.getCommentsQuantity());
        assertEquals(5, forumStatistics.getUsersQuantity());

        assertEquals(4, forumStatistics.getAverageCommentsPerPosts());
        assertEquals(4, forumStatistics.getAverageCommentsPerUser());
        assertEquals(1, forumStatistics.getAveragePostsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsOf0Users() {
        //Given
        int quantityOfPosts = 5;
        int quantityOfComments = 20;
        when(statisticsMock.postsCount())
                .thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount())
                .thenReturn(quantityOfComments);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(5, forumStatistics.getPostsQuantity());
        assertEquals(20, forumStatistics.getCommentsQuantity());
        assertEquals(0, forumStatistics.getUsersQuantity());

        assertEquals(4, forumStatistics.getAverageCommentsPerPosts());
        assertEquals(0, forumStatistics.getAverageCommentsPerUser());
        assertEquals(0, forumStatistics.getAveragePostsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsOf100Users() {
        //Given
        List<String> listOfUsers = generateUsersList(100);
        int quantityOfPosts = 200;
        int quantityOfComments = 400;
        when(statisticsMock.postsCount())
                .thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount())
                .thenReturn(quantityOfComments);
        when(statisticsMock.usersNames())
                .thenReturn(listOfUsers);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(200, forumStatistics.getPostsQuantity());
        assertEquals(400, forumStatistics.getCommentsQuantity());
        assertEquals(100, forumStatistics.getUsersQuantity());

        assertEquals(2, forumStatistics.getAverageCommentsPerPosts());
        assertEquals(4, forumStatistics.getAverageCommentsPerUser());
        assertEquals(2, forumStatistics.getAveragePostsPerUser());
    }
}