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

        if (usersQuantity != 0) {
            this.averageCommentsPerUser = (double) commentsQuantity / usersQuantity;
            this.averagePostsPerUser = (double) postsQuantity / usersQuantity;
        } else {
            this.averageCommentsPerUser = 0;
            this.averagePostsPerUser = 0;
        }

        if (postsQuantity != 0) {
            this.averageCommentsPerPosts = (double) commentsQuantity / postsQuantity;
        } else {
            this.averageCommentsPerPosts = 0;
        }
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
