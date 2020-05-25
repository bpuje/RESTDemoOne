package com.example.RESTDemoOne.service;

import com.example.RESTDemoOne.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserServiceImpl implements UserService{

    private static List<User> userList;

    private static final AtomicLong counter = new AtomicLong();

    static {
        userList = memoryUsers();
    }

    @Override
    public List<User> findAllUsers() {
        return userList;
    }

    @Override
    public void saveUser(User user) {
        user.setId(counter.incrementAndGet());
        userList.add(user);
    }

    private static List<User> memoryUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User(counter.incrementAndGet(), "puje", "puje"));
        users.add(new User(counter.incrementAndGet(), "tugi", "tugi"));
        users.add(new User(counter.incrementAndGet(), "nergui", "nergui"));
        users.add(new User(counter.incrementAndGet(), "miga", "miga"));
        return users;
    }
}
