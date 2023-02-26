package com.bruno.launchevents.services;

import com.bruno.launchevents.entities.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> findAllUsers();
}
