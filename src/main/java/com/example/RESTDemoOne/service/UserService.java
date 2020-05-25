package com.example.RESTDemoOne.service;

import com.example.RESTDemoOne.model.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();
    void saveUser(User user);
}
