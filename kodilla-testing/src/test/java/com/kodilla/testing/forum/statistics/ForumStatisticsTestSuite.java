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
        //Given

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int resultOf0Posts = forumStatistics.getPostsQuantity();
        int resultOf0Comments = forumStatistics.getCommentsQuantity();
        int resultOfUsersList = forumStatistics.getUsersQuantity();
        // Then
        assertEquals(0, resultOf0Posts);
        assertEquals(0, resultOf0Comments);
        assertEquals(0, resultOfUsersList);
    }

    @Test
    void testCalculateAdvStatisticsOf1000Posts() {
        //Given
        int quantityOfPosts = 1000;
        int quantityOfComments = 1000;
        List<String> listOfUsers = generateUsersList(1000);
        when(statisticsMock.postsCount())
                .thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount())
                .thenReturn(quantityOfComments);
        when(statisticsMock.usersNames())
                .thenReturn(listOfUsers);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int resultOf1000Posts = forumStatistics.getPostsQuantity();
        int resultOf1000Comments = forumStatistics.getCommentsQuantity();
        int resultOfUsersList = forumStatistics.getUsersQuantity();

        // Then
        assertEquals(1000, resultOf1000Posts);
        assertEquals(1000, resultOf1000Comments);
        assertEquals(1000, resultOfUsersList);
    }

    @Test
    void testCalculateAdvStatisticsOfZeroComments() {
        //Given

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int theResultOf0Comments = forumStatistics.getCommentsQuantity();
        int resultOf0Posts = forumStatistics.getPostsQuantity();
        int resultOfUsersList = forumStatistics.getUsersQuantity();
        // Then
        assertEquals(0, theResultOf0Comments);
        assertEquals(0, resultOf0Posts);
        assertEquals(0, resultOfUsersList);
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
        double theResultOfPosts = forumStatistics.getAverageCommentsPerPosts();
        int resultOf20Posts = forumStatistics.getPostsQuantity();
        int resultOf5Comments = forumStatistics.getCommentsQuantity();
        int resultOf20UsersList = forumStatistics.getUsersQuantity();
        // Then
        assertEquals(4, theResultOfPosts);
        assertEquals(20, resultOf20Posts);
        assertEquals(5, resultOf5Comments);
        assertEquals(20, resultOf20UsersList);
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
        double theResultOfComments = forumStatistics.getAverageCommentsPerPosts();
        int resultOf5Posts = forumStatistics.getPostsQuantity();
        int resultOf20Comments = forumStatistics.getCommentsQuantity();
        int resultOf5UsersList = forumStatistics.getUsersQuantity();
        // Then
        assertEquals(0.25, theResultOfComments);
        assertEquals(5, resultOf5Posts);
        assertEquals(20, resultOf20Comments);
        assertEquals(5, resultOf5UsersList);
    }

    @Test
    void testCalculateAdvStatisticsOf0Users() {
        //Given
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int resultOfUsersList = forumStatistics.getUsersQuantity();
        int resultOf0Posts = forumStatistics.getPostsQuantity();
        int resultOf0Comments = forumStatistics.getCommentsQuantity();
        // Then
        assertEquals(0, resultOfUsersList);
        assertEquals(0, resultOf0Posts);
        assertEquals(0, resultOf0Comments);
    }

    @Test
    void testCalculateAdvStatisticsOf100Users() {
        //Given
        List<String> listOf100Users = generateUsersList(100);
        int quantityOf100Posts = 100;
        int quantityOf100Comments = 100;
        when(statisticsMock.postsCount())
                .thenReturn(quantityOf100Posts);
        when(statisticsMock.commentsCount())
                .thenReturn(quantityOf100Comments);
        when(statisticsMock.usersNames())
                .thenReturn(listOf100Users);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int resultOf100UsersList = forumStatistics.getUsersQuantity();
        int resultOf100Posts = forumStatistics.getPostsQuantity();
        int resultOf100Comments = forumStatistics.getCommentsQuantity();
        // Then
        assertEquals(100, resultOf100UsersList);
        assertEquals(100, resultOf100Posts);
        assertEquals(100, resultOf100Comments);
    }
}