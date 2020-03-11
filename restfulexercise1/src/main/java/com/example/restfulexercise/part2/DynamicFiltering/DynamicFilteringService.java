package com.example.restfulexercise.part2.DynamicFiltering;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DynamicFilteringService {
    private static List<DynamicFilteringUser> userList = new ArrayList<>();

    public DynamicFilteringUser addUser(DynamicFilteringUser user) {
        userList.add(user);
        return user;
    }
}