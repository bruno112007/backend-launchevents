package com.bruno.launchevents.services.impl;

import com.bruno.launchevents.entities.User;
import com.bruno.launchevents.exceptions.EmailAlreadyExistsException;
import com.bruno.launchevents.repositories.UserRepository;
import com.bruno.launchevents.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;
    @Override
    public User save(User user) {
        if(repository.existsByEmail(user.getEmail())){
            throw new EmailAlreadyExistsException("This email already exists in our system.");
        }
        return repository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return repository.findAll();
    }
}
