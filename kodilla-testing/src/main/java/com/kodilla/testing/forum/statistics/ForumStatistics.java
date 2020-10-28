package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPosts;

    private Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPosts() {
        return averageCommentsPerPosts;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersQuantity = statistics.usersNames().size();
        this.postsQuantity = statistics.postsCount();
        this.commentsQuantity = statistics.commentsCount();

        this.averageCommentsPerUser = (double) usersQuantity / commentsQuantity;
        this.averagePostsPerUser = (double) usersQuantity / postsQuantity;
        this.averageCommentsPerPosts = (double) postsQuantity / commentsQuantity;
    }

    public String showStatistics() {
        return "User quantity = " + usersQuantity
                + "\nPosts quantity = " + postsQuantity
                + "\nComments quantity = " + commentsQuantity
                + "\nAverage posts per user = " + averagePostsPerUser
                + "\nAverage comments per user = " + averageCommentsPerUser
                + "\nAverage comments per posts = " + averageCommentsPerPosts;
    }
}
