package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "Pablo", 'M', 1997, 3, 16, 32));
        theForumUserList.add(new ForumUser(2, "Thomas", 'M', 2001, 11, 12, 12));
        theForumUserList.add(new ForumUser(3, "Monica", 'F', 1992, 8, 22, 44));
        theForumUserList.add(new ForumUser(4, "Karolina", 'F', 1996, 1, 16, 11));
        theForumUserList.add(new ForumUser(5, "Michal", 'M', 1998, 12, 26, 0));
        theForumUserList.add(new ForumUser(6, "David", 'M', 2000, 2, 14, 1));
        theForumUserList.add(new ForumUser(7, "Lucius", 'M', 2002, 7, 4, 42));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
