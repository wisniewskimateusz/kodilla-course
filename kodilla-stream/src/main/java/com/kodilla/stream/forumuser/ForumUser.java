package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
     private final int id;
     private final String userName;
     private final char sex;
     private final LocalDate dateOfBirth;
     private final int postQuantity;

    public ForumUser(int id, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int postQuantity) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postQuantity = postQuantity;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
