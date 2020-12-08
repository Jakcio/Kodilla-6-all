package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestCalculateAdvStatistics {
    public static List<String > listOfUsers = new ArrayList<>();

    @BeforeAll
    public static void beforeAll() {
        listOfUsers.add("abc");
        listOfUsers.add("acb");
        listOfUsers.add("cba");
        listOfUsers.add("bac");
    }
    @Mock
    private Statistics statisticsMock ;



    @Test
    void testWhenThousandPosts() {
        StatsCalculator stats = new StatsCalculator();

        when(statisticsMock.userNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(4);
        stats.calculateAdvStatistics(statisticsMock);

        Assertions.assertEquals(listOfUsers.size(), stats.calculateAdvStatistics(statisticsMock).getNumberOfUsers());
        Assertions.assertEquals(1000, stats.calculateAdvStatistics(statisticsMock).getNumberOfPosts());
        Assertions.assertEquals(4, stats.calculateAdvStatistics(statisticsMock).getNumberOfComments());
        Assertions.assertEquals(250, stats.calculateAdvStatistics(statisticsMock).getAveragePostPerUser(),1);
        Assertions.assertEquals(1, stats.calculateAdvStatistics(statisticsMock).getAverageCommentPerUser(),1);
        Assertions.assertEquals(1, stats.calculateAdvStatistics(statisticsMock).getAverageCommentPerPost(),1);



    }
    @Test
    void testWhenZeroComment() {
        StatsCalculator stats = new StatsCalculator();

        when(statisticsMock.userNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);
        stats.calculateAdvStatistics(statisticsMock);

        Assertions.assertEquals(listOfUsers.size(), stats.calculateAdvStatistics(statisticsMock).getNumberOfUsers());
        Assertions.assertEquals(10, stats.calculateAdvStatistics(statisticsMock).getNumberOfPosts());
        Assertions.assertEquals(0, stats.calculateAdvStatistics(statisticsMock).getNumberOfComments());
        Assertions.assertEquals(2.5, stats.calculateAdvStatistics(statisticsMock).getAveragePostPerUser());
        Assertions.assertEquals(0, stats.calculateAdvStatistics(statisticsMock).getAverageCommentPerUser(),1);
        Assertions.assertEquals(0, stats.calculateAdvStatistics(statisticsMock).getAverageCommentPerPost());
    }

    @Test
    void testWhenMoreCommentThanPosts() {
        StatsCalculator stats = new StatsCalculator();

        when(statisticsMock.userNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(200);
        stats.calculateAdvStatistics(statisticsMock);

        Assertions.assertEquals(listOfUsers.size(), stats.calculateAdvStatistics(statisticsMock).getNumberOfUsers());
        Assertions.assertEquals(20, stats.calculateAdvStatistics(statisticsMock).getNumberOfPosts());
        Assertions.assertEquals(200, stats.calculateAdvStatistics(statisticsMock).getNumberOfComments());
        Assertions.assertEquals(5, stats.calculateAdvStatistics(statisticsMock).getAveragePostPerUser());
        Assertions.assertEquals(50, stats.calculateAdvStatistics(statisticsMock).getAverageCommentPerUser(),1);
        Assertions.assertEquals(10, stats.calculateAdvStatistics(statisticsMock).getAverageCommentPerPost());
    }

    @Test
    void testWhenMorePostThanComment(){
        StatsCalculator stats = new StatsCalculator();


        when(statisticsMock.userNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(40);
        when(statisticsMock.commentsCount()).thenReturn(30);
        stats.calculateAdvStatistics(statisticsMock);

        Assertions.assertEquals(listOfUsers.size(), stats.calculateAdvStatistics(statisticsMock).getNumberOfUsers());
        Assertions.assertEquals(40, stats.calculateAdvStatistics(statisticsMock).getNumberOfPosts());
        Assertions.assertEquals(30, stats.calculateAdvStatistics(statisticsMock).getNumberOfComments());
        Assertions.assertEquals(10, stats.calculateAdvStatistics(statisticsMock).getAveragePostPerUser());
        Assertions.assertEquals(7.5, stats.calculateAdvStatistics(statisticsMock).getAverageCommentPerUser(),1);
        Assertions.assertEquals(0.75, stats.calculateAdvStatistics(statisticsMock).getAverageCommentPerPost());
    }

    @Test
    void testWhenZeroUsers() {
        StatsCalculator stats = new StatsCalculator();

        listOfUsers.clear();

        when(statisticsMock.userNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(20);
        stats.calculateAdvStatistics(statisticsMock);

        Assertions.assertEquals(listOfUsers.size(), stats.calculateAdvStatistics(statisticsMock).getNumberOfUsers());
        Assertions.assertEquals(100, stats.calculateAdvStatistics(statisticsMock).getNumberOfPosts());
        Assertions.assertEquals(20, stats.calculateAdvStatistics(statisticsMock).getNumberOfComments());
        Assertions.assertEquals(0, stats.calculateAdvStatistics(statisticsMock).getAveragePostPerUser(),1);
        Assertions.assertEquals(0, stats.calculateAdvStatistics(statisticsMock).getAverageCommentPerUser(),1);
        Assertions.assertEquals(0.2, stats.calculateAdvStatistics(statisticsMock).getAverageCommentPerPost());
    }
    @Test
    void testWhenHundredUsers() {
        StatsCalculator stats = new StatsCalculator();

        for(int i=5; i<=100;i++){
            listOfUsers.add("USER"+i);
        }

        when(statisticsMock.userNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(20);
        stats.calculateAdvStatistics(statisticsMock);

        Assertions.assertEquals(listOfUsers.size(), stats.calculateAdvStatistics(statisticsMock).getNumberOfUsers());
        Assertions.assertEquals(50, stats.calculateAdvStatistics(statisticsMock).getNumberOfPosts());
        Assertions.assertEquals(20, stats.calculateAdvStatistics(statisticsMock).getNumberOfComments());
        Assertions.assertEquals(0.5, stats.calculateAdvStatistics(statisticsMock).getAveragePostPerUser(),1);
        Assertions.assertEquals(0.2, stats.calculateAdvStatistics(statisticsMock).getAverageCommentPerUser(),1);
        Assertions.assertEquals(0.4, stats.calculateAdvStatistics(statisticsMock).getAverageCommentPerPost());

    }








}
