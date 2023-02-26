package com.bruno.launchevents.controllers;

import com.bruno.launchevents.dtos.UserDTO;
import com.bruno.launchevents.entities.User;
import com.bruno.launchevents.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody@Valid UserDTO dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(dtoToEntity(dto)));
    }

    @GetMapping("/")
    public List<User> users(){
        return service.findAllUsers();
    }

    private User dtoToEntity(UserDTO dto){
        User user = new User();
        BeanUtils.copyProperties(dto, user);
        return user;
    }
}
