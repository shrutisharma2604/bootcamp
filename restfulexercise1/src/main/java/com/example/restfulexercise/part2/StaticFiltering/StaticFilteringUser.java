package com.example.restfulexercise.part2.StaticFiltering;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class StaticFilteringUser {

    String username;

    @JsonIgnore
    String password;

    public StaticFilteringUser() {}

    public StaticFilteringUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}