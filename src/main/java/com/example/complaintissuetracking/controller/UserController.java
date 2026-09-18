package com.example.complaintissuetracking.controller;

import com.example.complaintissuetracking.entities.User;
import com.example.complaintissuetracking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public User addUser(
            @RequestBody User user){

        return service.save(user);
    }

    @GetMapping
    public List<User> getAllUsers(){

        return service.getAllUsers();
    }
}