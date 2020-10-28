package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private int averagePostsPerUser;
    private int averageCommentsPerUser;
    private int averageCommentsPerPosts;

    private Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersQuantity = statistics.usersNames().size();
        this.postsQuantity = statistics.postsCount();
        this.commentsQuantity = statistics.commentsCount();

        this.averageCommentsPerUser = commentsQuantity / usersQuantity;
        this.averagePostsPerUser = postsQuantity / usersQuantity;
        this.averageCommentsPerPosts = commentsQuantity / postsQuantity;
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
