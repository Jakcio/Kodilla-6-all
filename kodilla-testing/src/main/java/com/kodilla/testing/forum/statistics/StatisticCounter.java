package com.kodilla.testing.forum.statistics;

public class StatisticCounter {
    private final int numberOfUsers;
    private final int numberOfPosts;
    private final int numberOfComments;
    private final double averagePostPerUser;
    private final double averageCommentPerUser;
    private final double averageCommentPerPost;

    public StatisticCounter(int numberOfUsers, int numberOfPosts, int numberOfComments, double averagePostPerUser, double averageCommentPerUser, double averageCommentPerPost) {
        this.numberOfUsers = numberOfUsers;
        this.numberOfPosts = numberOfPosts;
        this.numberOfComments = numberOfComments;
        this.averagePostPerUser = averagePostPerUser;
        this.averageCommentPerUser = averageCommentPerUser;
        this.averageCommentPerPost = averageCommentPerPost;
    }


    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public double getAverageCommentPerUser() {
        return averageCommentPerUser;
    }

    public double getAverageCommentPerPost() {
        return averageCommentPerPost;
    }



}
