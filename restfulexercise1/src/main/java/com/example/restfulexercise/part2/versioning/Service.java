package com.example.restfulexercise.part2.versioning;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Service {

    static List<User> basicUserList = new ArrayList<>();
    static List<DetailedUser> detailedUsers = new ArrayList<>();
    static {
        basicUserList.add(new User("Shruti","Sharma"));
        detailedUsers.add(new DetailedUser("Shruti","asd","asd","22",1));
    }

    public List<User> getAllBasicuser() {
        return basicUserList;
    }


    public List<DetailedUser> getAllDetaileduser() {
        return detailedUsers;
    }

}