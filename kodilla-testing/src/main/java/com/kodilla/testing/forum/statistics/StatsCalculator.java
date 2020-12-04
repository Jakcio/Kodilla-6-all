package com.kodilla.testing.forum.statistics;

import java.net.SocketOption;

public class StatsCalculator {

    public StatisticCounter calculateAdvStatistics(Statistics statistics) {
        double averagePostPerUser = 0;
        double averageCommentPerUser = 0;
        double averageCommentPerPost= 0;

        if(statistics.userNames().size() != 0) {
            averagePostPerUser = (double) statistics.postsCount() / (double) statistics.userNames().size();
            averageCommentPerUser = (double) statistics.commentsCount() / (double) statistics.userNames().size();
        }
        if(statistics.postsCount() != 0) {
            averageCommentPerPost = (double) statistics.commentsCount() / (double) statistics.postsCount();
        }
        return new StatisticCounter(statistics.userNames().size(), statistics.postsCount(), statistics.commentsCount(), averagePostPerUser, averageCommentPerUser, averageCommentPerPost);
    }
    public void showStatistics() {
        System.out.println(toString());
    }



}
