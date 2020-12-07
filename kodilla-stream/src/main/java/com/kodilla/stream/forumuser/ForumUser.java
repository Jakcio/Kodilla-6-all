package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private  final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int quantityOfPost;

    public ForumUser(int userId, String userName, char sex, LocalDate dateOfBirth, int quantityOfPost) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.quantityOfPost = quantityOfPost;
    }

    public int getUserId() {
        return userId;
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

    public int getQuantityOfPost() {
        return quantityOfPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", quantityOfPost=" + quantityOfPost +
                '}';
    }
}
