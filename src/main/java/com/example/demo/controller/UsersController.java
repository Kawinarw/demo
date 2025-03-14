package com.example.demo.controller;

import com.example.demo.entity.UsersEntity;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UsersRepository;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ListIterator;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public List<UsersEntity> getAllUsers() {
        return usersService.findAll();
    }

    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable int id) {
        return "users";
    }

    @PostMapping("/users")
    public String addUser(@RequestBody UserModel user) {
        usersService.save(user.toEntity(user));
        return "Added user";
    }

    @PutMapping("/users/{userId}")
    public String updateUser(@PathVariable int userId, @RequestBody UsersEntity user) {
        return "users";
    }

    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable int userId) {
        return "users";
    }
}
