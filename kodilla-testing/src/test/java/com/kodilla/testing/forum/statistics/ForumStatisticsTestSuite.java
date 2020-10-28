package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import com.kodilla.testing.library.BookLibrary;
import com.kodilla.testing.library.LibraryUser;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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

    @Test
    void testCalculateAdvStatisticsOfZeroPosts() {
        //Given

        //When

        // Then

    }

    @Test
    void testCalculateAdvStatisticsOf1000Posts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        int resultListOfPosts = 1000;
        when(statisticsMock.postsCount())
                .thenReturn(resultListOfPosts);
        //When
        //int theListOfPosts = forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        //assertEquals(1000, theListOfPosts);
    }

    @Test
    void testCalculateAdvStatisticsOfZeroComments() {

    }
}
