package ru.lesson.lessons;

import java.util.*;

/**
 * Created by Mergen on 16.03.2016.
 */
public class UserRunner {
    public static void main(String[] args){
        Map<String, User> users = new HashMap<String, User>();
        users.put("1",new User("1", "first"));
        users.put("2",new User("2", "two"));
        users.put("1",new User("1", "first"));

        for (Map.Entry<String, User> user  : users.entrySet()) {
            System.out.println(user);
        }
    }
}
