package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(1, "Michael", 'M', LocalDate.of(2001, 5, 24), 13));
        listOfUsers.add(new ForumUser(2, "Erick", 'M', LocalDate.of(2003, 4, 11), 40));
        listOfUsers.add(new ForumUser(3, "Mark", 'M', LocalDate.of(1995, 2, 21), 24));
        listOfUsers.add(new ForumUser(4, "Suzi", 'F', LocalDate.of(1996, 2, 13), 5));
        listOfUsers.add(new ForumUser(5, "Jack", 'M', LocalDate.of(1997, 5, 2), 4));
        listOfUsers.add(new ForumUser(6, "Darko", 'M', LocalDate.of(2005, 7, 12), 2));
        listOfUsers.add(new ForumUser(7, "Alex", 'F', LocalDate.of(1990, 9, 1), 3));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfUsers);
    }
}
