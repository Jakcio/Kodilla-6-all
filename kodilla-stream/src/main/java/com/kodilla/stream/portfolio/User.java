package com.kodilla.stream.portfolio;

public final class User {
    private final String username;
    private final String realName;

    //konstruktor
    public User(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    //gettery
    public String getUsername() {
        return username;
    }
    public String getRealName() {
        return realName;
    }

    @Override
    public String toString() {
        return "User{"+"username='"+username+'}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return username.equals(user.username);
    }
}