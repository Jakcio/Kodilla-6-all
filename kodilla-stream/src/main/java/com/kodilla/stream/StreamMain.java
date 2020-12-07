package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theUserMap = forum.getUserList().stream().filter(user -> user.getSex() == 'M').filter(user -> user.getDateOfBirth().getYear() <2000).filter(user -> user.getQuantityOfPost() > 0).collect(Collectors.toMap(ForumUser::getUserId, user -> user));
        System.out.println("#elements: " + theUserMap.size());
        theUserMap.entrySet().stream().map(entry -> entry.getKey() + " " + entry.getValue()).forEach(System.out::println);


    }


}


