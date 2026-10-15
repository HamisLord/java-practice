package com.project;


import com.project.models.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<User, Integer> users = new HashMap<>();

        User user = new User("Ахмед", 18);

        users.put(new User("Фатима", 16), 9);
        users.put(new User("Ибрагим", 19), 8);
        users.put(new User("Магомед", 20), 5);
        users.put(user, 10);

        System.out.println(users.get(user));

        user.setAge(19);

        System.out.println(users.get(user));


    }
}